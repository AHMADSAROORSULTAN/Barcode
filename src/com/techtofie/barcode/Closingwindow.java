package com.techtofie.barcode;

import javax.swing.JOptionPane;


public class Closingwindow {
	

		public static  void confirmAndExit() {
			 if (JOptionPane.showConfirmDialog(
				      null,
				      "Are you sure you want to quit?",
				      "Please confirm",
				      JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION
				    ) {
				      System.exit(0);
				    }
			
		}
}
