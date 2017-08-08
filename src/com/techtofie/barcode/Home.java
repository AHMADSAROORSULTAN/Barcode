package com.techtofie.barcode;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingConstants;


public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		
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
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();

		GraphicsConfiguration gc = gd.getDefaultConfiguration();
		Rectangle bounds = gc.getBounds();
		
		JButton btnNewButton = new JButton("Stock Entry ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				StockEntry se=new StockEntry();
				se.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.setBounds(562, 133, 317, 68);
		contentPane.add(btnNewButton);
		
		JButton stock_field = new JButton("In-Stock");
		stock_field.setForeground(new Color(128, 0, 0));
		stock_field.setFont(new Font("Tahoma", Font.BOLD, 30));
		stock_field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			Instock is=new Instock();
			is.setVisible(true);
			}
		});
		stock_field.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		stock_field.setBounds(562, 200, 317, 68);
		contentPane.add(stock_field);
		
		JButton btnOriginalBill = new JButton("Order");
		btnOriginalBill.setForeground(new Color(0, 0, 0));
		btnOriginalBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Order or=new Order();
				or.setVisible(true);
			}
		});
		btnOriginalBill.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnOriginalBill.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnOriginalBill.setBounds(562, 267, 317, 68);
		contentPane.add(btnOriginalBill);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Settings sett=new Settings();
				sett.setVisible(true);
				sett.setResizable(false);
			}
		});
		btnSettings.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSettings.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnSettings.setBounds(562, 468, 317, 76);
		contentPane.add(btnSettings);
		
		txtWelcome = new JTextField();
		txtWelcome.setForeground(new Color(153, 50, 204));
		txtWelcome.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcome.setText("Welcome  Mobile Magic");
		txtWelcome.setBorder(null);
		txtWelcome.setBounds(548, 33, 317, 42);
		contentPane.add(txtWelcome);
		txtWelcome.setColumns(10);
		
		JButton Report = new JButton("Report");
		Report.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Report rt=new Report();
				rt.setVisible(true);
			}
		});
		Report.setFont(new Font("Tahoma", Font.BOLD, 30));
		Report.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		Report.setBounds(562, 334, 317, 68);
		contentPane.add(Report);
		
		JButton btnParty = new JButton("Party");
		btnParty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Party pp=new Party();
				pp.setVisible(true);
			}
		});
		btnParty.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnParty.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnParty.setBounds(562, 401, 317, 68);
		contentPane.add(btnParty);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
