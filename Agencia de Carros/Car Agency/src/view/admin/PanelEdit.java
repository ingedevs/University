/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import code.MethodsSQL;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

/**
 *
 * @author Restf
 */
public class PanelEdit extends javax.swing.JPanel {

    MethodsSQL methodsSql = new MethodsSQL();
    ImageIcon green = new ImageIcon(getClass().getResource("/resource/Check-True.png"));
    ImageIcon red = new ImageIcon(getClass().getResource("/resource/Check-False.png"));
    private boolean check1, check2, check3, check4, check5, check6, check7;
    
    public PanelEdit() {
        initComponents();
        lock();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnRemove = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        iconUserExist = new javax.swing.JLabel();
        iconUserCharacter = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        iconRFCExist = new javax.swing.JLabel();
        iconRFCCharacter = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        iconEmailValidate = new javax.swing.JLabel();
        PanelInfo = new javax.swing.JPanel();
        RFCLabel = new javax.swing.JLabel();
        txtRFCNew = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        txtNameNew = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        txtEmailNew = new javax.swing.JTextField();
        UsersLabel = new javax.swing.JLabel();
        txtUserNew = new javax.swing.JTextField();
        PassLabel = new javax.swing.JLabel();
        txtPassNew = new javax.swing.JTextField();
        AgeLabel = new javax.swing.JLabel();
        txtAgeNew = new com.toedter.calendar.JDateChooser();
        StateLabel = new javax.swing.JLabel();
        txtStateNew = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        txtSearchUsers = new javax.swing.JTextField();
        RFCExistsSearch = new javax.swing.JLabel();
        RFCCaracterSearch = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(128, 153, 155));
        jPanel1.setPreferredSize(new java.awt.Dimension(982, 641));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ACTUALIZACION DE USUARIOS");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 0, 550, 71);

        jPanel3.setBackground(new java.awt.Color(128, 153, 155));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        btnRemove.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/remove-128px.png"))); // NOI18N
        btnRemove.setText("LIMPIAR DATOS");
        btnRemove.setContentAreaFilled(false);
        btnRemove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemove.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel3.add(btnRemove);
        btnRemove.setBounds(217, 303, 185, 170);

        btnSave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ready-128px.png"))); // NOI18N
        btnSave.setText("GUARDAR DATOS");
        btnSave.setContentAreaFilled(false);
        btnSave.setEnabled(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);
        btnSave.setBounds(21, 301, 190, 172);

        iconUserExist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconUserExist.setForeground(new java.awt.Color(255, 255, 255));
        iconUserExist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconUserExist.setText(" » Usuario no existente");
        iconUserExist.setFocusable(false);
        jPanel3.add(iconUserExist);
        iconUserExist.setBounds(60, 80, 290, 32);

        iconUserCharacter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconUserCharacter.setForeground(new java.awt.Color(255, 255, 255));
        iconUserCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconUserCharacter.setText(" » Minimo 8 caracteres");
        iconUserCharacter.setFocusable(false);
        jPanel3.add(iconUserCharacter);
        iconUserCharacter.setBounds(60, 120, 290, 32);

        UserLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setText("REQUISITOS");
        UserLabel.setFocusable(false);
        jPanel3.add(UserLabel);
        UserLabel.setBounds(60, 40, 120, 24);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(60, 190, 0, 2);

        iconRFCExist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconRFCExist.setForeground(new java.awt.Color(255, 255, 255));
        iconRFCExist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconRFCExist.setText(" » RFC no registrado");
        iconRFCExist.setFocusable(false);
        jPanel3.add(iconRFCExist);
        iconRFCExist.setBounds(60, 160, 214, 32);

        iconRFCCharacter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconRFCCharacter.setForeground(new java.awt.Color(255, 255, 255));
        iconRFCCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconRFCCharacter.setText(" » Minimo 12 caracteres");
        iconRFCCharacter.setFocusable(false);
        jPanel3.add(iconRFCCharacter);
        iconRFCCharacter.setBounds(60, 200, 242, 32);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(60, 70, 272, 20);
        jPanel3.add(jSeparator4);
        jSeparator4.setBounds(60, 260, 0, 2);

        iconEmailValidate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconEmailValidate.setForeground(new java.awt.Color(255, 255, 255));
        iconEmailValidate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconEmailValidate.setText(" » Correo no valido");
        iconEmailValidate.setFocusable(false);
        jPanel3.add(iconEmailValidate);
        iconEmailValidate.setBounds(60, 240, 201, 32);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 136, 430, 489);

        PanelInfo.setBackground(new java.awt.Color(128, 153, 155));
        PanelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        RFCLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        RFCLabel.setForeground(new java.awt.Color(255, 255, 255));
        RFCLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RFCLabel.setText("» RFC");

        txtRFCNew.setBackground(new java.awt.Color(255, 255, 255));
        txtRFCNew.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtRFCNew.setForeground(new java.awt.Color(0, 0, 0));
        txtRFCNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRFCNewKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCNewKeyTyped(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NameLabel.setText("» Nombre");

        txtNameNew.setBackground(new java.awt.Color(255, 255, 255));
        txtNameNew.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtNameNew.setForeground(new java.awt.Color(0, 0, 0));
        txtNameNew.setPreferredSize(new java.awt.Dimension(220, 40));
        txtNameNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameNewKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameNewKeyTyped(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmailLabel.setText("» Corrreo");

        txtEmailNew.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailNew.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtEmailNew.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailNew.setPreferredSize(new java.awt.Dimension(220, 40));
        txtEmailNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailNewKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailNewKeyTyped(evt);
            }
        });

        UsersLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UsersLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsersLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsersLabel.setText("» Usuario");
        UsersLabel.setToolTipText("");

        txtUserNew.setBackground(new java.awt.Color(255, 255, 255));
        txtUserNew.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtUserNew.setForeground(new java.awt.Color(0, 0, 0));
        txtUserNew.setPreferredSize(new java.awt.Dimension(220, 40));
        txtUserNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNewActionPerformed(evt);
            }
        });
        txtUserNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNewKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNewKeyTyped(evt);
            }
        });

        PassLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(255, 255, 255));
        PassLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PassLabel.setText("» Contraseña");

        txtPassNew.setBackground(new java.awt.Color(255, 255, 255));
        txtPassNew.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtPassNew.setForeground(new java.awt.Color(0, 0, 0));
        txtPassNew.setPreferredSize(new java.awt.Dimension(220, 40));
        txtPassNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassNewKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassNewKeyTyped(evt);
            }
        });

        AgeLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        AgeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AgeLabel.setText("» Edad");

        txtAgeNew.setBackground(new java.awt.Color(255, 255, 255));
        txtAgeNew.setToolTipText("");
        txtAgeNew.setDateFormatString("yyyy-mm-dd");
        txtAgeNew.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAgeNew.setPreferredSize(new java.awt.Dimension(220, 40));
        txtAgeNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeNewKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeNewKeyTyped(evt);
            }
        });

        StateLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        StateLabel.setForeground(new java.awt.Color(255, 255, 255));
        StateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StateLabel.setText("» Estado");

        txtStateNew.setBackground(new java.awt.Color(255, 255, 255));
        txtStateNew.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtStateNew.setForeground(new java.awt.Color(0, 0, 0));
        txtStateNew.setMaximumRowCount(2);
        txtStateNew.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addComponent(RFCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRFCNew))
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgeLabel)
                            .addComponent(UsersLabel))
                        .addGap(46, 46, 46)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStateNew, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAgeNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRFCNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RFCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStateNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1.add(PanelInfo);
        PanelInfo.setBounds(470, 136, 452, 489);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("» Ingrese RFC de usuario para actualizar datos:");
        jPanel1.add(jLabel44);
        jLabel44.setBounds(44, 78, 454, 28);

        txtSearchUsers.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchUsers.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtSearchUsers.setForeground(new java.awt.Color(0, 0, 0));
        txtSearchUsers.setPreferredSize(new java.awt.Dimension(220, 40));
        txtSearchUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchUsersKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchUsersKeyTyped(evt);
            }
        });
        jPanel1.add(txtSearchUsers);
        txtSearchUsers.setBounds(504, 74, 232, 40);

        RFCExistsSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RFCExistsSearch.setForeground(new java.awt.Color(255, 255, 255));
        RFCExistsSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        RFCExistsSearch.setText(" » RFC no encontrado");
        RFCExistsSearch.setFocusable(false);
        jPanel1.add(RFCExistsSearch);
        RFCExistsSearch.setBounds(742, 60, 224, 32);

        RFCCaracterSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RFCCaracterSearch.setForeground(new java.awt.Color(255, 255, 255));
        RFCCaracterSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        RFCCaracterSearch.setText(" » Minimo 12 caracteres");
        RFCCaracterSearch.setFocusable(false);
        jPanel1.add(RFCCaracterSearch);
        RFCCaracterSearch.setBounds(742, 98, 242, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        clear();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        validateData();
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtEmailNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailNewKeyTyped
        int email = evt.getKeyChar();
        if((email<48 || email>57) && (email<64 || email>90) && 
           (email<97 || email>122) && (email!=45) && (email!=46) &&
           (email!=95)){ evt.consume(); } 
        if(txtEmailNew.getText().length()>=30) evt.consume();  
    }//GEN-LAST:event_txtEmailNewKeyTyped

    private void txtUserNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNewActionPerformed

    private void txtUserNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNewKeyTyped
        int rfc = evt.getKeyChar();
        if((rfc<65 || rfc>90) && (rfc<97 || rfc>122) && (rfc<48 || rfc>57)){
            evt.consume(); }
        if(txtUserNew.getText().length()>=12) evt.consume();
    }//GEN-LAST:event_txtUserNewKeyTyped

    private void txtPassNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassNewKeyTyped
        if(txtPassNew.getText().length()>=12) evt.consume();    
    }//GEN-LAST:event_txtPassNewKeyTyped

    private void txtNameNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameNewKeyTyped
        int name = evt.getKeyChar();
        if((name<65 || name>90) && (name<97 || name>122) && (name != 32)){
            evt.consume(); }
        if(txtNameNew.getText().length()>=25) evt.consume();               
    }//GEN-LAST:event_txtNameNewKeyTyped

    private void txtAgeNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeNewKeyReleased
        validateButton();
    }//GEN-LAST:event_txtAgeNewKeyReleased

    private void txtAgeNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeNewKeyTyped

    }//GEN-LAST:event_txtAgeNewKeyTyped

    private void txtSearchUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchUsersKeyReleased
        validateRFCsearch();
        RFCExistsSearch.setForeground(Color.WHITE);
        RFCCaracterSearch.setForeground(Color.WHITE); 
        MayusculasRFC(txtSearchUsers);
        if(check5 == true && check6 == true){
          unlock();
        }
    }//GEN-LAST:event_txtSearchUsersKeyReleased

    private void txtUserNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNewKeyReleased
        validateUser();
        validateButton();
        iconUserExist.setForeground(Color.WHITE);
        iconUserCharacter.setForeground(Color.WHITE);       
    }//GEN-LAST:event_txtUserNewKeyReleased

    private void txtRFCNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCNewKeyReleased
        validateRFC();
        validateButton();
        RFCExistsSearch.setForeground(Color.WHITE);
        Mayusculas(txtSearchUsers);
        if(check1 == true && check2 == true && check4 == true && check4 == true){
          
        }
    }//GEN-LAST:event_txtRFCNewKeyReleased

    private void txtNameNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameNewKeyReleased
        Mayuscula(txtNameNew);
        validateButton();
    }//GEN-LAST:event_txtNameNewKeyReleased

    private void txtEmailNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailNewKeyReleased
        check7 = isEmail(txtEmailNew.getText());
        if(check7){ iconEmailValidate.setIcon(green); 
        iconEmailValidate.setText("» Correo Valido");
        } else { iconEmailValidate.setIcon(red); }
        validateButton();
    }//GEN-LAST:event_txtEmailNewKeyReleased

    private void txtPassNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassNewKeyReleased
        validateButton();
    }//GEN-LAST:event_txtPassNewKeyReleased

    private void txtRFCNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCNewKeyTyped
        int rfc = evt.getKeyChar();
        if((rfc<65 || rfc>90) && (rfc<97 || rfc>122) && (rfc<48 || rfc>57)){
            evt.consume(); }  
        if(txtRFCNew.getText().length()>=13) evt.consume();        
    }//GEN-LAST:event_txtRFCNewKeyTyped

    private void txtSearchUsersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchUsersKeyTyped
        int rfc = evt.getKeyChar();
        if((rfc<65 || rfc>90) && (rfc<97 || rfc>122) && (rfc<48 || rfc>57)){
            evt.consume(); }
        if(txtSearchUsers.getText().length()>=13) evt.consume(); 
    }//GEN-LAST:event_txtSearchUsersKeyTyped
    
    public void validateData(){
        int state = txtStateNew.getSelectedIndex();
        String name = txtNameNew.getText();
        String email = txtEmailNew.getText();
        String rfc = txtRFCNew.getText().toUpperCase();
        String user = txtUserNew.getText().toLowerCase();
        String pass = txtPassNew.getText().toLowerCase();
            if(check1 == true && check2 == true && check3 == true && check4 == true && check7 == true){
                DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String age = formatter.format(txtAgeNew.getDate());
                methodsSql.ModifyUserDataAdmin(txtSearchUsers.getText(), state, name, email, rfc, user, pass, age);
            } 
    }
    
    public void validateUser(){
        if(methodsSql.ValidateUser(txtUserNew.getText())){
            iconUserExist.setText(" » Usuario ya existente");
            iconUserExist.setIcon(red);
            check1 = false;
        } else {
            iconUserExist.setText(" » Usuario no existente");
            iconUserExist.setIcon(green);
            check1 = true;
        }
        
        if(txtUserNew.getText().length() <= 8){
            iconUserCharacter.setText(" » Minimo 8 caracteres");
            iconUserCharacter.setIcon(red);
            check2 = false;
        } else {
            iconUserCharacter.setIcon(green);
            check2 = true;
        }
        if(txtUserNew.getText().equals("")){
            iconUserExist.setIcon(red);
            iconUserCharacter.setIcon(red);
        }
    }
    
    public void validateRFC(){
        if(methodsSql.ValidateRFC(txtRFCNew.getText())){
            iconRFCExist.setText(" » RFC ya existente");
            iconRFCExist.setIcon(red);
            check3 = false;
        } else {
            iconRFCExist.setText(" » RFC no existente");
            iconRFCExist.setIcon(green);
            check3 = true;
        }
        
        if(txtRFCNew.getText().length() < 12){
            iconRFCCharacter.setText(" » Minimo 12 caracteres");
            iconRFCCharacter.setIcon(red);
            check4 = false;
        } else {
            iconRFCCharacter.setIcon(green);
            check4 = true;
        }
        if(txtRFCNew.getText().equals("")){
            iconRFCExist.setIcon(red);
            iconRFCCharacter.setIcon(red);
        }
    }
    
    public void validateRFCsearch(){
        if(methodsSql.ValidateRFC(txtSearchUsers.getText())){
            RFCExistsSearch.setText(" » RFC encontrado");
            RFCExistsSearch.setIcon(green);
            check5 = true;
        } else {
            RFCExistsSearch.setText(" » RFC no encontrado");
            RFCExistsSearch.setIcon(red);
            check5 = false;
        }
        
        if(txtSearchUsers.getText().length() < 12){
            RFCCaracterSearch.setText(" » Minimo 12 caracteres");
            RFCCaracterSearch.setIcon(red);
            check6 = false;
        } else {
            RFCCaracterSearch.setIcon(green);
            check6 = true;
        }
    }
    
    public void validateButton(){
        if(txtNameNew.getText().equals("") || txtEmailNew.getText().equals("") ||
           txtRFCNew.getText() .equals("") || txtUserNew.getText() .equals("") || 
           txtPassNew.getText().equals("") || txtAgeNew.getDate() == null || 
           check1 == false || check2 == false ||
           check3 == false || check4 == false || check7 == false){
                btnSave.setEnabled(false);
        } else {
                btnSave.setEnabled(true);
        }
    }
    
    public void clear(){
        txtSearchUsers.setText(null);
        txtRFCNew.setText(null);
        txtNameNew.setText(null);
        txtEmailNew.setText(null);
        txtUserNew.setText(null);
        txtPassNew.setText(null);
        iconUserExist.setIcon(red);
        iconUserCharacter.setIcon(red);
        iconUserExist.setText(" » Usuario no existente");
        iconRFCCharacter.setIcon(red);
        iconRFCExist.setIcon(red);
        iconRFCExist.setText(" » RFC no registrado");
        RFCExistsSearch.setIcon(red);
        RFCCaracterSearch.setIcon(red);
        RFCExistsSearch.setText(" » RFC no encontrado");
        iconEmailValidate.setIcon(red);
        iconEmailValidate.setText(" » Email no valido");
        lock();
    }
    
    public void MayusculasRFC(javax.swing.JTextField jTextfieldS){
         String cadena = (txtSearchUsers.getText()).toUpperCase();
         txtSearchUsers.setText(cadena);
    }
    
    public void Mayusculas(javax.swing.JTextField jTextfieldS){
         String cadena = (txtRFCNew.getText()).toUpperCase();
         txtRFCNew.setText(cadena);
    }
    
    public void lock(){
        for(Component a: PanelInfo.getComponents()){
            a.setEnabled(false);
        }
        btnSave.setEnabled(false);
    }
    
    public void unlock(){
        for(Component a: PanelInfo.getComponents()){
            a.setEnabled(true);
        }
    }
    
    public void Mayuscula(javax.swing.JTextField jTextfieldS){
         String cadena = (txtNameNew.getText()).toUpperCase();
         txtNameNew.setText(cadena);
    }
    
    public boolean isEmail(String correo) {
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        Matcher mather = pattern.matcher(correo);
        if (mather.find()) {
            return true;
        }else{
            return false;
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JLabel RFCCaracterSearch;
    private javax.swing.JLabel RFCExistsSearch;
    private javax.swing.JLabel RFCLabel;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel UsersLabel;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel iconEmailValidate;
    private javax.swing.JLabel iconRFCCharacter;
    private javax.swing.JLabel iconRFCExist;
    private javax.swing.JLabel iconUserCharacter;
    private javax.swing.JLabel iconUserExist;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private com.toedter.calendar.JDateChooser txtAgeNew;
    private javax.swing.JTextField txtEmailNew;
    private javax.swing.JTextField txtNameNew;
    private javax.swing.JTextField txtPassNew;
    private javax.swing.JTextField txtRFCNew;
    private javax.swing.JTextField txtSearchUsers;
    private javax.swing.JComboBox<String> txtStateNew;
    private javax.swing.JTextField txtUserNew;
    // End of variables declaration//GEN-END:variables
}
