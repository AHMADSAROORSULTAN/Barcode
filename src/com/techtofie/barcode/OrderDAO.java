package com.techtofie.barcode;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.lang.Object;
public class OrderDAO {
	
	public static void charUperCase(KeyEvent e){
		char keyChar = e.getKeyChar();
	    if (Character.isLowerCase(keyChar)) {
	      e.setKeyChar(Character.toUpperCase(keyChar));
	    }
	}	
	public static void noNumber(KeyEvent e){
		char c = e.getKeyChar();
	    if (((c >= '0') && (c <= '9') ||
	       (c == KeyEvent.VK_BACK_SPACE) ||
	       (c == KeyEvent.VK_DELETE))) {
	      e.consume();
	   }
	}
	public static void onlyNumber(KeyEvent e){
		char c = e.getKeyChar();
	    if (!((c >= '0') && (c <= '9') ||
	       (c == KeyEvent.VK_BACK_SPACE) ||
	       (c == KeyEvent.VK_DELETE))) {
	      e.consume();
	   }
	}
	public static void numberdecimal(KeyEvent e){
	char c = e.getKeyChar();
    if (!((c >= '0') && (c <= '9')|| (c == '.') ||
       (c == KeyEvent.VK_BACK_SPACE) ||
       (c == KeyEvent.VK_DELETE))) {
      e.consume();
    }
	}

	public static  void randomNumbers(JTextField bill_no) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int n=ran.nextInt(10000)+1;
		String val=String.valueOf(n);
		
		Date d=new Date();
		SimpleDateFormat sf= new SimpleDateFormat("ddMMyy");
		String  datee=sf.format(d);
		
		Random random1=new Random();
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<1;i++){
			char numGene=alpha.charAt(random1.nextInt(alpha.length()));
			Object o=numGene;
			String number=o.toString();
			
				bill_no.setText(datee+number+val);
				
		}
	
        }

	
	 public static void emptyJtextFields(JTextField barcode_field,JTextField imei_field, JTextField brand_field, JTextField model_field,
			                             JTextField colour_field,
			                             JTextField amount_field)
	    {
		    barcode_field.setText("");
			imei_field.setText("");
			brand_field.setText("");
			model_field.setText("");
			colour_field.setText("");
			amount_field.setText("");
	    }
	 
	
	public static List<OrderConfigure> getTransactions(JTable table,int custId) {
		List<OrderConfigure> transList = null;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;
		try {
			connection = ConnectionUtility.getConnection();
			String transactions ="SELECT c.cust_id,c.name,t.imei,t.brand,t.model,t.colour,"
					+ "t.pcs,t.total_amt,t.trx_id FROM barcodebilling.customer"
					+ " c join barcodebilling.transactions t on c.cust_id=t.cust_id where c.cust_id=?";
			statement  = connection.prepareStatement(transactions);
			statement.setInt(1, custId);
			set = statement.executeQuery();
		
			if (set != null) {
				transList = new ArrayList<>();
		         
				while (set.next()) {
					int i=	transList.size();
					OrderConfigure transaction =new OrderConfigure();
					transaction.setSno(i+1);
					transaction.setImei(set.getString("imei"));
					transaction.setBrand(set.getString("brand"));
					transaction.setModel(set.getString("model"));
					transaction.setColour(set.getString("colour"));
					transaction.setAmount(set.getString("total_amt"));
                    transaction.setTrxId(set.getString("trx_id"));
					transList.add(transaction);
				}
			}
		
		}
		 catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtility.closeConnection(connection, statement, set);
		}
		return transList;
	}

	
	public static void taxVat(JTextField vat_percent){
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet set=null;
	      try{
	          connection=ConnectionUtility.getConnection();  
		
			String validate ="SELECT gst FROM barcodebilling.tax_configuration";
			statement=connection.prepareStatement(validate);
			set=statement.executeQuery();
			if(set.next())
			{
				String value = set.getString("gst");
		        vat_percent.setText(value); 
				connection.close();
			}
			else
			{
				
			}
			 

		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		finally {
	  		ConnectionUtility.closeConnection(connection, statement, set);
	  	}
	  }
	
	public static void sum(JTable table,JTextField taxable_amount ){
 	  
		float sum=0;
		for(int i=0;i<table.getRowCount();i++)
		{
			sum=sum+Float.parseFloat((String)table.getValueAt(i, 5));
			taxable_amount.setText(Float.toString(sum));
		
		}
 	   }
 	  
	 public static void taxAmount(JTextField taxable_amount,JTextField vat_percent,JTextField vat_amount){
   	  try{
			float j = Float.parseFloat(taxable_amount.getText());
			float l=Float.parseFloat(vat_percent.getText());
			float s=j*l/100;
			
			String k = String.format("%.2f",s);
			vat_amount.setText(k);
    }
   	  catch(Exception e){
   		  
   	  }
	 }
	 public static void billAmount(JTextField discount_field,JTextField taxable_amount,JTextField vat_amount,JTextField bill_amount,JTextField int_toword){

			float l = Float.parseFloat(taxable_amount.getText());

   			if(discount_field.getText().equals("")) {
   				discount_field.setText("0");;
   		    }
			float n = Float.parseFloat(discount_field.getText());
		//	float m = Float.parseFloat(vat_amount.getText());
			float s=l-n;
			int b=(int)(Math.round(s));
			String g=Integer.toString(b);
			bill_amount.setText(g);
			OrderDAO.intoWords(bill_amount, int_toword);
		

	 }
	 public static void intoWords(JTextField bill_amount,JTextField  int_toword) {

			String z = bill_amount.getText();
			int n = Integer.parseInt(z);
			//int n = (int)Math.round(u);
			
		    
		    String arr1[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		    String arr2[]={"Twenty","Thirty", "Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		    String unit[]={"Arab","Crore","Lakh","Thousand","Hundred", ""};
		    int factor[]={1000000000, 10000000, 100000, 1000, 100,1};
		    String answer="";

		    if(n<0){
		        answer="Negative";
		        n=-n;
		    }
		    int quotient, units, tens;
		    try{
		    for(int i=0; i<factor.length; i++){
		            quotient=n/factor[i];             
		            if(quotient>0){
		            if(quotient<20){
		                answer = answer + " " + arr1[quotient-1];
		            }else{
		                units=quotient%10;
		                tens=quotient/10;
		                if(units==0 && tens>0){
		                answer = answer + " " + arr2[tens-2];
		                }
		                else{
			                answer = answer + " " + arr2[tens-2] + " " + arr1[units-1];
		                }
		            }
		            answer = answer + " " + unit[i];
		        }
		        n=n%factor[i];
		    }
		    }
		   catch(ArrayIndexOutOfBoundsException e)
		    {
		      System.out.println("Do not cross size of array size"  + e );
		    }

		    int_toword.setText( answer+"only.");
			

		

	 }
		
	/* public static void dueAmount(JTextField bill_amount,JTextField received_amount,JTextField due_amount){

			try{
			 float l = Float.parseFloat(bill_amount.getText());
			 float k=Float.parseFloat(received_amount.getText());
			 float j=l-k;
			 due_amount.setText(Float.toString(j));
			
		}
			catch(Exception e1){
				
			}
	 }*/
	/* public static void sumPcs(JTable table,JTextField sumpcs_field){
	 	  
			float sum=0;
			for(int i=0;i<table.getRowCount();i++)
			{
				sum=sum+Float.parseFloat((String)table.getValueAt(i, 6));
				sumpcs_field.setText(Float.toString(sum));
			
			}
	 	   }*/
		public static boolean  barcodeDetails (String validate_barcode,String validate_available)
		{
			
		
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet set=null;
		try {
			connection =ConnectionUtility.getConnection();
			
			String validate ="select * from barcodebilling.stockentry where barcode=? and available=?";
			statement=connection.prepareStatement(validate);
			
			statement.setString(1,validate_barcode);
			statement.setString(2,validate_available);
			set=statement.executeQuery();
			if(set.next())
				
			{
				return true;
				
			}
			else
			{
				return false;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		finally {
			ConnectionUtility.closeConnection(connection, statement, set);
		}
		return false;
		}
		
	
	
}