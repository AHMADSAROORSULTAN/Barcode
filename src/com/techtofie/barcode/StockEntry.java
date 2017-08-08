package com.techtofie.barcode;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class StockEntry extends JFrame {

	private JPanel contentPane;
	private JTextField barcode_field;
	private JTextField model_field;
	private JTextField imei_field;
	private JTextField colour_field;
	private JTextField buying_field;
	private JTextField selling_field;
	private JComboBox<String> brand_field;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockEntry frame = new StockEntry();
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
	public StockEntry() {
		setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		initComponents();
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
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(358, 47, 722, 546);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Barcode\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(99, 54, 157, 28);
		panel.add(lblNewLabel);
		
		JLabel lblBrand = new JLabel("Brand\r\n");
		lblBrand.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBrand.setBounds(99, 111, 157, 28);
		panel.add(lblBrand);
		
		JLabel lblImei = new JLabel("IMEI");
		lblImei.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblImei.setBounds(99, 225, 157, 28);
		panel.add(lblImei);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblModel.setBounds(99, 168, 157, 28);
		panel.add(lblModel);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDate.setBounds(99, 333, 157, 28);
		panel.add(lblDate);
		
		JLabel lblColour = new JLabel("Colour");
		lblColour.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblColour.setBounds(99, 276, 157, 28);
		panel.add(lblColour);
		
		JLabel lblSellingPrice = new JLabel("Selling Price");
		lblSellingPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSellingPrice.setBounds(99, 446, 157, 28);
		panel.add(lblSellingPrice);
		
		JLabel lblBuyingPrice = new JLabel("Buying Price\r\n");
		lblBuyingPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBuyingPrice.setBounds(99, 389, 157, 28);
		panel.add(lblBuyingPrice);
		
		barcode_field = new JTextField();
		barcode_field.setBorder(new LineBorder(Color.BLACK));
		barcode_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				OrderDAO.onlyNumber(e);
				 if (barcode_field.getText().length() >= 20 ) 
			            e.consume(); 
			}
		});
		barcode_field.setHorizontalAlignment(SwingConstants.CENTER);
		barcode_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		barcode_field.setBounds(287, 53, 246, 28);
		panel.add(barcode_field);
		barcode_field.setColumns(10);
		
		model_field = new JTextField();
		model_field.setBorder(new LineBorder(Color.BLACK));
		model_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				OrderDAO.charUperCase(e);
				 if (model_field.getText().length() >= 15 ) 
			            e.consume(); 
			}
		});
		model_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		model_field.setHorizontalAlignment(SwingConstants.CENTER);
		model_field.setColumns(10);
		model_field.setBounds(287, 168, 246, 28);
		panel.add(model_field);
		
		imei_field = new JTextField();
		imei_field.setBorder(new LineBorder(Color.BLACK));
		imei_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				OrderDAO.charUperCase(e);
				 if (imei_field.getText().length() >= 20 ) 
			            e.consume(); 
			}
		});
		imei_field.setHorizontalAlignment(SwingConstants.CENTER);
		imei_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		imei_field.setColumns(10);
		imei_field.setBounds(287, 225, 246, 28);
		panel.add(imei_field);
		
		colour_field = new JTextField();
		colour_field.setBorder(new LineBorder(Color.BLACK));
		colour_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				OrderDAO.charUperCase(e);
				 if (colour_field.getText().length() >= 10 ) 
			            e.consume(); 
			}
		});
		colour_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		colour_field.setHorizontalAlignment(SwingConstants.CENTER);
		colour_field.setColumns(10);
		colour_field.setBounds(287, 276, 246, 28);
		panel.add(colour_field);
		
		buying_field = new JTextField();
		buying_field.setBorder(new LineBorder(Color.BLACK));
		buying_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (buying_field.getText().length()>=7 ) 
					 e.consume(); 
		       OrderDAO.onlyNumber(e);  
			}
		});
		buying_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		buying_field.setHorizontalAlignment(SwingConstants.CENTER);
		buying_field.setColumns(10);
		buying_field.setBounds(287, 389, 246, 28);
		panel.add(buying_field);
		
		selling_field = new JTextField();
		selling_field.setBorder(new LineBorder(Color.BLACK));
		selling_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (selling_field.getText().length()>=7 ) 
					 e.consume(); 
		       OrderDAO.onlyNumber(e);
			}
		});
		selling_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		selling_field.setHorizontalAlignment(SwingConstants.CENTER);
		selling_field.setColumns(10);
		selling_field.setBounds(287, 446, 246, 28);
		panel.add(selling_field);
		
		final JDateChooser date_field = new JDateChooser();
		date_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		date_field.setDateFormatString("yyyy-MM-dd");
		date_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		Date date=new Date();
		date_field.setDate(date);
		date_field.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		date_field.setBounds(287, 335, 246, 28);
		panel.add(date_field);
		
		final JComboBox<String> brand_field = new JComboBox<String>();
		brand_field.setBorder(new LineBorder(Color.BLACK));
		brand_field.setBounds(287, 118, 246, 28);
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
		panel.add(brand_field);
		
		JButton btnSave = new JButton("SAVE\r\n");
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection= null;
				PreparedStatement statement=null;
				ResultSet set1=null;
				if(imei_field.getText().length()==0
					||	barcode_field.getText().length()==0
					||	selling_field.getText().length()==0
					)
					
				{
			    	JOptionPane.showMessageDialog(null,"IMEI cannot be empty");
			    }
				else{
				try{
					connection=ConnectionUtility.getConnection();
					String stockentryDetails = "insert into barcodebilling.stockentry(barcode,brand,model,imei,Color,Date,BuyingPrice,SellingPrice)"
							
				      		+ " values(?,?,?,?,?,?,?,?) ";
					statement=connection.prepareStatement(stockentryDetails);
					String brandType=brand_field.getSelectedItem().toString();
				
					statement.setString(1,barcode_field.getText());
					statement.setString(2,brandType);
					statement.setString(3,model_field.getText());
					statement.setString(4,imei_field.getText());
					statement.setString(5,colour_field.getText());
					statement.setString(6,((JTextField)date_field.getDateEditor().getUiComponent()).getText());
					statement.setString(7,buying_field.getText());
					statement.setString(8,selling_field.getText());
					
					statement.execute();
					JOptionPane.showMessageDialog(null, "Saved");
					
				    barcode_field.setText("");
				    model_field.setText("");
				    imei_field.setText("");
				    colour_field.setText("");
				    buying_field.setText("");
				    selling_field.setText("");
				}
				
				catch (SQLException e) {
			  		// TODO Auto-generated catch block 
			  		e.printStackTrace();
			  	}
				finally {
			  		ConnectionUtility.closeConnection(connection, statement, set1);
			  	}
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setBackground(Color.LIGHT_GRAY);
		btnSave.setBounds(314, 491, 165, 44);
		panel.add(btnSave);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home hn =new Home();
				hn.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		button.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		button.setBackground(new Color(224, 255, 255));
		button.setBounds(656, 623, 216, 60);
		contentPane.add(button);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
