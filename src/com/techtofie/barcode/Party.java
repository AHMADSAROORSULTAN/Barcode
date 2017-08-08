package com.techtofie.barcode;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import com.toedter.calendar.JDateChooser;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class Party extends JFrame {

	private JPanel contentPane;
	private JTextField search_field;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Party frame = new Party();
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
	public Party() {
		
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
		
		
		
		final JDateChooser todate_field = new JDateChooser();
		todate_field.setBounds(776, 101, 181, 29);
		todate_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		todate_field.setDateFormatString("yyyy-MM-dd");
		contentPane.add(todate_field);
		
		JLabel label = new JLabel("To");
		label.setBounds(663, 101, 121, 16);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("From");
		label_1.setBounds(663, 62, 121, 16);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label_1);
		
		final JDateChooser fromdate_field = new JDateChooser();
		fromdate_field.setBounds(776, 52, 181, 26);
		fromdate_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fromdate_field.setDateFormatString("yyyy-MM-dd");
		contentPane.add(fromdate_field);
		
		JLabel lblNewLabel = new JLabel("Search by Party");
		lblNewLabel.setBounds(241, 67, 149, 29);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		search_field = new JTextField();
		search_field.setBounds(400, 67, 197, 40);
		contentPane.add(search_field);
		search_field.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD NEW");
		btnNewButton.setBounds(1027, 62, 136, 56);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddParty ap=new AddParty();
				ap.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Party Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(151, 211, 1035, 385);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton button_1 = new JButton("Back");
		button_1.setBounds(601, 625, 194, 54);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home hn =new Home();
				hn.setVisible(true);
			}
		});
		button_1.setForeground(new Color(0, 100, 0));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(button_1);
		
		Button search = new Button("Search\r\n");
		search.setBounds(478, 145, 181, 40);
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection= null;
				PreparedStatement statement=null;
				ResultSet set=null;
				String from=((JTextField)fromdate_field.getDateEditor().getUiComponent()).getText();
		        String to=((JTextField)todate_field.getDateEditor().getUiComponent()).getText();
				 String query = "SELECT * from barcodebilling.party WHERE name LIKE '%" + search_field.getText() + "%' or date between '"+from+"' and '"+to+"'";
		      
				try{
					connection=ConnectionUtility.getConnection();
		      
				statement=connection.prepareStatement(query);
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
		);
		contentPane.setLayout(null);
		search.setFont(new Font("Dialog", Font.BOLD, 20));
		search.setBackground(new Color(176, 224, 230));
		contentPane.add(search);
	}
}
