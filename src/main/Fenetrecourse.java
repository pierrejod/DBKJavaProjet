package main;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Tableau.Tableau;

public class Fenetrecourse extends javax.swing.JInternalFrame {
	
	Tableau articles;
	  DefaultTableModel model;
	  static int id;


	  public Fenetrecourse() {
	      initComponents();
	      articles = new Tableau();
	      //model = (DefaultTableModel) table_inv.getModel();
	  }
	  private void initComponents() {
		  
	      jPanel2 = new javax.swing.JPanel();
		  
		  setSize(200,100);
	      setVisible(true);
	      setClosable(true);
	      setIconifiable(true);
	      setMaximizable(true);
	      setResizable(false);
	      
	      jPanel2.setBackground(new java.awt.Color(255, 255, 255));
	      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventaire"));
	      
	      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	      jPanel2.setLayout(jPanel2Layout);
	  }
	  private javax.swing.JPanel jPanel2;
}
