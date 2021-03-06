/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranadudukabak
 */
public class Admin_Paneli extends javax.swing.JDialog {

    /**
     * Creates new form Admin_Paneli
     */
    public Admin_Paneli(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        String kullanici_adi  = Giris_Paneli.kullanici_adi;
        AdminAdiAlani.setText(kullanici_adi);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SarkiIslemleriButonu = new javax.swing.JButton();
        SanatciIslemleriButonu = new javax.swing.JButton();
        AlbumIslemleriButonu = new javax.swing.JButton();
        Top10ListeleriButonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdminAdiAlani = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        SarkiIslemleriButonu.setText("ŞARKI İŞLEMLERİ");
        SarkiIslemleriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SarkiIslemleriButonuActionPerformed(evt);
            }
        });

        SanatciIslemleriButonu.setText("SANATÇI İŞLEMLERİ");
        SanatciIslemleriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SanatciIslemleriButonuActionPerformed(evt);
            }
        });

        AlbumIslemleriButonu.setText("ALBÜM İŞLEMLERİ");
        AlbumIslemleriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbumIslemleriButonuActionPerformed(evt);
            }
        });

        Top10ListeleriButonu.setText("TOP 10 LİSTELERİ");
        Top10ListeleriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Top10ListeleriButonuActionPerformed(evt);
            }
        });

        jLabel1.setText("**********************LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ**********************");

        jLabel2.setText("          ADMIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(SarkiIslemleriButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Top10ListeleriButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SanatciIslemleriButonu, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addGap(37, 37, 37)
                            .addComponent(AlbumIslemleriButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AdminAdiAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SarkiIslemleriButonu, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(AlbumIslemleriButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SanatciIslemleriButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(84, 84, 84)
                .addComponent(Top10ListeleriButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SarkiIslemleriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SarkiIslemleriButonuActionPerformed
        // TODO add your handling code here:
        Giris_Paneli giris = new Giris_Paneli();
        
        Admin_Muzik_Paneli adminMuzikPaneli = new Admin_Muzik_Paneli(giris, true);
        setVisible(false);
            
        adminMuzikPaneli.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_SarkiIslemleriButonuActionPerformed

    private void SanatciIslemleriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SanatciIslemleriButonuActionPerformed
        // TODO add your handling code here:
        Giris_Paneli giris = new Giris_Paneli();
        
        Admin_Sanatci_Paneli adminSanatciPaneli = new Admin_Sanatci_Paneli(giris, true);
        setVisible(false);
            
        adminSanatciPaneli.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_SanatciIslemleriButonuActionPerformed

    private void AlbumIslemleriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbumIslemleriButonuActionPerformed
        // TODO add your handling code here:
        Giris_Paneli giris = new Giris_Paneli();
        
        Admin_Album_Paneli adminAlbumPaneli = new Admin_Album_Paneli(giris, true);
        setVisible(false);
            
        adminAlbumPaneli.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_AlbumIslemleriButonuActionPerformed

    private void Top10ListeleriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Top10ListeleriButonuActionPerformed
        // TODO add your handling code here:
                Giris_Paneli giris = new Giris_Paneli();
        
        Admin_Top_10_Listeleri admintop10 = new Admin_Top_10_Listeleri(giris, true);
        setVisible(false);
            
        admintop10.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_Top10ListeleriButonuActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Admin_Paneli dialog = new Admin_Paneli(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminAdiAlani;
    private javax.swing.JButton AlbumIslemleriButonu;
    private javax.swing.JButton SanatciIslemleriButonu;
    private javax.swing.JButton SarkiIslemleriButonu;
    private javax.swing.JButton Top10ListeleriButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
