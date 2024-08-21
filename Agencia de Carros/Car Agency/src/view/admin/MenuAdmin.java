/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import view.Login;
import view.Menu;
import view.ModifyUser;

/**
 *
 * @author serk9
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form operaciones
     */
    public MenuAdmin() {
       initComponents();
       setTitle("Car Agency - Menu de Administrador - [ "+Login.userEntity.getName()+" ]");
       setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        MenuUserPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnModify = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSales = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnInventory = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        leave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MenuUserPanel.setBackground(new java.awt.Color(128, 153, 155));

        jPanel1.setBackground(new java.awt.Color(128, 153, 155));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnModify.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuAdmin-edit-off.png"))); // NOI18N
        btnModify.setText("CUENTA");
        btnModify.setContentAreaFilled(false);
        btnModify.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnModify.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuAdmin-edit-on.png"))); // NOI18N
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(128, 153, 155));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSales.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSales.setForeground(new java.awt.Color(255, 255, 255));
        btnSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuAdmin-sales-off.png"))); // NOI18N
        btnSales.setText("VENTAS");
        btnSales.setContentAreaFilled(false);
        btnSales.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSales.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuAdmin-sales-on.png"))); // NOI18N
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSales, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(128, 153, 155));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnInventory.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuAdmin-inventory-off.png"))); // NOI18N
        btnInventory.setText("INVENTARIO");
        btnInventory.setContentAreaFilled(false);
        btnInventory.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInventory.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuAdmin-inventory-on.png"))); // NOI18N
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInventory, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(128, 153, 155));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuAdmin-list-off.png"))); // NOI18N
        jButton1.setText("USUARIOS");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuAdmin-list-on.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/user-128px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BIENVENIDO");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("» Nombre: "+Login.userEntity.getName());

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("» Usuario: "+Login.userEntity.getUser());

        leave.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        leave.setForeground(new java.awt.Color(0, 0, 0));
        leave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/back.png"))); // NOI18N
        leave.setText("CERRAR SESION");
        leave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuUserPanelLayout = new javax.swing.GroupLayout(MenuUserPanel);
        MenuUserPanel.setLayout(MenuUserPanelLayout);
        MenuUserPanelLayout.setHorizontalGroup(
            MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUserPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuUserPanelLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MenuUserPanelLayout.createSequentialGroup()
                        .addGroup(MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                        .addGroup(MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuUserPanelLayout.createSequentialGroup()
                                .addGroup(MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuUserPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(40, 40, 40))
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(MenuUserPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))))
                                .addGap(341, 341, 341))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuUserPanelLayout.createSequentialGroup()
                                .addComponent(leave)
                                .addGap(14, 14, 14))))))
        );
        MenuUserPanelLayout.setVerticalGroup(
            MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUserPanelLayout.createSequentialGroup()
                .addGroup(MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuUserPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuUserPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(leave, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(MenuUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuUserPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuUserPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        this.setVisible(false);
        ModifyUser modify = new ModifyUser();
        modify.setVisible(true); 
        dispose();
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        this.setVisible(false);
        Sales sales = new Sales();
        sales.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        this.setVisible(false);
        Inventory inventory = new Inventory();
        inventory.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Users users = new Users();
        users.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void leaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveMouseClicked
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_leaveMouseClicked

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuUserPanel;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel leave;
    // End of variables declaration//GEN-END:variables
}
