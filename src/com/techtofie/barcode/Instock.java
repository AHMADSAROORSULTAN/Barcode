package com.techtofie.barcode;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.border.TitledBorder;
import javax.swing.table.JTableHeader;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;


public class Instock extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instock frame = new Instock();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Instock() {
		initComponents();
		setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		 this.addWindowListener(new WindowAdapter() {
		      @Override
		      public void windowClosing(WindowEvent event) {
		        Closingwindow.confirmAndExit();
		      }
		    });
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		final JComboBox<String> brand_field = new JComboBox<String>();
		brand_field.setBounds(555, 76, 265, 37);
		brand_field.addItem("APPLE");
		brand_field.addItem("ASUS");
		brand_field.addItem("HTC");
		brand_field.addItem("HUAWEI");
		brand_field.addItem("LENOVO");
		brand_field.addItem("LG");
		brand_field.addItem("LYF");
		brand_field.addItem("MICROMAX");
		brand_field.addItem("MOTOROLA");
		brand_field.addItem("ONEPLUS");
		brand_field.addItem("PANASONIC");
		brand_field.addItem("SAMSUNG");
		brand_field.addItem("VIVO");
		brand_field.addItem("XIOMI");
		brand_field.addItem("XOLO");
		brand_field.addItem("ZTE");
		
		brand_field.addItem("Others");
		contentPane.setLayout(null);
		contentPane.add(brand_field);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection= null;
				PreparedStatement statement=null;
				ResultSet set=null;
				String value="1";
		        String BrandType=brand_field.getSelectedItem().toString();
		        if(BrandType=="APPLE" ||BrandType=="ASUS"||BrandType=="HTC"||
		        		BrandType=="HUAWEI" ||BrandType=="LENOVO"||BrandType=="LG"||
		        		BrandType=="LYF" ||BrandType=="MICROMAX"||BrandType=="MOTOROLA"||
		        		BrandType=="ONEPLUS" ||BrandType=="PANASONIC"||BrandType=="SAMSUNG"||
		        		BrandType=="VIVO" ||BrandType=="XIOMI"||BrandType=="XOLO"||
		        		BrandType=="ZTE" ||BrandType=="OTHERS"){
				try{
					connection=ConnectionUtility.getConnection();
		        String stockdetails = "select Barcode,Brand,Model,IMEI,BuyingPrice,SellingPrice,Date,Color,Available from barcodebilling.stockentry where Brand='"+BrandType+"'and available='"+value+"'";
				statement=connection.prepareStatement(stockdetails);
				set=statement.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(set));
			
				}
				catch (Exception e) {
			  		// TODO Auto-generated catch block 
			  		e.printStackTrace();
			  	}
				finally {
			  		ConnectionUtility.closeConnection(connection, statement, set);
			  	}
		       }
			}
		});
		btnNewButton.setBounds(632, 124, 136, 31);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(284, 201, 860, 374);
		scrollPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "Stock Table", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JTableHeader header = table.getTableHeader();
		 table.getTableHeader().setPreferredSize(new Dimension(30,30));
		  header.setBackground(Color.yellow);
		  table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 20));
		  table.getTableHeader().setForeground(Color.BLUE);
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("Back");
		button.setBounds(632, 599, 216, 60);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home hn=new Home();
				hn.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		button.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		button.setBackground(new Color(224, 255, 255));
		contentPane.add(button);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
