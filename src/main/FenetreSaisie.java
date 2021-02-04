package main;


//Importation des différentes fonctionnalités Swing et des données des autres .java
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import classe.Article;
import Tableau.Tableau;

public class FenetreSaisie extends javax.swing.JInternalFrame {

  Tableau articles;
  DefaultTableModel model;
  static int id;


  public FenetreSaisie() {
      initComponents();
      articles = new Tableau();
      model = (DefaultTableModel) table_inv.getModel();
  }

  void load() {
      model.setRowCount(0);
      for (Article a : articles.findAll()) {
          model.addRow(new Object[]{a.getId(), a.getIntitule(), a.getPrixHT(),a.getQuantiteEnStock(), a.getReference()});
      }
  }


  void clear() {
      champnom.setText("");
      champprix.setText("");
      champstock.setText("");
      champref.setText("");

  }

  private void initComponents() {

      buttonGroup1 = new javax.swing.ButtonGroup();
      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      labelnom = new javax.swing.JLabel();
      labelprix = new javax.swing.JLabel();
      labelref = new javax.swing.JLabel();
      labelstock = new javax.swing.JLabel();
      champnom = new javax.swing.JTextField();
      champprix = new javax.swing.JTextField();
      champstock = new javax.swing.JTextField();
      champref = new javax.swing.JTextField();
      bt_ajout = new javax.swing.JButton();
      bt_modi = new javax.swing.JButton();
      bt_sup = new javax.swing.JButton();
      bt_prix = new javax.swing.JButton();
      jPanel3 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      table_inv = new javax.swing.JTable();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(218, 235, 244 ));
      jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      jPanel2.setBackground(new java.awt.Color(255, 255, 255));
      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventaire"));

      labelnom.setText("Nom :");

      labelprix.setText("Prix :");

      labelref.setText("Reference :");
      
      labelstock.setText("Stock : ");
      


      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
          jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
              .addContainerGap()
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(labelprix)
                  .addComponent(labelnom))
              .addGap(16, 16, 16)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(champnom, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                  .addComponent(champprix))
              .addGap(18, 18, 18)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                      .addComponent(labelref)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                      .addComponent(champref,javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                      .addComponent(labelstock))
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                      .addComponent(champstock,javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))))
      );
      jPanel2Layout.setVerticalGroup(
          jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
              .addContainerGap()
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(labelnom)
                  .addComponent(labelref)
                  .addComponent(champnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(champref))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(labelprix)
                  .addComponent(champprix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(labelstock)
                  .addComponent(champstock))
              .addGap(18, 18, 18))
      );

     bt_ajout.setText("Ajouter");
     bt_ajout.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              btajoutActionPerformed(evt);
          }
      });

      bt_modi.setText("Supprimer");
      bt_modi.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              btmodiActionPerformed(evt);
          }
      });

      bt_sup.setText("Modifier");
      bt_sup.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              btsupActionPerformed(evt);
          }
      });
      
      bt_prix.setText("Prix TTC");
      bt_prix.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              btprixActionPerformed(evt);
          }
      });

      jPanel3.setBackground(new java.awt.Color(255, 255, 255));
      jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventaire des fruits et légumes"));

      table_inv.setModel(new javax.swing.table.DefaultTableModel(
          new Object [][] {

          },
          new String [] {
              "ID", "Intitulé","PrixHT", "Stock", "Reference"
          }
      ));
      table_inv.addMouseListener(new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
              tableinvMouseClicked(evt);
          }
      });
      jScrollPane1.setViewportView(table_inv);

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
          jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(0, 0, Short.MAX_VALUE))
      );
      jPanel3Layout.setVerticalGroup(
          jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
              .addContainerGap()
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
          jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
              .addGap(28, 28, 28)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                          .addComponent(bt_modi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(bt_sup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(bt_prix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(bt_ajout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
              .addContainerGap(14, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
          jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addGroup(jPanel1Layout.createSequentialGroup()
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                      .addGap(29, 29, 29)
                      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                      .addGap(45, 45, 45)
                      .addComponent(bt_ajout)
                      .addGap(15, 15, 15)
                      .addComponent(bt_modi)
                      .addGap(18, 18, 18)
                      .addComponent(bt_sup)
                      .addGap(18, 18, 18)
                      .addComponent(bt_prix)))
              .addGap(29, 29, 29)
              .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
  }

  private void btajoutActionPerformed(java.awt.event.ActionEvent evt) {
  
  	float prixHT = Float.parseFloat(champprix.getText());
  	long ref = Long.parseLong(champref.getText());
  	int stock = Integer.parseInt(champstock.getText());
      if (articles.create(new Article(champnom.getText(), prixHT,ref, stock))) {
          JOptionPane.showMessageDialog(this, "Ajout effectué");
          clear();
          load();
      }

  }

  private void tableinvMouseClicked(java.awt.event.MouseEvent evt) {
      id = Integer.parseInt(model.getValueAt(table_inv.getSelectedRow(), 0).toString());
      champnom.setText(model.getValueAt(table_inv.getSelectedRow(), 1).toString());
      champprix.setText(model.getValueAt(table_inv.getSelectedRow(), 2).toString());
      champref.setText(model.getValueAt(table_inv.getSelectedRow(), 3).toString());
      champstock.setText(model.getValueAt(table_inv.getSelectedRow(), 4).toString());
  }

  private void btmodiActionPerformed(java.awt.event.ActionEvent evt) {
      articles.delete(articles.findById(id));
      load();
      clear();
  }

  private void btsupActionPerformed(java.awt.event.ActionEvent evt) {
	  float prixHT = Float.parseFloat(champprix.getText());
	  long ref = Long.parseLong(champref.getText());
	  int stock = Integer.parseInt(champstock.getText());
      if (articles.update(new Article(id,champnom.getText(),  prixHT,ref, stock))) {
          JOptionPane.showMessageDialog(this, "Modification effectuée");
          clear();
          load();
      }
  }
  private void btprixActionPerformed(java.awt.event.ActionEvent evt) {
	  
	  float prixHT = Float.parseFloat(champprix.getText());
	  JOptionPane.showMessageDialog(this, (prixHT*1.1196)/100);
      load();
      clear();
    }
  
  //Déclaration des différents composants
  
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton bt_ajout;
  private javax.swing.JButton bt_modi;
  private javax.swing.JButton bt_sup;
  private javax.swing.JButton bt_prix;
  private javax.swing.JLabel labelnom;
  private javax.swing.JLabel labelprix;
  private javax.swing.JLabel labelref;
  private javax.swing.JLabel labelstock;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable table_inv;
  private javax.swing.JTextField champnom;
  private javax.swing.JTextField champprix;
  private javax.swing.JTextField champstock;
  private javax.swing.JTextField champref;
  
}


