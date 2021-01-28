package main;


//Importation des différentes fonctionnalités Swing et des données des autres .java
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classe.Produit;
import Tableau.Tableau;

public class FenetreSaisie extends javax.swing.JInternalFrame {

  Tableau ps;
  DefaultTableModel model;
  static int id;


  public FenetreSaisie() {
      initComponents();
      ps = new Tableau();
      model = (DefaultTableModel) table_inv.getModel();
  }

  void load() {
      model.setRowCount(0);
      for (Produit p : ps.findAll()) {
          model.addRow(new Object[]{p.getId(), p.getNom(), p.getPrix(),p.getStock(), p.getType()});
      }
  }


  void clear() {
      champnom.setText("");
      champprix.setText("");
      champstock.setText("");
      bt_fruit.setSelected(false);
      bt_legu.setSelected(false);
  }

  private void initComponents() {

      buttonGroup1 = new javax.swing.ButtonGroup();
      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      labelnom = new javax.swing.JLabel();
      labelprix = new javax.swing.JLabel();
      labeltype = new javax.swing.JLabel();
      labelstock = new javax.swing.JLabel();
      champnom = new javax.swing.JTextField();
      champprix = new javax.swing.JTextField();
      champstock = new javax.swing.JTextField();
      bt_legu = new javax.swing.JRadioButton();
      bt_fruit = new javax.swing.JRadioButton();
      bt_ajout = new javax.swing.JButton();
      bt_modi = new javax.swing.JButton();
      bt_sup = new javax.swing.JButton();
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

      labeltype.setText("Type :");
      
      labelstock.setText("Stock");
      
      


      bt_legu.setBackground(new java.awt.Color(255,255,255));
      buttonGroup1.add(bt_fruit);
      bt_fruit.setText("Fruit");

      bt_legu.setBackground(new java.awt.Color(255, 255, 255));
      buttonGroup1.add(bt_legu);
      bt_legu.setText("Légume");


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
                  .addComponent(champnom, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                  .addComponent(champprix))
              .addGap(18, 18, 18)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                      .addComponent(labeltype)
                      .addComponent(labelstock)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                      .addComponent(bt_fruit)
                      .addComponent(champstock, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                      .addComponent(bt_legu)
                  	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                  .addGroup(jPanel2Layout.createSequentialGroup()
                       ))));
      
      
      jPanel2Layout.setVerticalGroup(
          jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
              .addContainerGap()
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(labelnom)
                  .addComponent(labeltype)
                  .addComponent(champnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(bt_fruit)
                  .addComponent(bt_legu))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,20, Short.MAX_VALUE)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(labelprix)
                  .addComponent(labelstock)
                  .addComponent(champprix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(champstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      )));

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

      jPanel3.setBackground(new java.awt.Color(255, 255, 255));
      jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventaire des fruits et légumes"));

      table_inv.setModel(new javax.swing.table.DefaultTableModel(
          new Object [][] {

          },
          new String [] {
              "ID", "Nom","Prix", "Stock", "Type"
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
                      .addComponent(bt_sup)))
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

  private void btajoutActionPerformed(java.awt.event.ActionEvent evt) {;
      String type = "";

      if (bt_fruit.isSelected()) {
          type = "Fruit";
      }
      if (bt_legu.isSelected()) {
          type = "Légume";
      }
      
      if (ps.create(new Produit(champnom.getText(), champprix.getText(),champstock.getText(), type))) {
          JOptionPane.showMessageDialog(this, "Ajout effectué");
          clear();
          load();
      }

  }

  private void tableinvMouseClicked(java.awt.event.MouseEvent evt) {
      id = Integer.parseInt(model.getValueAt(table_inv.getSelectedRow(), 0).toString());
      champnom.setText(model.getValueAt(table_inv.getSelectedRow(), 1).toString());
      champprix.setText(model.getValueAt(table_inv.getSelectedRow(), 2).toString());
      champstock.setText(model.getValueAt(table_inv.getSelectedRow(), 3).toString());
      
  }

  private void btmodiActionPerformed(java.awt.event.ActionEvent evt) {
      ps.delete(ps.findById(id));
      load();
      clear();
  }

  private void btsupActionPerformed(java.awt.event.ActionEvent evt) {

      String type = "";
      if (bt_fruit.isSelected()) {
          type = "Fruit";
      }
      if (bt_legu.isSelected()) {
          type = "Légume";
      }
      if (ps.update(new Produit(id,champnom.getText(), champprix.getText(),champstock.getText(), type))) {
          JOptionPane.showMessageDialog(this, "Modification effectuée");
          clear();
          load();
      }
  }
  
  //Déclaration des différents composants
  
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton bt_ajout;
  private javax.swing.JButton bt_modi;
  private javax.swing.JButton bt_sup;
  private javax.swing.JLabel labelnom;
  private javax.swing.JLabel labelprix;
  private javax.swing.JLabel labeltype;
  private javax.swing.JLabel labelstock;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JRadioButton bt_fruit;
  private javax.swing.JRadioButton bt_legu;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable table_inv;
  private javax.swing.JTextField champnom;
  private javax.swing.JTextField champprix;
  private javax.swing.JTextField champstock;
  
}


