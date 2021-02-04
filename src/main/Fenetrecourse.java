package main;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Tableau.Tableau;

public class Fenetrecourse extends javax.swing.JInternalFrame {
	
	Tableau articles;
	  DefaultTableModel model;
	  static int id;


	  public Fenetrecourse() {
	      //initComponents();
	      articles = new Tableau();
	      //model = (DefaultTableModel) table_inv.getModel();
	  }

}
