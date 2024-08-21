package view;

import code.MethodsSQL;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static view.Login.userEntity;
import view.user.MenuUser;

public class Register extends javax.swing.JFrame {
    
    MethodsSQL methodsSql = new MethodsSQL();
    ImageIcon green = new ImageIcon(getClass().getResource("/resource/Check-True.png"));
    ImageIcon red = new ImageIcon(getClass().getResource("/resource/Check-False.png"));
    private boolean check1, check2, check3, check4, check5;
    
    public Register() {
        initComponents();
        setTitle("Car Agency");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new com.toedter.calendar.JDateChooser();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        iconUserExist = new javax.swing.JLabel();
        iconUserCharacter = new javax.swing.JLabel();
        UserLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        iconRFCExist = new javax.swing.JLabel();
        iconRFCCharacter = new javax.swing.JLabel();
        UserLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        iconEmailValidate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(128, 153, 155));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 640));
        jPanel1.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/back.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 72, 66);

        jPanel2.setBackground(new java.awt.Color(128, 153, 155));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("» NOMBRE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(15, 143, 120, 40);

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setPreferredSize(new java.awt.Dimension(220, 40));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(150, 140, 220, 40);

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setPreferredSize(new java.awt.Dimension(220, 40));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel2.add(txtEmail);
        txtEmail.setBounds(150, 200, 220, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("» CORREO");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(15, 203, 120, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("» USUARIO");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 380, 130, 40);

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setPreferredSize(new java.awt.Dimension(220, 40));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        jPanel2.add(txtUser);
        txtUser.setBounds(150, 380, 220, 40);

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setPreferredSize(new java.awt.Dimension(220, 40));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        jPanel2.add(txtPass);
        txtPass.setBounds(150, 440, 220, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("» CONTRASEÑA");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 440, 140, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("» Edad");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 320, 80, 40);

        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.setForeground(new java.awt.Color(0, 0, 0));
        txtAge.setToolTipText("");
        txtAge.setDateFormatString("yyyy-mm-dd");
        txtAge.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAge.setPreferredSize(new java.awt.Dimension(220, 40));
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });
        jPanel2.add(txtAge);
        txtAge.setBounds(150, 320, 220, 40);

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSave.setText("Siquiente");
        btnSave.setEnabled(false);
        btnSave.setPreferredSize(new java.awt.Dimension(150, 60));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave);
        btnSave.setBounds(110, 510, 150, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/register-menu.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(120, 7, 128, 128);

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC.setPreferredSize(new java.awt.Dimension(220, 40));
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRFCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });
        jPanel2.add(txtRFC);
        txtRFC.setBounds(150, 260, 220, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("» RFC");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 260, 130, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(415, 14, 400, 590);

        jPanel3.setBackground(new java.awt.Color(128, 153, 155));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        UserLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setText("USUARIO");
        UserLabel.setFocusable(false);

        iconUserExist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconUserExist.setForeground(new java.awt.Color(255, 255, 255));
        iconUserExist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconUserExist.setText(" » Usuario no existente");
        iconUserExist.setFocusable(false);

        iconUserCharacter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconUserCharacter.setForeground(new java.awt.Color(255, 255, 255));
        iconUserCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconUserCharacter.setText(" » Minimo 8 caracteres");
        iconUserCharacter.setFocusable(false);

        UserLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UserLabel1.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel1.setText("RFC");
        UserLabel1.setFocusable(false);

        iconRFCExist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconRFCExist.setForeground(new java.awt.Color(255, 255, 255));
        iconRFCExist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconRFCExist.setText(" » RFC no registrado");
        iconRFCExist.setFocusable(false);

        iconRFCCharacter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconRFCCharacter.setForeground(new java.awt.Color(255, 255, 255));
        iconRFCCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconRFCCharacter.setText(" » Minimo 12 caracteres");
        iconRFCCharacter.setFocusable(false);

        UserLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UserLabel2.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel2.setText("CORREO");
        UserLabel2.setFocusable(false);

        iconEmailValidate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iconEmailValidate.setForeground(new java.awt.Color(255, 255, 255));
        iconEmailValidate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Check-False.png"))); // NOI18N
        iconEmailValidate.setText(" » Correo no valido");
        iconEmailValidate.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconUserExist, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconUserCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLabel1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconRFCExist, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconRFCCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(UserLabel2))
                            .addComponent(iconEmailValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserLabel)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(iconUserExist))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(iconUserCharacter)
                .addGap(18, 18, 18)
                .addComponent(UserLabel1)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(iconRFCExist))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(iconRFCCharacter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserLabel2)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(iconEmailValidate))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 140, 320, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        int rfc = evt.getKeyChar();
        if((rfc<65 || rfc>90) && (rfc<97 || rfc>122) && (rfc<48 || rfc>57)){
            evt.consume(); }
        if(txtUser.getText().length()>=12) evt.consume();
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        if(txtPass.getText().length()>=12) evt.consume();
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int name = evt.getKeyChar();
        if((name<65 || name>90) && (name<97 || name>122) && (name != 32)){
            evt.consume(); }
        if(txtName.getText().length()>=25) evt.consume();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        int email = evt.getKeyChar();
        if((email<48 || email>57) && (email<64 || email>90) && 
           (email<97 || email>122) && (email!=45) && (email!=46) &&
           (email!=95)){ evt.consume(); } 
        if(txtEmail.getText().length()>=30) evt.consume();  
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        validateData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        validateUser();
        validateButton();
        iconUserExist.setForeground(Color.WHITE);
        iconUserCharacter.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        int rfc = evt.getKeyChar();
        if((rfc<65 || rfc>90) && (rfc<97 || rfc>122) && (rfc<48 || rfc>57)){
            evt.consume(); }
        if(txtRFC.getText().length()>=13) evt.consume(); 
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtRFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyReleased
        validateRFC();
        validateButton();
        Mayusculas(txtRFC);
        iconRFCExist.setForeground(Color.WHITE);
        iconRFCCharacter.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtRFCKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        Mayuscula(txtName);
        validateButton();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        check5 = isEmail(txtEmail.getText());
        if(check5){ 
            iconEmailValidate.setIcon(green); 
            iconEmailValidate.setText("» Correo Valido");
        } else { iconEmailValidate.setIcon(red); }
        validateButton();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        validateButton();
    }//GEN-LAST:event_txtPassKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        validateButton();
    }//GEN-LAST:event_txtAgeKeyReleased

    public void validateData(){
        String name = txtName.getText();
        String email = txtEmail.getText();
        String rfc = txtRFC.getText().toUpperCase();
        String user = txtUser.getText().toLowerCase();
        String pass = txtPass.getText().toLowerCase();
            if(check1 == true && check2 == true && check3 == true && check4 == true && check5){
                int id = (int) (Math.random()*1500+1000);
                DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String age = formatter.format(txtAge.getDate());
                boolean okey = methodsSql.Register(id, 0, name, email, rfc, user, pass, age);
                if(okey){
                    userEntity = methodsSql.Login(user, pass);
                    this.setVisible(false);
                    MenuUser menu = new MenuUser();
                    menu.setVisible(true);        
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(
                    null, "Error al guardar los datos.",
                    "", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
    }
    
    public void validateUser(){
        if(methodsSql.ValidateUser(txtUser.getText())){
            iconUserExist.setText(" » Usuario ya existente");
            iconUserExist.setIcon(red);
            check1 = false;
        } else {
            iconUserExist.setText(" » Usuario no existente");
            iconUserExist.setIcon(green);
            check1 = true;
        }
        if(txtUser.getText().length() <= 8){
            iconUserCharacter.setText(" » Minimo 8 caracteres");
            iconUserCharacter.setIcon(red);
            check2 = false;
        } else {
            iconUserCharacter.setIcon(green);
            check2 = true;
        }
        if(txtUser.getText().equals("")){
            iconUserExist.setIcon(red);
            iconUserCharacter.setIcon(red);
        }
    }
    
    public void validateRFC(){
        if(methodsSql.ValidateRFC(txtRFC.getText())){
            iconRFCExist.setText(" » RFC ya registrado");
            iconRFCExist.setIcon(red);
            check3 = false;
        } else {
            iconRFCExist.setText(" » RFC no registrado");
            iconRFCExist.setIcon(green);
            check3 = true;
        }
        if(txtRFC.getText().length() < 12){
            iconRFCCharacter.setText(" » Minimo 12 caracteres");
            iconRFCCharacter.setIcon(red);
            check4 = false;
        } else {
            iconRFCCharacter.setIcon(green);
            check4 = true;
        }
        if(txtRFC.getText().equals("")){
            iconRFCExist.setIcon(red);
            iconRFCCharacter.setIcon(red);
        }
    }
    
    public void validateButton(){
        if(txtName.getText().equals("") || txtEmail.getText().equals("") ||
           txtRFC.getText() .equals("") || txtUser.getText() .equals("") || 
           txtPass.getText().equals("") || txtAge.getDate() == null || 
           check1 == false || check2 == false ||
           check3 == false || check4 == false || check5 == false){
                btnSave.setEnabled(false);
        } else {
                btnSave.setEnabled(true);
        }
    }
    
    public void Mayusculas(javax.swing.JTextField jTextfieldS){
         String cadena = (txtRFC.getText()).toUpperCase();
         txtRFC.setText(cadena);
    }
    
    public void Mayuscula(javax.swing.JTextField jTextfieldS){
         String cadena = (txtName.getText()).toUpperCase();
         txtName.setText(cadena);
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel UserLabel1;
    private javax.swing.JLabel UserLabel2;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel iconEmailValidate;
    private javax.swing.JLabel iconRFCCharacter;
    private javax.swing.JLabel iconRFCExist;
    private javax.swing.JLabel iconUserCharacter;
    private javax.swing.JLabel iconUserExist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
