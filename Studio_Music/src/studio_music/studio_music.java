/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studio_music;
import java.awt.event.KeyEvent;
import java.awt.Component;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OVIN
 */
public class studio_music extends javax.swing.JFrame {

    /**
     * Creates new form studio_music
     */
    public studio_music() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("studio_music?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        transaksiQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Transaksi t");
        transaksiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : transaksiQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No.Telp");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Studio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 210, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 210, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 210, -1));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga Sewa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lama Sewa");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 210, -1));

        jTextField5.setEditable(false);
        jTextField5.setBackground(java.awt.Color.white);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 210, -1));

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, -1, -1));

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setText("Cencel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, -1, -1));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jTextField6.setEditable(false);
        jTextField6.setBackground(java.awt.Color.white);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 210, -1));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Aplikasi Studio Music");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 11, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Studio", "Studio 1", "Studio 2", "Studio 3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 210, -1));

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No.Transaksi");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 210, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 354, -1, -1));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, transaksiList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idTransaksi}"));
        columnBinding.setColumnName("Id Transaksi");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nama}"));
        columnBinding.setColumnName("Nama");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${alamat}"));
        columnBinding.setColumnName("Alamat");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${noTelp}"));
        columnBinding.setColumnName("No Telp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${studio}"));
        columnBinding.setColumnName("Studio");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hargaSewa}"));
        columnBinding.setColumnName("Harga Sewa");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lamaSewa}"));
        columnBinding.setColumnName("Lama Sewa");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${total}"));
        columnBinding.setColumnName("Total");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 550, 160));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\capitol paris studio a 1280x768.jpg")); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 700, 730));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int nomer = jComboBox1.getSelectedIndex();
        if(nomer == 1){
            jTextField5.setText("50000");
        }
        if(nomer == 2){
            jTextField5.setText("75000");
        }
        if(nomer == 3){
            jTextField5.setText("100000");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 //koneksi kon = new koneksi();
        String sql = "INSERT INTO transaksi VALUES('"+jTextField7.getText()+
                "','"+jTextField1.getText()+"','"+jTextField3.getText()+
                "','"+jTextField4.getText()+"','"+jComboBox1.getSelectedIndex()+"','"+jTextField5.getText()+
                "','"+jTextField2.getText()+"','"+jTextField6.getText()+"')";
       try {
        Connection con = new koneksi().getkoneksi();
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Data Berhasil Di tambahkan","Data Berhasil Di Update",JOptionPane.INFORMATION_MESSAGE);
         st.close();
         transaksiList.clear();
         transaksiList.addAll(transaksiQuery.getResultList());
         bindingGroup.unbind();
         bindingGroup.bind();
         jTextField7.setText("");
         jTextField1.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jComboBox1.setSelectedItem("");
         jTextField5.setText("");
         jTextField2.setText("");
         jTextField6.setText("");
         con.close();
         
        } catch (SQLException ex) {
            System.out.println("Salah ketik nih");
        }
      
    
                         
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
  if (evt.getKeyCode()==KeyEvent.VK_ENTER){
       int harga = Integer.parseInt(jTextField5.getText());
      int total;
      int lama = Integer.parseInt(jTextField2.getText());
      total = harga * lama;
      jTextField6.setText(Integer.toString(total));
  }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String sql= "DELETE FROM transaksi WHERE id_transaksi='"+jTextField7.getText()+"'";
  try {
        Connection con = new koneksi().getkoneksi();
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Data Berhasil Di hapus","Data Berhasil Di Update",JOptionPane.INFORMATION_MESSAGE);
         
        
         st.close();
         transaksiList.clear();
         transaksiList.addAll(transaksiQuery.getResultList());
         bindingGroup.unbind();
         bindingGroup.bind();
         jTextField7.setText("");
         jTextField1.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jComboBox1.setSelectedItem("");
         jTextField5.setText("");
         jTextField2.setText("");
         jTextField6.setText("");
         con.close();
         
         
        } catch (SQLException ex) {
            System.out.println("Salah ketik nih");
        } 
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int row =jTable1.getSelectedRow();
jTextField7.setText(jTable1.getValueAt(row, 0).toString());
         jTextField1.setText(jTable1.getValueAt(row, 1).toString());
         jTextField3.setText(jTable1.getValueAt(row, 2).toString());
         jTextField4.setText(jTable1.getValueAt(row, 3).toString());
         jComboBox1.setSelectedItem(jTable1.getValueAt(row, 4).toString());
         jTextField5.setText(jTable1.getValueAt(row, 5).toString());
         jTextField2.setText(jTable1.getValueAt(row, 6).toString());
         jTextField6.setText(jTable1.getValueAt(row, 7).toString());
// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studio_music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studio_music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studio_music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studio_music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studio_music().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private java.util.List<studio_music.Transaksi> transaksiList;
    private javax.persistence.Query transaksiQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private static class Transaksi {

        public Transaksi() {
        }
    }
}
