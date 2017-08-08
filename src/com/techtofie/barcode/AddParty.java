package com.techtofie.barcode;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;

import com.toedter.calendar.JDateChooser;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.UIManager;

public class AddParty extends JFrame {

	private JPanel contentPane;
	private JTextField mobile_field;
	private JTextField name_field;
	private JTextField gst_field;
	private JTextField billamount_field;
	private JTextField receivedamount_field;
	private JTextField due_field;
	private JTextField items_field;
	private JTextField remarks_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddParty frame = new AddParty();
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
	public AddParty() {
		
	 	setExtendedState(Frame.MAXIMIZED_BOTH);
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
		panel.setLayout(null);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Party Customer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(283, 11, 789, 683);
		contentPane.add(panel);
		
		JLabel lblPartyName = new JLabel("PARTY NAME\r\n");
		lblPartyName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPartyName.setBorder(null);
		lblPartyName.setBounds(38, 45, 216, 42);
		panel.add(lblPartyName);
		
		JLabel label_1 = new JLabel("MOBILE NO.");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(38, 166, 198, 31);
		panel.add(label_1);
		
		JLabel lblGstNo = new JLabel("GST NO.");
		lblGstNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGstNo.setBounds(38, 102, 198, 31);
		panel.add(lblGstNo);
		
		mobile_field = new JTextField();
		mobile_field.setHorizontalAlignment(SwingConstants.CENTER);
		mobile_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mobile_field.setColumns(10);
		mobile_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		mobile_field.setBounds(369, 162, 389, 31);
		panel.add(mobile_field);
		
		name_field = new JTextField();
		name_field.setHorizontalAlignment(SwingConstants.CENTER);
		name_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name_field.setColumns(10);
		name_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		name_field.setBounds(369, 46, 389, 31);
		panel.add(name_field);
		
		gst_field = new JTextField();
		gst_field.setHorizontalAlignment(SwingConstants.CENTER);
		gst_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gst_field.setColumns(10);
		gst_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		gst_field.setBounds(369, 102, 389, 31);
		panel.add(gst_field);
		
		JButton button = new JButton("BACK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Party pp=new Party();
				pp.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		button.setBounds(101, 634, 234, 42);
		panel.add(button);
		
		JLabel label_3 = new JLabel("TOTAL BILL AMOUNT");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(38, 292, 278, 31);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("TOTAL AMOUNT RECEIVED");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(38, 347, 278, 31);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("TOTAL DUE AMOUNT");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(38, 404, 216, 31);
		panel.add(label_5);
		
		billamount_field = new JTextField();
		billamount_field.setHorizontalAlignment(SwingConstants.CENTER);
		billamount_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		billamount_field.setColumns(10);
		billamount_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		billamount_field.setBounds(369, 288, 389, 31);
		panel.add(billamount_field);
		
		receivedamount_field = new JTextField();
		receivedamount_field.setHorizontalAlignment(SwingConstants.CENTER);
		receivedamount_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		receivedamount_field.setColumns(10);
		receivedamount_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		receivedamount_field.setBounds(369, 347, 389, 31);
		panel.add(receivedamount_field);
		
		due_field = new JTextField();
		due_field.setHorizontalAlignment(SwingConstants.CENTER);
		due_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		due_field.setColumns(10);
		due_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		due_field.setBounds(369, 404, 389, 31);
		panel.add(due_field);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(38, 529, 166, 31);
		panel.add(lblDate);
		
		final JDateChooser date_field = new JDateChooser();
		date_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		date_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Date date=new Date();
		date_field.setDate(date);
		date_field.setDateFormatString("yyyy-MM-dd");
		date_field.setBounds(369, 529, 389, 31);
		panel.add(date_field);
		
		items_field = new JTextField();
		items_field.setHorizontalAlignment(SwingConstants.CENTER);
		items_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		items_field.setColumns(10);
		items_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		items_field.setBounds(369, 223, 389, 31);
		panel.add(items_field);
		
		JLabel lblNoOfItems = new JLabel("NO. OF ITEMS");
		lblNoOfItems.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNoOfItems.setBounds(38, 223, 198, 31);
		panel.add(lblNoOfItems);
		
		JLabel lblPartyName_1 = new JLabel("PAYMENT MODE");
		lblPartyName_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPartyName_1.setBounds(38, 464, 216, 31);
		panel.add(lblPartyName_1);
		
		
		final JComboBox<String> payment_field = new JComboBox<String>();
		
		payment_field .addItem("CASH");
		payment_field .addItem("CARD");
		payment_field .addItem("CHECK");
		payment_field .addItem("NET BANKING");
		payment_field .addItem("OTHERS");
		payment_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		payment_field.setBounds(369, 464, 389, 31);
		payment_field.setBorder(new LineBorder(Color.BLACK));
		panel.add(payment_field);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(name_field .getText().length()==0
						||billamount_field.getText().length()==0)
					JOptionPane.showMessageDialog(null,"Please fill atleast customer name and bill amount");
				else{
					Connection connection= null;
					PreparedStatement statement=null;
					ResultSet set1=null;
					
					String paymentType=payment_field.getSelectedItem().toString();
					try{
						
					connection=ConnectionUtility.getConnection();
					String customerdetails = "insert into barcodebilling.party(name,gst_no,mobile,no_items,bill_amount,received_amount,due_amount,payment_mode,date,remarks)"
					+ " values(?,?,?,?,?,?,?,?,?,?) ";

					statement=connection.prepareStatement(customerdetails);
					statement.setString(1,name_field.getText());
					statement.setString(2,gst_field.getText());
					statement.setString(3,mobile_field.getText());
					statement.setString(4,items_field.getText());
					statement.setString(5, billamount_field.getText());
					statement.setString(6, receivedamount_field.getText());
					statement.setString(7, due_field.getText());
					statement.setString(8, paymentType);
					statement.setString(9,((JTextField)date_field.getDateEditor().getUiComponent()).getText());
					statement.setString(10, remarks_field.getText());

					statement.execute();
					}
					catch (SQLException e) {
					// TODO Auto-generated catch block 
					e.printStackTrace();
					}
					finally {
					ConnectionUtility.closeConnection(connection, statement, set1);
					}

				JOptionPane.showMessageDialog(null,"Saved");
				name_field.setText("");
				mobile_field.setText("");
				gst_field.setText("");
				items_field.setText("");
				billamount_field.setText("");
				receivedamount_field.setText("");
				due_field.setText("");
				remarks_field.setText("");

				
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnSave.setBounds(441, 634, 234, 42);
		panel.add(btnSave);
		
		JLabel lblRemarks = new JLabel("REMARKS");
		lblRemarks.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRemarks.setBounds(38, 583, 166, 31);
		panel.add(lblRemarks);
		
		remarks_field = new JTextField();
		remarks_field.setHorizontalAlignment(SwingConstants.CENTER);
		remarks_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		remarks_field.setColumns(10);
		remarks_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		remarks_field.setBounds(369, 583, 389, 31);
		panel.add(remarks_field);
		
		
			
		
	}
}
