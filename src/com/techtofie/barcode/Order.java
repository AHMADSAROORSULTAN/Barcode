package com.techtofie.barcode;
//CREATED BY AHMAD SAROOR SULTAN
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;

import com.itextpdf.text.Image;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;
import java.io.OutputStream;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.pdf.security.LtvVerification.Level;
import com.toedter.calendar.JDateChooser;
import com.itextpdf.text.Font.FontStyle;

import java.io.*;
import java.awt.Frame;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import net.proteanit.sql.DbUtils;

import java.awt.Dialog.ModalExclusionType;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JComboBox;

import sun.tools.jar.Main;


public class Order extends JFrame {

	private JPanel contentPane;
	public JTextField name_field;
	private JTextField bill_no;
	private JTextField int_toword;
	private JTextField remarks_field;
	private JTextField discount_field;
	private JTextField vat_percent;
	private JTextField bill_amount;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					Order frame = new Order();
					frame.setVisible(true);
				   
				    frame.setResizable(false);
				
			}

			
		});
		
	}

	/**
	 * Create the frame.
	 */
	//CREATED BY AHMAD SAROOR SULTAN
	
	Connection connection=null;   
	private  JTextField imei_field;
	private JTextField brand_field;
	private JTextField model_field;
	private JTextField colour_field;
	private JTextField address_field;
	private JTextField mobile_field;
	private JTextField amount_field;
	private JTextField taxable_amount;
	private JTable table;
	private JTextField vat_amount;
	private JTextField trx_field;
	private JTextField sumpcs_field;
	private JTextField barcode_field;
	
	   Order() {
	   	
	   	
	   	setExtendedState(Frame.MAXIMIZED_BOTH);
		initComponents();
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		 this.addWindowListener(new WindowAdapter() {
		      @Override
		      public void windowClosing(WindowEvent event) {
		        Closingwindow.confirmAndExit();
		      }
		    });

		
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.setBackground(Color.WHITE);
		contentPane.setOpaque(false);
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setForeground(SystemColor.text);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("MOBILE MAGIC");
		lblNewLabel.setBounds(39, 0, 148, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel lblEmailKmjikalamandirltdcom = new JLabel("EMAIL: meetheenine2nine@gmail.com");
		lblEmailKmjikalamandirltdcom.setBounds(39, 23, 287, 22);
		lblEmailKmjikalamandirltdcom.setVerticalAlignment(SwingConstants.TOP);
		lblEmailKmjikalamandirltdcom.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 46, 783, 114);
		panel.setMaximumSize(new Dimension(2480, 3508));
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel.setLayout(null);
		
		JLabel lblShrismt = new JLabel("Shri/Smt   :");
		lblShrismt.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShrismt.setBounds(12, 15, 101, 26);
		panel.add(lblShrismt);
		
		name_field = new JTextField();
		name_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				OrderDAO.charUperCase(e);
			   if (name_field.getText().length() >= 30 ) 
		            e.consume(); 
				OrderDAO.noNumber(e);
			}
		});
		name_field.setFont(new Font("Tahoma", Font.BOLD, 14));
		name_field.setBorder(null);
		name_field.setBounds(114, 17, 335, 22);
		panel.add(name_field);
		name_field.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address     :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(12, 53, 91, 26);
		panel.add(lblAddress);
		
		JLabel lblPhoneNo = new JLabel("Phone No   :");
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNo.setBounds(12, 91, 91, 11);
		panel.add(lblPhoneNo);
		
		address_field = new JTextField();
		address_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				OrderDAO.charUperCase(e);
				 if (address_field.getText().length() >= 85 ) 
			            e.consume(); 
			}
		});
		address_field.setFont(new Font("Tahoma", Font.BOLD, 14));
		address_field.setBorder(null);
		address_field.setBounds(114, 56, 658, 22);
		panel.add(address_field);
		address_field.setColumns(1);
		
		mobile_field = new JTextField();
		mobile_field.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				
				 if (mobile_field.getText().length()>=10  ) 
					 e.consume(); 
		       OrderDAO.onlyNumber(e);   
			}
		});
		mobile_field.setFont(new Font("Tahoma", Font.BOLD, 14));
		mobile_field.setBorder(null);
		mobile_field.setBounds(142, 86, 186, 22);
		panel.add(mobile_field);
		mobile_field.setColumns(10);
		
		JLabel label_2 = new JLabel("+91");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(105, 87, 39, 19);
		panel.add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(848, 47, 400, 114);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_1.setLayout(null);
		
		JLabel lblDate = new JLabel("Date    :\r\n");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(26, 26, 63, 26);
		panel_1.add(lblDate);
		
		JLabel lblBillNo = new JLabel("Bill No :");
		lblBillNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBillNo.setBounds(26, 76, 63, 26);
		panel_1.add(lblBillNo);
		
		bill_no = new JTextField();
		bill_no.setBackground(Color.WHITE);
		bill_no.setDisabledTextColor(Color.WHITE);
		bill_no.setEditable(false);
		bill_no.setFont(new Font("Tahoma", Font.BOLD, 15));
		bill_no.setBounds(107, 78, 222, 24);
		panel_1.add(bill_no);
		bill_no.setBorder(null);
		bill_no.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(47, 525, 897, 44);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(SystemColor.textHighlightText);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Amount in Words :");
		lblNewLabel_2.setBounds(new Rectangle(1, 0, 1, 0));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(12, 13, 145, 16);
		panel_2.add(lblNewLabel_2);
		
		int_toword = new JTextField();
		int_toword.setDisabledTextColor(Color.BLACK);
		int_toword.setForeground(Color.DARK_GRAY);
		int_toword.setBackground(Color.WHITE);
		int_toword.setEnabled(false);
		
		int_toword.setFont(new Font("Tahoma", Font.BOLD, 13));
		int_toword.setColumns(20);
		int_toword.setBorder(null);
		int_toword.setBounds(153, 12, 734, 20);
		panel_2.add(int_toword);
		
		remarks_field = new JTextField();
		remarks_field.setBounds(145, 593, 652, 22);
		remarks_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
					OrderDAO.charUperCase(e);
					 if (address_field.getText().length() >= 60 ) 
				            e.consume(); 
			}
		});
		remarks_field.setFont(new Font("Tahoma", Font.PLAIN, 13));
		remarks_field.setColumns(10);
		remarks_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		discount_field = new JTextField();
		discount_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ev) {
				if(ev.getKeyCode()==KeyEvent.VK_ENTER){
					 OrderDAO.sum(table, taxable_amount);
						OrderDAO.taxAmount(taxable_amount, vat_percent, vat_amount);
						OrderDAO.billAmount(discount_field,taxable_amount, vat_amount, bill_amount,int_toword);   
					
					
				}
			}
		});
		discount_field.setBounds(1105, 525, 143, 17);
		discount_field.setHorizontalAlignment(SwingConstants.CENTER);
		discount_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		discount_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		discount_field.setColumns(10);
		
		vat_percent = new JTextField();
		vat_percent.setBounds(1105, 542, 143, 17);
		vat_percent.setHorizontalAlignment(SwingConstants.CENTER);
		vat_percent.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		vat_percent.setColumns(10);
		vat_percent.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		bill_amount = new JTextField();
		bill_amount.setBounds(1105, 593, 143, 17);
		bill_amount.setHorizontalAlignment(SwingConstants.CENTER);
		bill_amount.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
				
		bill_amount.setColumns(10);
		bill_amount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
        
		imei_field = new JTextField();
		imei_field.setVisible(false);
		
		
		
		imei_field.setBounds(839, 203, 46, 35);

		imei_field.setHorizontalAlignment(SwingConstants.CENTER);
		imei_field.setForeground(Color.BLACK);
		imei_field.setColumns(20);
		imei_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		imei_field.setBackground(Color.WHITE);
		
		brand_field = new JTextField();
		brand_field.setVisible(false);
		brand_field.setBounds(919, 203, 46, 35);
		brand_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				OrderDAO.charUperCase(e);
				if (brand_field.getText().length()>=4  ) 
					 e.consume(); 
				 OrderDAO.noNumber(e);
			}
		});
		brand_field.setHorizontalAlignment(SwingConstants.CENTER);
		brand_field.setForeground(Color.BLACK);
		brand_field.setColumns(10);
		brand_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		brand_field.setBackground(Color.WHITE);
		
		model_field = new JTextField();
		model_field.setVisible(false);
		model_field.setBounds(1003, 203, 64, 35);
		model_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				OrderDAO.charUperCase(e);
				if (model_field.getText().length()>=10  ) 
					 e.consume(); 
				 OrderDAO.noNumber(e);
			}
		});
		model_field.setHorizontalAlignment(SwingConstants.CENTER);
		model_field.setForeground(Color.BLACK);
		model_field.setColumns(10);
		model_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		model_field.setBackground(Color.WHITE);
		
		colour_field = new JTextField();
		colour_field.setVisible(false);
		colour_field.setBounds(1095, 203, 46, 35);
		colour_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				OrderDAO.charUperCase(e);
				if (colour_field.getText().length()>=10 ) 
					 e.consume(); 
				OrderDAO.noNumber(e);
			}
		});
		colour_field.setHorizontalAlignment(SwingConstants.CENTER);
		colour_field.setForeground(Color.BLACK);
		colour_field.setColumns(10);
		colour_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		colour_field.setBackground(Color.WHITE);
		
		final JDateChooser billing_date = new JDateChooser();
		billing_date.setBackground(new Color(255, 255, 255));
		billing_date.getCalendarButton().setBorder(null);
		billing_date.setBorder(null);
		billing_date.setFont(new Font("Tahoma", Font.BOLD, 15));
		Date date=new Date();
		billing_date.setDate(date);
		
		billing_date.setDateFormatString("yyyy-MM-dd");
		billing_date.setBounds(106, 30, 174, 22);
		panel_1.add(billing_date);
		  table = new JTable();
		  table.setBounds(39, 279, 1202, 206);
		  table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		  table.setRowHeight(22);
		  table.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent arg0) {
		  	
		  	   	int row=table.getSelectedRow();
		  	   	String value1=(table.getModel().getValueAt(row,1).toString());
		  	   	String value2=(table.getModel().getValueAt(row,2).toString());
		  	   	String value3=(table.getModel().getValueAt(row,3).toString());
		  	   	String value4=(table.getModel().getValueAt(row,4).toString());
		  	   	String value5=(table.getModel().getValueAt(row,5).toString());
		  	   	String value6=(table.getModel().getValueAt(row,6).toString());
		  	   
		  	   			
		  	   			
		  	   			imei_field.setText(value1);
		  	            brand_field.setText(value2);
		  	   			model_field.setText(value3);		
		  	   			colour_field.setText(value4);
		  	   			amount_field.setText(value5);
		  	   			trx_field.setText(value6);
		  	}
		  });
		  table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		model=new DefaultTableModel();
		Object[] columns={"S.no","IMEI","BRAND","MODEL","COLOUR","AMOUNT"};
		//final  Object[] row =new Object[10];  
			model.setColumnIdentifiers(columns);
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					" S.no", "IMEI", "BRAND", "MODEL", "COLOUR", "AMOUNT", ""
				}
			) {
				Class[] columnTypes = new Class[] {
					Object.class, Object.class, Object.class, String.class, Object.class, Object.class, Object.class
				};
				public Class<?> getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			table.getColumnModel().getColumn(0).setPreferredWidth(30);
			table.getColumnModel().getColumn(1).setResizable(false);
			table.getColumnModel().getColumn(1).setPreferredWidth(187);
			table.getColumnModel().getColumn(2).setResizable(false);
			table.getColumnModel().getColumn(2).setPreferredWidth(64);
			table.getColumnModel().getColumn(3).setResizable(false);
			table.getColumnModel().getColumn(3).setPreferredWidth(64);
			table.getColumnModel().getColumn(4).setResizable(false);
			table.getColumnModel().getColumn(5).setResizable(false);
			table.getColumnModel().getColumn(5).setPreferredWidth(80);
			table.getColumnModel().getColumn(6).setResizable(false);
			table.getColumnModel().getColumn(6).setPreferredWidth(0);
			table.getColumnModel().getColumn(6).setMinWidth(0);
			table.getColumnModel().getColumn(6).setMaxWidth(0);
			DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
			rightRenderer.setHorizontalAlignment( JLabel.CENTER );
				
				
		//	 JScrollPane scrollPane = new JScrollPane(table);
		JLabel lblItems = new JLabel("IMEI");
		lblItems.setVisible(false);
		lblItems.setBounds(839, 181, 64, 16);
		lblItems.setForeground(new Color(153, 50, 204));
		
		JLabel lblCrt = new JLabel("BRAND");
		lblCrt.setVisible(false);
		lblCrt.setBounds(895, 181, 56, 16);
		lblCrt.setForeground(new Color(153, 50, 204));
		
		JLabel lblPcs = new JLabel("MODEL");
		lblPcs.setVisible(false);
		lblPcs.setBounds(1001, 181, 56, 16);
		lblPcs.setForeground(new Color(153, 50, 204));
		
		JLabel lblMetalRate = new JLabel("COLOUR");
		lblMetalRate.setVisible(false);
		lblMetalRate.setBounds(1067, 181, 74, 16);
		lblMetalRate.setForeground(new Color(153, 50, 204));
		
		JLabel lblAmount = new JLabel("AMOUNT");
		lblAmount.setVisible(false);
		lblAmount.setBounds(1151, 183, 97, 16);
		lblAmount.setForeground(new Color(153, 50, 204));
		
		amount_field = new JTextField();
		amount_field.setVisible(false);
		amount_field.setBounds(1184, 203, 64, 35);
		
								
		amount_field.setHorizontalAlignment(SwingConstants.CENTER);
		amount_field.setForeground(Color.BLACK);
		amount_field.setColumns(10);
		amount_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		amount_field.setBackground(Color.WHITE);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(1253, 358, 74, 35);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				if(i>=0){
					Connection connection=null;
					PreparedStatement statement=null;
					ResultSet set=null;
					//String value3=trx_field.getText();
					try{
						connection=ConnectionUtility.getConnection();
						String delete1 ="delete from barcodebilling.transactions WHERE trx_id=?";
						statement=connection.prepareStatement(delete1);
						statement.setString(1, trx_field.getText());
                        statement.executeUpdate();
						JOptionPane.showMessageDialog(null, "Deleted");
					
					
					    String value1=imei_field.getText();
					    String value2="1";
						String availableUpdate ="update barcodebilling.stockentry set available='"+value2+"' where imei='"+value1+"'";
						statement=connection.prepareStatement(availableUpdate);
						statement.executeUpdate();
						
					
						
						
						JOptionPane.showMessageDialog(null, "updated2");
						int row=table.getSelectedRows()[0];
						String Click=(table.getModel().getValueAt(row,1).toString());
						   model.removeRow(i);
//						   
//						   for(int y=row ;y<model.getRowCount();y++){
//
//						          model.setValueAt(y, y, 0); //setValueAt(data,row,column)
//						       }
//						   
						   model.setRowCount(0);
						   statement  = connection
									.prepareStatement("SELECT cust_id FROM barcodebilling.customer order by cust_id desc limit 1");
							 set = statement .executeQuery();
							int custId = 0;
							while (set.next()) {
								custId = set.getInt("cust_id");

				           
							List<OrderConfigure> trxList=OrderDAO.getTransactions(table, custId);
							if(trxList!=null && trxList.size()>0){
								model = (DefaultTableModel) table.getModel();
								for(OrderConfigure billConfigure:trxList){
								
									model.insertRow(model.getRowCount(),new Object[] {
										 billConfigure.getSno(),
                                         billConfigure.getImei(),
                                         billConfigure.getBrand(),
                                         billConfigure.getModel(),
                                         billConfigure.getColour(),
                                         billConfigure.getAmount(),
                                         billConfigure.getTrxId()
										                                              });
									table.getRowCount();
							
								}
							}
							

							OrderDAO.sum(table, taxable_amount);
							OrderDAO.taxAmount(taxable_amount, vat_percent, vat_amount);
							OrderDAO.billAmount(discount_field,taxable_amount, vat_amount, bill_amount, int_toword);
							trx_field.setText("");
							OrderDAO.emptyJtextFields( barcode_field,imei_field, brand_field, model_field, 
						    		 colour_field, amount_field);
							}	
					}
					
					catch(Exception e){
						JOptionPane.showMessageDialog(null,e);
					  }
					finally{
						ConnectionUtility.closeConnection(connection, statement, set);
					}
				
					  
				}
			}
		});
		btnDelete.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		
		OrderDAO.randomNumbers(bill_no);
		
	
		OrderDAO.taxVat(vat_percent);
        
        JLabel label_12 = new JLabel("AMOUNT");
        label_12.setBounds(996, 249, 245, 28);
        label_12.setHorizontalAlignment(SwingConstants.CENTER);
        label_12.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_12.setForeground(new Color(153, 50, 204));
        label_12.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        taxable_amount = new JTextField();
        taxable_amount.setBounds(1105, 559, 143, 17);
        taxable_amount.setHorizontalAlignment(SwingConstants.CENTER);
        taxable_amount.setFont(new Font("Tahoma", Font.BOLD, 15));
        taxable_amount.setColumns(10);
        taxable_amount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        
        vat_amount = new JTextField();
        vat_amount.setBounds(1105, 576, 143, 17);
        vat_amount.setHorizontalAlignment(SwingConstants.CENTER);
        vat_amount.setFont(new Font("Tahoma", Font.BOLD, 15));
        vat_amount.setColumns(10);
        vat_amount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        
        JLabel lblRemarks = new JLabel("REMARKS");
        lblRemarks.setBounds(39, 593, 88, 22);
        lblRemarks.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblRemarks.setBorder(null);
        
        trx_field = new JTextField();
        trx_field.setBounds(12, 315, 22, 22);
        trx_field.setVisible(false);
        trx_field.setColumns(10);
        contentPane.setLayout(null);
        contentPane.add(lblNewLabel);
        contentPane.add(lblEmailKmjikalamandirltdcom);
        contentPane.add(panel);
        contentPane.add(panel_1);
        contentPane.add(lblItems);
        contentPane.add(lblCrt);
        contentPane.add(lblPcs);
        contentPane.add(lblMetalRate);
        contentPane.add(lblAmount);
        contentPane.add(imei_field);
        contentPane.add(brand_field);
        contentPane.add(model_field);
        contentPane.add(colour_field);
        contentPane.add(amount_field);
        contentPane.add(label_12);
        contentPane.add(trx_field);
        contentPane.add(table);
        contentPane.add(btnDelete);
        contentPane.add(panel_2);
        contentPane.add(discount_field);
        contentPane.add(vat_percent);
        contentPane.add(taxable_amount);
        contentPane.add(vat_amount);
        contentPane.add(bill_amount);
        contentPane.add(lblRemarks);
        contentPane.add(remarks_field);
        
        JButton button = new JButton("Back");
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        		Home hn=new Home();
        		hn.setVisible(true);
        	}
        });
        button.setForeground(new Color(0, 100, 0));
        button.setFont(new Font("Tahoma", Font.BOLD, 20));
        button.setBounds(404, 640, 194, 44);
        contentPane.add(button);
       
        
        JLabel label_3 = new JLabel("S.NO.");
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        label_3.setForeground(new Color(153, 50, 204));
        label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_3.setBounds(40, 249, 69, 28);
        contentPane.add(label_3);
        
        JLabel lblImei = new JLabel("IMEI");
        lblImei.setHorizontalAlignment(SwingConstants.CENTER);
        lblImei.setForeground(new Color(153, 50, 204));
        lblImei.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblImei.setBorder(new LineBorder(new Color(0, 0, 0)));
        lblImei.setBounds(109, 249, 262, 28);
        contentPane.add(lblImei);
        
        JLabel lblBrand = new JLabel("BRAND");
        lblBrand.setHorizontalAlignment(SwingConstants.CENTER);
        lblBrand.setForeground(new Color(153, 50, 204));
        lblBrand.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblBrand.setBorder(new LineBorder(new Color(0, 0, 0)));
        lblBrand.setBounds(371, 249, 210, 28);
        contentPane.add(lblBrand);
        
        JLabel lblModel = new JLabel("MODEL");
        lblModel.setHorizontalAlignment(SwingConstants.CENTER);
        lblModel.setForeground(new Color(153, 50, 204));
        lblModel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblModel.setBorder(new LineBorder(new Color(0, 0, 0)));
        lblModel.setBounds(581, 249, 225, 28);
        contentPane.add(lblModel);
        
        JLabel lblColour = new JLabel("COLOUR");
        lblColour.setHorizontalAlignment(SwingConstants.CENTER);
        lblColour.setForeground(new Color(153, 50, 204));
        lblColour.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblColour.setBorder(new LineBorder(new Color(0, 0, 0)));
        lblColour.setBounds(806, 249, 189, 28);
        contentPane.add(lblColour);
        
        JLabel lblGstAmount = new JLabel("GST Amount");
        lblGstAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblGstAmount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblGstAmount.setBounds(962, 576, 143, 17);
        contentPane.add(lblGstAmount);
        
        JLabel label_27 = new JLabel("Taxable Amount");
        label_27.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_27.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_27.setBounds(962, 559, 143, 17);
        contentPane.add(label_27);
        
        JLabel lblGst = new JLabel("GST %");
        lblGst.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblGst.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblGst.setBounds(962, 542, 143, 17);
        contentPane.add(lblGst);
        
        JLabel label_29 = new JLabel("Discount");
        label_29.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_29.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_29.setBackground(Color.GREEN);
        label_29.setBounds(962, 525, 143, 17);
        contentPane.add(label_29);
        
        JLabel label_30 = new JLabel("Bill Amount");
        label_30.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_30.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_30.setBounds(962, 593, 143, 17);
        contentPane.add(label_30);
        
        
        JButton btnPrint = new JButton("Print");
        btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPrint.setForeground(new Color(0, 100, 0));
        btnPrint.setBounds(657, 640, 194, 44);
        contentPane.add(btnPrint);
        
        sumpcs_field = new JTextField();
        sumpcs_field.setBounds(13, 358, 22, 20);
        contentPane.add(sumpcs_field);
        sumpcs_field.setColumns(10);
        
       
       
        sumpcs_field.setVisible(false);
        
        
        
   	 barcode_field = new JTextField();
   	 barcode_field.setHorizontalAlignment(SwingConstants.CENTER);
     barcode_field.setForeground(Color.BLACK);
     barcode_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
     barcode_field.setColumns(20);
     barcode_field.setBorder(new LineBorder(new Color(0, 0, 0)));
     barcode_field.setBackground(Color.WHITE);
     barcode_field.setBounds(430, 181, 339, 58);
     contentPane.add(barcode_field);
     
     final JComboBox<String> paymentmode_field = new JComboBox<String>();
     paymentmode_field.addItem("CASH");
     paymentmode_field.addItem("CARD");
     paymentmode_field.addItem("CHECK");
     paymentmode_field.addItem("NET BANKING");
     paymentmode_field.addItem("OTHERS");
     paymentmode_field.setFont(new Font("Tahoma", Font.BOLD, 15));
     paymentmode_field.setBorder(new LineBorder(Color.BLACK));
     paymentmode_field.setBounds(91, 203, 262, 35);
     contentPane.add(paymentmode_field);
     
     JLabel label = new JLabel("MODE OF PAYMENT");
     label.setHorizontalTextPosition(SwingConstants.CENTER);
     label.setHorizontalAlignment(SwingConstants.CENTER);
     label.setFont(new Font("Tahoma", Font.BOLD, 15));
     label.setBounds(81, 171, 254, 28);
     contentPane.add(label);
     
     JLabel lblNineNine = new JLabel("Nine 2 Nine");
     lblNineNine.setVerticalAlignment(SwingConstants.TOP);
     lblNineNine.setFont(new Font("Tahoma", Font.BOLD, 13));
     lblNineNine.setBounds(159, 2, 148, 22);
     contentPane.add(lblNineNine);
	 barcode_field.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent arg0) {
	 		if(OrderDAO.barcodeDetails(barcode_field.getText(),"1")){
				
				JOptionPane.showMessageDialog(null,"bbAvailable");
				Connection con=null;
				PreparedStatement st=null;
				ResultSet rs=null;
				try{
					con=ConnectionUtility.getConnection();
					
				String validate ="SELECT imei,brand,model,color,sellingprice FROM barcodebilling.stockentry where barcode='"+barcode_field.getText()+"'";
				st=con.prepareStatement(validate);
				rs=st.executeQuery();
				if(rs.next())
				{
					String value1 = rs.getString("imei");
			        imei_field.setText(value1); 
			        String value2 = rs.getString("brand");
			        brand_field.setText(value2); 
			        String value3 = rs.getString("model");
			        model_field.setText(value3); 
			        String value4 = rs.getString("color");
			        colour_field.setText(value4); 
			        String value5 = rs.getString("sellingprice");
			        amount_field.setText(value5); 
			       
					
				}
		}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				  }
				finally{
					ConnectionUtility.closeConnection(con, st, rs);
				}
				
			//Filling the table
				
				Connection connection=null;
				PreparedStatement statement=null;
				ResultSet set=null;
			try {
				connection = ConnectionUtility.getConnection();

					if (table.getRowCount()<1) {
					//	table.updateUI();
						String customerdetails = "insert into barcodebilling.customer(name,mobile,address) values(?,?,?) ";
						statement = connection.prepareStatement(customerdetails);
						statement .setString(1, name_field.getText());
						statement .setString(2, mobile_field.getText());
						statement .setString(3, address_field.getText());
						statement .execute();
						// fetch recent customer id.
						
					}
					statement  = connection
							.prepareStatement("SELECT cust_id FROM barcodebilling.customer order by cust_id desc limit 1");
					 set = statement .executeQuery();
					int custId = 0;
					while (set.next()) {
						custId = set.getInt("cust_id");

					}
					if (custId > 0) {
						try{
							connection = ConnectionUtility.getConnection();
							String brandType=paymentmode_field.getSelectedItem().toString();
						String transactions = "insert into barcodebilling.transactions(bill_no,trx_date,imei,brand,"
								+ "model,colour,total_amt,cust_id,modeofpayment)"
								+ " values(?,?,?,?,?,?,?,?,?) ";
						String date=((JTextField)billing_date.getDateEditor().getUiComponent()).getText();
						statement  = connection.prepareStatement(transactions);
						//statement .setInt(1, custId);
						statement .setString(1, bill_no.getText());
						statement .setString(2, date);
						statement .setString(3, imei_field.getText());
						statement .setString(4, brand_field.getText());
						statement .setString(5, model_field.getText());
						statement .setString(6, colour_field.getText());
						statement .setString(7, amount_field.getText());
						statement .setInt(8, custId);
						statement.setString(9, brandType);
						statement .execute();
						
						model.setRowCount(0);
			           
						List<OrderConfigure> trxList=OrderDAO.getTransactions(table, custId);
						if(trxList!=null && trxList.size()>0){
							model = (DefaultTableModel) table.getModel();
							for(OrderConfigure billConfigure:trxList){
							
								model.insertRow(model.getRowCount(),new Object[] {
                                                                                  billConfigure.getSno(),
									                                              billConfigure.getImei(),
									                                              billConfigure.getBrand(),
									                                              billConfigure.getModel(),
									                                              billConfigure.getColour(),
									                                              billConfigure.getAmount(),
									                                              billConfigure.getTrxId()
									                                              });
								table.getRowCount();
								
						
							}
						}
						 OrderDAO.sum(table, taxable_amount);
							OrderDAO.taxAmount(taxable_amount, vat_percent, vat_amount);
							OrderDAO.billAmount(discount_field,taxable_amount, vat_amount, bill_amount,int_toword);   
						
						
						 
						
						//Update Availability
						
						Connection con1=null;
						PreparedStatement st1=null;
						ResultSet rs1=null;
						
						String value1=imei_field.getText();
						String value2="0";
					      try{
					          con1=ConnectionUtility.getConnection();  
					          String availableUpdate=  "update barcodebilling.stockentry set available='"+value2+"'"
				        		                        + "where imei='"+value1+"'";
					        
					        st1 = con1.prepareStatement(availableUpdate);
					        st1.executeUpdate(availableUpdate);
					          JOptionPane.showMessageDialog(null,"Updated Successfully !!");
					             
					        
							
					      }catch(Exception ex){
					          JOptionPane.showMessageDialog(null,ex.getMessage());
					      }
					      finally {
					  		ConnectionUtility.closeConnection(con1, st1, rs1);
					  	}
					      
					      OrderDAO.emptyJtextFields( barcode_field,imei_field, brand_field, model_field, 
						    		 colour_field, amount_field);	
					
			}
						catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					}
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
							
			
				
			}
		else{
				JOptionPane.showMessageDialog(null,"Not Available");

			}
	
		
	 
   
	 	}
	 });
		
		// Printing
        
        btnPrint.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Connection connection=null;
				PreparedStatement statement=null;
				ResultSet set=null;
			try {
				connection = ConnectionUtility.getConnection();

					
					statement  = connection
							.prepareStatement("SELECT cust_id FROM barcodebilling.customer order by cust_id desc limit 1");
					 set = statement .executeQuery();
					int custId = 0;
					while (set.next()) {
						custId = set.getInt("cust_id");

					}
					if (custId > 0) {
        		Connection connection1= null;
        		PreparedStatement statement1=null;
        		ResultSet set1=null;
        		try{
        			String value1=bill_amount.getText();
        			
    		        String value2=remarks_field.getText();
        		connection1=ConnectionUtility.getConnection();
        		 String billUpdate=  "update barcodebilling.customer set billamount='"+value1+"',"
	        		     
	        		        + "Remarks='"+value2+"'"
	        		        		+ "where cust_id='"+custId+"'";

        		statement1=connection1.prepareStatement(billUpdate);
 
        		statement1.executeUpdate(billUpdate);
        		}
        		catch (SQLException e) {
        		// TODO Auto-generated catch block 
        		e.printStackTrace();
        		}
					
        		finally {
            		ConnectionUtility.closeConnection(connection1, statement1, set1);
            		}
					}
			}
					catch (SQLException e) {
		        		// TODO Auto-generated catch block 
		        		e.printStackTrace();
		        		}
					finally {
	            		ConnectionUtility.closeConnection(connection, statement, set);
	            		}

//Documentation starts
        		
        		  try {
        	            Document doc2 = new Document(PageSize.A4);
        	            
        	            PdfWriter writer = PdfWriter.getInstance((Document)doc2, (OutputStream)new FileOutputStream("Mobile.pdf"));
        	            doc2.open();
        	            // Header
        	            
        	            
        	            PdfPTable headertableTop = new PdfPTable(1);
        	            headertableTop.getDefaultCell().setBorder(0);
        	            PdfPCell cell789;
        	            
        	            cell789= new PdfPCell(new Phrase(""));
        	            cell789.setFixedHeight(30.0f);
        	            cell789.setBorder(0);
        	            headertableTop.addCell(cell789);
        	            doc2.add(headertableTop);
        	            
        	            com.itextpdf.text.Font f7 = FontFactory.getFont(FontFactory.TIMES_BOLD,30, BaseColor.RED);    
        	            doc2.add(new Chunk("       MOBILE MAGIC   ",f7));
        	            com.itextpdf.text.Font f8 = FontFactory.getFont(FontFactory.TIMES_BOLD,22, BaseColor.BLUE);    
        	            doc2.add(new Chunk("   Nine ",f8));
        	            com.itextpdf.text.Font f9 = FontFactory.getFont(FontFactory.TIMES_BOLD,25, BaseColor.RED);    
        	            doc2.add(new Chunk(" 2  ",f9));
        	            com.itextpdf.text.Font f10 = FontFactory.getFont(FontFactory.TIMES_BOLD,22, BaseColor.BLUE);    
        	            doc2.add(new Chunk("Nine ",f10));
        	            
        	            PdfPTable headertable = new PdfPTable(4);
        	            headertable.setWidths(new int[]{10,60,15,4});
        	            headertable.setWidthPercentage(101.0f);
        	            headertable.getDefaultCell().setBorder(0);
        	            PdfPCell cell14;
        	            cell14= new PdfPCell(new Phrase(""));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable.addCell(cell14);
        	            
        	       //     Font f1 = new Font(FontFamily.TIMES_ROMAN, 25.0f, Font.BOLD, BaseColor.WHITE);
        	            
        	           
        	            
        	            PdfPTable headertable1 = new PdfPTable(1);
        	        
        	          
        	            cell14= new PdfPCell(headertable1);
        	            cell14.setBorder(0);
        	            cell14.setFixedHeight(10.0f);
        	            cell14.setPadding(8.0f);
        	            headertable.addCell(cell14);  
        	            
        	            
        	            
        	            PdfPTable headertable2 = new PdfPTable(1);
        	            cell14 = new PdfPCell(new Phrase(" ", FontFactory.getFont((String)"Times-Bold", (float)6.0f)));
        	            cell14.setBorder(0);
        	            headertable2.addCell(cell14);
        	            cell14 = new PdfPCell(new Phrase("RETAIL INVOICE", FontFactory.getFont((String)"Times-Bold", (float)6.0f)));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable2.addCell(cell14);
        	            cell14 = new PdfPCell(new Phrase("ORIGINAL", FontFactory.getFont((String)"Times-Bold", (float)6.0f)));
        	            cell14.setBorder(0);
        	            headertable2.addCell(cell14);
        	            
        	            
        	            cell14= new PdfPCell(headertable2);
        	            cell14.setBorder(0);
        	            cell14.setPadding(8.0f);
        	            headertable.addCell(cell14);  
        	            
        	            cell14= new PdfPCell(new Phrase(""));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable.addCell(cell14);
        	            
        	            doc2.add(headertable);
        	            LineSeparator ls = new LineSeparator();
        	            ls.setLineWidth(2);
        	            doc2.add(new Chunk(ls));
        	         
        	            
        	            try{
        	            	URL imageUrl = Main.class.getResource(
                                    "/resources/2.png");
        	            	//  String imageUrl = "images/2.png";
        	            	 Image logo = Image.getInstance(imageUrl);
        	            	 logo.scaleAbsolute(100f, 17f);
        	            	 logo.setAbsolutePosition(260f, 800f);
        	            	 
        	            	
        	            	 
        	            
        	            	 
        	            doc2.add(logo);
        	        
        	       
        	            }
        	            catch(Exception e){
        	                e.printStackTrace();
        	              }
        	            
        	            
        	            // After Header
        	            PdfContentByte cb = writer.getDirectContent();
        	            cb.saveState();
        	            cb.rectangle(16.0f, 10.0f, 562.0f, 820.0f);
        	            
        	            cb.stroke();
        	            cb.restoreState();
        	            doc2.add((Element)new Paragraph("Station Chawk, Janakpur Road, Pupri, Sitamarhi, Bihar-843220,INDIA       Mob: 9162002600", FontFactory.getFont((String)"Times-Bold", (float)12.0f)));
        	            doc2.add((Element)new Paragraph("EMAIL: meetheenine@gmail.com", FontFactory.getFont((String)"Times-Bold", (float)9.0f)));
        	            
        	            doc2.add((Element)new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        	            doc2.add((Element)new Paragraph(""));
        	            com.itextpdf.text.Font f = FontFactory.getFont((String)"Times-Bold", (float)9.0f);
        	            PdfPTable table2 = new PdfPTable(2);
        	            table2.setWidths(new int[]{7, 3});
        	            Paragraph p1 = new Paragraph(16.0f, "NAME: " + Order.this.name_field.getText() + "\n\n" + "ADDRESS: " + Order.this.address_field.getText() + "\n\n" + "MOBILE: " + Order.this.mobile_field.getText(), f);
        	            table2.addCell((Phrase)p1);
        	            String from=((JTextField)billing_date.getDateEditor().getUiComponent()).getText();
        	            p1 = new Paragraph(16.0f, "\nDATE: "  +from+ "\n\n" + "BILL NO: " + Order.this.bill_no.getText(), f);
        	            table2.addCell((Phrase)p1);
        	         
        	            table2.setWidthPercentage(100.0f);
        	            doc2.add((Element)table2);
        	            doc2.add((Element)new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        	            PdfPTable pdfTable = new PdfPTable(table.getColumnCount() - 1);
        	            pdfTable.setHorizontalAlignment(1);
        	            pdfTable.setWidths(new float[]{1.0f, 4f, 2.0f, 2.0f, 2.0f, 2.0f});
        	            pdfTable.setTotalWidth(doc2.getPageSize().getWidth() - 70.0f);
        	            pdfTable.getDefaultCell().setUseAscender(true);
        	            pdfTable.getDefaultCell().setUseDescender(true);
        	            pdfTable.setLockedWidth(true);
        	           
        	            PdfPCell cell = new PdfPCell(new Phrase("S.NO", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("IMEI", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("BRAND", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("MODEL", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("COLOUR", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("AMOUNT", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	          
        	            for (int rows = 0; rows < table.getRowCount(); rows++) {
        	            	 cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                         	cell.setHorizontalAlignment(1);
                             cell.setColspan(1);
                            for (int cols = 0; cols < table.getColumnCount()-1; cols++) {
                            	cell = new PdfPCell(new Phrase(table.getModel().getValueAt(rows, cols).toString(), FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
                	        
                	            cell.setHorizontalAlignment(1);
                	            cell.setColspan(1);
                                pdfTable.addCell(cell);
                                
                            }
                        }
        	            
        	          
        	            
                        doc2.add(pdfTable);
         
                        PdfPCell cell1 = new PdfPCell(new Phrase("", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            PdfPTable heighttable = new PdfPTable(1);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(10.0f);
        	            cell1.setBorder(0);
        	            heighttable.addCell(cell1);
        	            doc2.add((Element)heighttable);
        	            RoundRectangle roundRectangle = new RoundRectangle();
        	            PdfPTable outertable = new PdfPTable(3);
        	            outertable.setWidths(new int[]{20, 1, 8});
        	            outertable.setWidthPercentage(101.0f);
        	            outertable.getDefaultCell().setBorder(0);
        	            PdfPTable innertable = new PdfPTable(1);
        	            PdfPTable inwordstable1 = new PdfPTable(2);
        	            inwordstable1.setWidths(new int[]{4, 16});
        	            PdfPCell cell8 = new PdfPCell(new Phrase("Amount in Words:", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            inwordstable1.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase(Order.this.int_toword.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell8.setBorder(0);
        	            inwordstable1.addCell(cell8);
        	            cell8 = new PdfPCell();
        	            cell8.setColspan(5);
        	            cell8.setFixedHeight(3.0f);
        	            cell8.setBorder(0);
        	            inwordstable1.addCell(cell8);
        	            cell1 = new PdfPCell(inwordstable1);
        	            cell1.setCellEvent((PdfPCellEvent)roundRectangle);
        	            cell1.setBorder(0);
        	            cell1.setPadding(8.0f);
        	            innertable.addCell(cell1);
        	          
        	            PdfPTable remarkstable = new PdfPTable(2);
        	            remarkstable.setWidths(new int[]{4, 16});
        	            cell8 = new PdfPCell(new Phrase("Remarks:", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            remarkstable.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase(Order.this.remarks_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setBorder(0);
        	            remarkstable.addCell(cell8);
        	            cell8 = new PdfPCell();
        	            cell8.setColspan(5);
        	            cell8.setFixedHeight(3.0f);
        	            cell8.setBorder(0);
        	            remarkstable.addCell(cell8);
        	            cell1 = new PdfPCell(remarkstable);
        	            cell1.setCellEvent((PdfPCellEvent)roundRectangle);
        	            cell1.setBorder(0);
        	            cell1.setPadding(8.0f);
        	            innertable.addCell(cell1);
        	            outertable.addCell(new PdfPCell(innertable));
        	            cell1.setBorder(0);
        	            outertable.addCell("");
        	            
        	            
        	            PdfPTable innertable3 = new PdfPTable(2);
        	            cell1 = new PdfPCell();
        	            cell1 = new PdfPCell(new Phrase("Discount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Order.this.discount_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("GST", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Order.this.vat_percent.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Taxable Amount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Order.this.taxable_amount.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("GST Amount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Order.this.vat_amount.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            
        	            cell1 = new PdfPCell(new Phrase("Bill Amount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Order.this.bill_amount.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            
        	            cell1 = new PdfPCell(new Phrase("Mode of Payment", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            String brandType=paymentmode_field.getSelectedItem().toString();
        	            cell1 = new PdfPCell(new Phrase(brandType, FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	          
        	            outertable.addCell(new PdfPCell(innertable3));
        	            doc2.add((Element)outertable);
        	            PdfPTable heighttable2 = new PdfPTable(1);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(10.0f);
        	            cell1.setBorder(0);
        	            heighttable2.addCell(cell1);
        	            doc2.add((Element)heighttable2);
        	         
        	           
        	            doc2.add(( Element) new Paragraph("Terms & Conditions",FontFactory.getFont(FontFactory.TIMES_BOLD, 15)));
        	            
        	            doc2.add(( Element) new Paragraph("1. All Subjects to Sitamarhi Jurisdication only.",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC,10)));
        	          
        	            doc2.add(( Element) new Paragraph("2. Goods once sold will not be taken back or exchanged.",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC,10)));
        	          
        	            doc2.add(( Element) new Paragraph("3. Mobile Magic Nine 2 Nine is Retailer Only. For warranty, please contact Service Center",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC,10)));
        	            
        	           
        	            
        	            PdfPTable heighttable3 = new PdfPTable(1);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(4.0f);
        	            cell1.setBorder(0);
        	            heighttable3.addCell(cell1);
        	            doc2.add((Element)heighttable3);
        	            Paragraph p = new Paragraph(); 
        	          
	            	    
        	            PdfPTable heighttable31 = new PdfPTable(1);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(4.0f);
        	            cell1.setBorder(0);
        	            heighttable31.addCell(cell1);
        	            doc2.add((Element)heighttable31);
        	            com.itextpdf.text.Font f1= FontFactory.getFont(FontFactory.TIMES_BOLD,8, BaseColor.ORANGE);
        	         
        	            doc2.add((Element)new Paragraph("             CUSTOMER'S SIGNATURE                                                                                                                           For, MOBILE MAGIC ", f1));
        	           
        	            //Footer
        	            PdfPTable footertable = new PdfPTable(3);
        	            footertable.setWidths(new int[]{10,8,10});
        	            footertable.setWidthPercentage(101.0f);
        	            footertable.getDefaultCell().setBorder(0);
        	            PdfPCell cell141;
        	            cell141= new PdfPCell(new Phrase(""));
        	            cell141.setBorder(0);
        	            cell141.setPaddingLeft(2.0f);
        	            footertable.addCell(cell141);
        	           
        	            PdfPTable tintable1 = new PdfPTable(1);
        	         
        	            cell141 = new PdfPCell(new Phrase("GST TIN:   10661046063", FontFactory.getFont((String)"Times-Bold", (float)7.0f)));
        	            cell141.setBorder(0);
        	            cell141.setPaddingLeft(2.0f);
        	            cell141.setBackgroundColor(BaseColor.ORANGE);
        	            tintable1.addCell(cell141);
        	            cell141 = new PdfPCell(new Phrase("CST TIN:   10661046063" , FontFactory.getFont((String)"Times-Bold", (float)7.0f)));
        	            cell141.setBorder(0);
        	            cell141.setPaddingLeft(2.0f);
        	            cell141.setBackgroundColor(BaseColor.ORANGE);
        	            tintable1.addCell(cell141);
        	            
        	            PdfPCell cell343;
        	            cell343 = new PdfPCell(tintable1);
        	            cell343.setCellEvent((PdfPCellEvent)roundRectangle);
        	           
        	            cell343.setBorder(0);
        	            cell343.setPadding(8.0f);
        	            footertable.addCell(cell343);
        	            
        	            cell141= new PdfPCell(new Phrase(""));
        	            cell141.setBorder(0);
        	            cell141.setPaddingLeft(2.0f);
        	            footertable.addCell(cell141);
        	           
        	            doc2.add(footertable);
        	            
        	            doc2.add((Element)new Paragraph("****************************************************************************************************************"));
        	            PdfPTable headertable21 = new PdfPTable(3);
        	           
        	           
        	            cell14= new PdfPCell(new Phrase(""));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable.addCell(cell14);
        	            headertable21.addCell(cell14);
        	            
        	            cell14 = new PdfPCell(new Phrase("Thank You, Please visit us again!!", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable21.addCell(cell14);
        	            
        	            cell14= new PdfPCell(new Phrase(""));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable.addCell(cell14);
        	            headertable21.addCell(cell14);
        	            doc2.add(headertable21);
        	            doc2.add((Element)new Paragraph("****************************************************************************************************************"));
        	            
        	      // adding footer images
        	            
        	            try{
        	            	URL imageUrl3 = Main.class.getResource(
                                    "/resources/reliancejio.jpg");
        	            	//  String imageUrl = "images/2.png";
        	            	 Image logo3 = Image.getInstance(imageUrl3);
        	            	 logo3.scaleAbsolute(70f, 30f);
        	            	 logo3.setAbsolutePosition(30f, 10f);
        	            	 
        	            	// String imageUrl2 = "src/1.jpg";
        	            	 URL imageUrl4 = Main.class.getResource(
                                     "/resources/nokia.png");
        	            	 Image logo4 = Image.getInstance(imageUrl4);
        	            	 logo4.scaleAbsolute(60f, 40f);
        	            	 logo4.setAbsolutePosition(110f, 7f);
        	            	 
        	            	 URL imageUrl5 = Main.class.getResource(
                                     "/resources/samsung.png");
         	            	//  String imageUrl = "images/2.png";
         	            	 Image logo5 = Image.getInstance(imageUrl5);
         	            	 logo5.scaleAbsolute(50f, 30f);
         	            	 logo5.setAbsolutePosition(180f, 10f);
         	            	 
         	            	// String imageUrl2 = "src/1.jpg";
         	            	 URL imageUrl6 = Main.class.getResource(
                                      "/resources/micromax.png");
         	            	 Image logo6 = Image.getInstance(imageUrl6);
         	            	 logo6.scaleAbsolute(60f, 40f);
         	            	 logo6.setAbsolutePosition(240f, 10f);
         	            	 
         	            	URL imageUrl7 = Main.class.getResource(
                                    "/resources/lava.png");
        	            	//  String imageUrl = "images/2.png";
        	            	 Image logo7 = Image.getInstance(imageUrl7);
        	            	 logo7.scaleAbsolute(60f, 40f);
        	            	 logo7.setAbsolutePosition(310f, 8f);
        	            	 
        	            	// String imageUrl2 = "src/1.jpg";
        	            	 URL imageUrl8 = Main.class.getResource(
                                     "/resources/karbonnjpg.jpg");
        	            	 Image logo8 = Image.getInstance(imageUrl8);
        	            	 logo8.scaleAbsolute(60f, 40f);
        	            	 logo8.setAbsolutePosition(380f, 8f);
        	            	 
        	            	 URL imageUrl9 = Main.class.getResource(
                                     "/resources/vivo.png");
         	            	//  String imageUrl = "images/2.png";
         	            	 Image logo9 = Image.getInstance(imageUrl9);
         	            	 logo9.scaleAbsolute(50f, 30f);
         	            	 logo9.setAbsolutePosition(450f, 10f);
         	            	 
         	            	// String imageUrl2 = "src/1.jpg";
         	            	 URL imageUrl10 = Main.class.getResource(
                                      "/resources/oppo.jpg");
         	            	 Image logo10 = Image.getInstance(imageUrl10);
         	            	 logo10.scaleAbsolute(50f, 40f);
         	            	 logo10.setAbsolutePosition(510f, 5f);
        	            	
        	            	 
        	            
        	            	 
        	            doc2.add(logo3);
        	            doc2.add(logo4);
        	            doc2.add(logo5);
        	            doc2.add(logo6);
        	            doc2.add(logo7);
        	            doc2.add(logo8);
        	            doc2.add(logo9);
        	            doc2.add(logo10);
        	       
        	            }
        	            catch(Exception e){
        	                e.printStackTrace();
        	              }
        	            
        	            
        	           
        	            
        	            doc2.close();
        	            System.out.println("done");
        	        }
        	        catch (DocumentException doc2) {
        	        }
        	        catch (FileNotFoundException doc2) {
        	            // empty catch block
        	        } 
        		 /* catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} */
        		  catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        		/*  try {
					Printing.ghVD();
				} catch (PrintException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/

        		  Desktop desktop = Desktop.getDesktop();
      		    try {
      		           desktop.print(new File("Mobile.pdf"));
      		    } catch (IOException e) {
      		        e.printStackTrace();
      		    }
       	}
        });
      
		
	}
	   
       private void initComponents() {
		// TODO Auto-generated method stub
		
	}
      
       
       public static void OnClick(JTable table,JTextField item_field, JTextField crt_field, JTextField pcs_field,
               JTextField gross_field, JTextField net_field, JTextField metal_field, 
               JTextField labour_field,
               JTextField stone_field, JTextField amount_field, JTextField trx_field)
   	{
   
   			//System.err.println("2424"+value10);
   	  }
}