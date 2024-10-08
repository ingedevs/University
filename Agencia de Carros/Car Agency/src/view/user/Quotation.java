/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.user;

import code.MethodsSQL;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import view.Login;

/**
 *
 * @author Restf
 */
public class Quotation extends javax.swing.JFrame {
    
    MethodsSQL methodsSql = new MethodsSQL();
    ImageIcon car  = new ImageIcon(getClass().getResource("/resource/car.png"));
    ImageIcon nissanWhite  = new ImageIcon(getClass().getResource("/resource/car-nissan-white.png"));
    ImageIcon nissanRed    = new ImageIcon(getClass().getResource("/resource/car-nissan-red.png"));
    ImageIcon nissanOrange = new ImageIcon(getClass().getResource("/resource/car-nissan-orage.png"));
    ImageIcon nissanYellow = new ImageIcon(getClass().getResource("/resource/car-nissan-yellow.png"));
    ImageIcon nissanGreen  = new ImageIcon(getClass().getResource("/resource/car-nissan-green.png"));
    ImageIcon nissanBlue   = new ImageIcon(getClass().getResource("/resource/car-nissan-blue.png"));
    ImageIcon nissanGray   = new ImageIcon(getClass().getResource("/resource/car-nissan-gray.png"));
    
    ImageIcon audiWhite  = new ImageIcon(getClass().getResource("/resource/car-audi-white.png"));
    ImageIcon audiRed    = new ImageIcon(getClass().getResource("/resource/car-audi-red.png"));
    ImageIcon audiOrange = new ImageIcon(getClass().getResource("/resource/car-audi-orage.png"));
    ImageIcon audiYellow = new ImageIcon(getClass().getResource("/resource/car-audi-yellow.png"));
    ImageIcon audiGreen  = new ImageIcon(getClass().getResource("/resource/car-audi-green.png"));
    ImageIcon audiBlue   = new ImageIcon(getClass().getResource("/resource/car-audi-blue.png"));
    ImageIcon audiGray   = new ImageIcon(getClass().getResource("/resource/car-audi-gray.png"));
    
    ImageIcon volkswagenWhite  = new ImageIcon(getClass().getResource("/resource/car-volkswagen-white.png"));
    ImageIcon volkswagenRed    = new ImageIcon(getClass().getResource("/resource/car-volkswagen-red.png"));
    ImageIcon volkswagenOrange = new ImageIcon(getClass().getResource("/resource/car-volkswagen-orage.png"));
    ImageIcon volkswagenYellow = new ImageIcon(getClass().getResource("/resource/car-volkswagen-yellow.png"));
    ImageIcon volkswagenGreen  = new ImageIcon(getClass().getResource("/resource/car-volkswagen-green.png"));
    ImageIcon volkswagenBlue   = new ImageIcon(getClass().getResource("/resource/car-volkswagen-blue.png"));
    ImageIcon volkswagenGray   = new ImageIcon(getClass().getResource("/resource/car-volkswagen-gray.png"));
    
    public Quotation() {
        initComponents();
        setTitle("Car Agency - Cotización - [ "+Login.userEntity.getName()+" ]");
        setLocationRelativeTo(null);
        selectColorsNew.setVisible(false);
        btnPurchase.setEnabled(false);
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
        iconCar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        selectCompany = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectState = new javax.swing.JComboBox<>();
        selectModel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selectColors = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPriceTotal = new javax.swing.JLabel();
        txtExtra = new javax.swing.JLabel();
        txtPriceCar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        selectSerial = new javax.swing.JComboBox<>();
        selectColorsNew = new javax.swing.JComboBox<>();
        btnPurchase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(128, 153, 155));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/back.png"))); // NOI18N
        jLabel7.setText("VOLVER");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        iconCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("► SELECCIONA LOS SIGUIENTES DATOS  ◄");
        jLabel5.setToolTipText("");

        selectCompany.setBackground(new java.awt.Color(255, 255, 255));
        selectCompany.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        selectCompany.setForeground(new java.awt.Color(0, 0, 0));
        selectCompany.setMaximumRowCount(4);
        selectCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "• NISSAN", "• AUDI", "• VOLKSWAGEN" }));
        selectCompany.setPreferredSize(new java.awt.Dimension(220, 40));
        selectCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCompanyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("» COMPAÑIA");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("» ESTADO");
        jLabel2.setToolTipText("");

        selectState.setBackground(new java.awt.Color(255, 255, 255));
        selectState.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        selectState.setForeground(new java.awt.Color(0, 0, 0));
        selectState.setMaximumRowCount(4);
        selectState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "• NUEVO", "• SEMINUEVO", "• USADO", " " }));
        selectState.setEnabled(false);
        selectState.setPreferredSize(new java.awt.Dimension(220, 40));
        selectState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectStateActionPerformed(evt);
            }
        });

        selectModel.setBackground(new java.awt.Color(255, 255, 255));
        selectModel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        selectModel.setForeground(new java.awt.Color(0, 0, 0));
        selectModel.setMaximumRowCount(4);
        selectModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        selectModel.setEnabled(false);
        selectModel.setPreferredSize(new java.awt.Dimension(220, 40));
        selectModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectModelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("» MODELO");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("» COLORES");
        jLabel4.setToolTipText("");

        selectColors.setBackground(new java.awt.Color(255, 255, 255));
        selectColors.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        selectColors.setForeground(new java.awt.Color(0, 0, 0));
        selectColors.setMaximumRowCount(4);
        selectColors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        selectColors.setEnabled(false);
        selectColors.setPreferredSize(new java.awt.Dimension(220, 40));
        selectColors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectColorsActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRECIO:        $");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ADICIONES:  $");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TOTAL:         $");

        txtPriceTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtPriceTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtPriceTotal.setText("-----------");

        txtExtra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtExtra.setForeground(new java.awt.Color(255, 255, 255));
        txtExtra.setText("-----------");

        txtPriceCar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtPriceCar.setForeground(new java.awt.Color(255, 255, 255));
        txtPriceCar.setText("-----------");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("» N! SERIE");
        jLabel10.setToolTipText("");

        selectSerial.setBackground(new java.awt.Color(255, 255, 255));
        selectSerial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        selectSerial.setForeground(new java.awt.Color(0, 0, 0));
        selectSerial.setMaximumRowCount(4);
        selectSerial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        selectSerial.setEnabled(false);
        selectSerial.setPreferredSize(new java.awt.Dimension(220, 40));
        selectSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSerialActionPerformed(evt);
            }
        });

        selectColorsNew.setBackground(new java.awt.Color(255, 255, 255));
        selectColorsNew.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        selectColorsNew.setForeground(new java.awt.Color(0, 0, 0));
        selectColorsNew.setMaximumRowCount(4);
        selectColorsNew.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "• BLANCO", "• ROJO", "• NARANJA", "• AMARILLO", "• VERDE", "• AZUL", "• GRIS" }));
        selectColorsNew.setEnabled(false);
        selectColorsNew.setPreferredSize(new java.awt.Dimension(220, 40));
        selectColorsNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectColorsNewActionPerformed(evt);
            }
        });

        btnPurchase.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(255, 255, 255));
        btnPurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuUser-price-off.png"))); // NOI18N
        btnPurchase.setText("¿DESEAS COMPRAR LO BUSCADO?");
        btnPurchase.setContentAreaFilled(false);
        btnPurchase.setEnabled(false);
        btnPurchase.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnPurchase.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MenuUser-price-on.png"))); // NOI18N
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1092, 1092, 1092)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectState, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectModel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectColors, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectColorsNew, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconCar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel6)
                                .addGap(3, 3, 3)
                                .addComponent(txtPriceCar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(selectSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconCar)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtPriceCar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectColors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectColorsNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtExtra)
                        .addGap(8, 8, 8)
                        .addComponent(txtPriceTotal))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
        MenuUser menu = new MenuUser();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void selectCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCompanyActionPerformed
        if (selectCompany.getSelectedIndex() > 0) {
            selectState.setEnabled(true);
            selectState.setSelectedIndex(0);
            iconCar.setIcon(car);
            txtPriceCar.setText("-----------");
            txtExtra.setText("-----------");
            txtPriceTotal.setText("-----------");
            switch(selectCompany.getSelectedIndex()){
                case 1:
                    iconCar.setIcon(nissanWhite);
                    break;
                case 2:
                    iconCar.setIcon(audiWhite);
                    break;
                case 3:
                    iconCar.setIcon(volkswagenWhite);
                    break;
            }
        } else {
            clear();
        }
    }//GEN-LAST:event_selectCompanyActionPerformed

    private void selectStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectStateActionPerformed
        if (selectState.getSelectedIndex() > 0) {
            selectModel.setEnabled(true);
            selectSerial.setEnabled(false);
            selectSerial.setSelectedIndex(0);
            txtPriceCar.setText("-----------");
            txtExtra.setText("-----------");
            txtPriceTotal.setText("-----------");
            switch(selectCompany.getSelectedIndex()){
                case 1:
                    iconCar.setIcon(nissanWhite);
                    break;
                case 2:
                    iconCar.setIcon(audiWhite);
                    break;
                case 3:
                    iconCar.setIcon(volkswagenWhite);
                    break;
            }
            selectModel.setModel(methodsSql.loadModels(selectCompany.getSelectedIndex(), selectState.getSelectedIndex()));
        } else {
            iconCar.setIcon(car);
            selectModel.setEnabled(false);
            selectSerial.setEnabled(false);
            selectColors.setEnabled(false);
            selectModel.setSelectedIndex(0);
            selectSerial.setSelectedIndex(0);
            selectColors.setSelectedIndex(0);
        }
    }//GEN-LAST:event_selectStateActionPerformed

    private void selectModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectModelActionPerformed
        if (selectModel.getSelectedIndex() > 0) {
            selectSerial.setEnabled(true);
            String txtmodel = selectModel.getSelectedItem().toString();
            String model = txtmodel.substring(2);
            selectSerial.setModel(methodsSql.loadSerial(model));
            txtPriceCar.setText("-----------");
            txtExtra.setText("-----------");
            txtPriceTotal.setText("-----------");
        } else {
            selectSerial.setEnabled(false);
            selectColors.setEnabled(false);
            selectSerial.setSelectedIndex(0);
            selectColors.setSelectedIndex(0);
        }
    }//GEN-LAST:event_selectModelActionPerformed

    private void selectColorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectColorsActionPerformed
        if(!selectColors.getSelectedItem().equals("Seleccionar") &&
           !selectColors.getSelectedItem().equals("• Otro: ")){
                String txtcompany = selectCompany.getSelectedItem().toString();
                String company = txtcompany.substring(2);
                String txtcolor = selectColors.getSelectedItem().toString();
                String color = txtcolor.substring(2);
                switch(company){
                    case "NISSAN":
                    switch(color){
                        case "BLANCO":
                        iconCar.setIcon(nissanWhite);
                        break;
                        case "ROJO":
                        iconCar.setIcon(nissanRed);
                        break;
                        case "NARANJA":
                        iconCar.setIcon(nissanOrange);
                        break;
                        case "AMARILLO":
                        iconCar.setIcon(nissanYellow);
                        break;
                        case "VERDE":
                        iconCar.setIcon(nissanGreen);
                        break;
                        case "AZUL":
                        iconCar.setIcon(nissanBlue);
                        break;
                        case "GRIS":
                        iconCar.setIcon(nissanGray);
                        break;
                    }
                    break;
                    case "AUDI":
                    switch(color){
                        case "BLANCO":
                        iconCar.setIcon(audiWhite);
                        break;
                        case "ROJO":
                        iconCar.setIcon(audiRed);
                        break;
                        case "NARANJA":
                        iconCar.setIcon(audiOrange);
                        break;
                        case "AMARILLO":
                        iconCar.setIcon(audiYellow);
                        break;
                        case "VERDE":
                        iconCar.setIcon(audiGreen);
                        break;
                        case "AZUL":
                        iconCar.setIcon(audiBlue);
                        break;
                        case "GRIS":
                        iconCar.setIcon(audiGray);
                        break;
                    }
                    break;
                    case "VOLKSWAGEN":
                    switch(color){
                        case "BLANCO":
                        iconCar.setIcon(volkswagenWhite);
                        break;
                        case "ROJO":
                        iconCar.setIcon(volkswagenRed);
                        break;
                        case "NARANJA":
                        iconCar.setIcon(volkswagenOrange);
                        break;
                        case "AMARILLO":
                        iconCar.setIcon(volkswagenYellow);
                        break;
                        case "VERDE":
                        iconCar.setIcon(volkswagenGreen);
                        break;
                        case "AZUL":
                        iconCar.setIcon(volkswagenBlue);
                        break;
                        case "GRIS":
                        iconCar.setIcon(volkswagenGray);
                        break;
                    }
                    break;
                }
            btnPurchase.setEnabled(true); 
        } else if(selectColors.getSelectedItem().equals("• Otro: ")) {
            selectColorsNew.setVisible(true);
            selectColorsNew.setEnabled(true);
            selectColorsNew.setSelectedIndex(0);
            switch(selectCompany.getSelectedIndex()){
                case 1:
                    iconCar.setIcon(nissanWhite);
                    break;
                case 2:
                    iconCar.setIcon(audiWhite);
                    break;
                case 3:
                    iconCar.setIcon(volkswagenWhite);
                    break;
            }
        } else {
            selectColorsNew.setSelectedIndex(0);
            selectColorsNew.setVisible(false);
        }
        
        
        
        
    }//GEN-LAST:event_selectColorsActionPerformed

    private void selectSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSerialActionPerformed
        if (selectSerial.getSelectedIndex() > 0) {
            selectColors.setEnabled(true);
            String txt = selectSerial.getSelectedItem().toString();
            String txtmodel = txt.substring(2);
            int model = Integer.parseInt(txtmodel);
            selectColors.setModel(methodsSql.loadColorsQuotation(model));
            String s = moneyFormat(methodsSql.loadPriceCar(model)); 
            txtPriceCar.setText(s);
            if(!selectColorsNew.isEnabled()){
                txtPriceTotal.setText(s);
            }
            
        } else {
            selectColors.setEnabled(false);
            selectColors.setSelectedIndex(0);
        }
        
    }//GEN-LAST:event_selectSerialActionPerformed

    private void selectColorsNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectColorsNewActionPerformed
        if(selectColorsNew.isEnabled()){
            String txtcompany = selectCompany.getSelectedItem().toString();
            String company = txtcompany.substring(2);
            String txtcolor = selectColorsNew.getSelectedItem().toString();
            String color = txtcolor.substring(2);
            int price = 0;
            switch(company){
                case "NISSAN":
                switch(color){
                    case "BLANCO":
                    price = 15000;
                    iconCar.setIcon(nissanWhite);
                    break;
                    case "ROJO":
                    price = 10000;
                    iconCar.setIcon(nissanRed);
                    break;
                    case "NARANJA":
                    price = 5000;
                    iconCar.setIcon(nissanOrange);
                    break;
                    case "AMARILLO":
                    price = 8000;
                    iconCar.setIcon(nissanYellow);
                    break;
                    case "VERDE":
                    price = 9000;
                    iconCar.setIcon(nissanGreen);
                    break;
                    case "AZUL":
                    price = 12000;
                    iconCar.setIcon(nissanBlue);
                    break;
                    case "GRIS":
                    price = 13000;
                    iconCar.setIcon(nissanGray);
                    break;
                }
                break;
                case "AUDI":
                switch(color){
                    case "BLANCO":
                    price = 15000;
                    iconCar.setIcon(audiWhite);
                    break;
                    case "ROJO":
                    price = 10000;    
                    iconCar.setIcon(audiRed);
                    break;
                    case "NARANJA":
                    price = 5000;
                    iconCar.setIcon(audiOrange);
                    break;
                    case "AMARILLO":
                    price = 8000;
                    iconCar.setIcon(audiYellow);
                    break;
                    case "VERDE":
                    price = 9000;
                    iconCar.setIcon(audiGreen);
                    break;
                    case "AZUL":
                    price = 12000;
                    iconCar.setIcon(audiBlue);
                    break;
                    case "GRIS":
                    price = 13000;
                    iconCar.setIcon(audiGray);
                    break;
                }
                break;
                case "VOLKSWAGEN":
                switch(color){
                    case "BLANCO":
                    price = 15000;
                    iconCar.setIcon(volkswagenWhite);
                    break;
                    case "ROJO":
                    price = 10000;   
                    iconCar.setIcon(volkswagenRed);
                    break;
                    case "NARANJA":
                    price = 5000;
                    iconCar.setIcon(volkswagenOrange);
                    break;
                    case "AMARILLO":
                    price = 8000;
                    iconCar.setIcon(volkswagenYellow);
                    break;
                    case "VERDE":
                    price = 9000;
                    iconCar.setIcon(volkswagenGreen);
                    break;
                    case "AZUL":
                    price = 12000;
                    iconCar.setIcon(volkswagenBlue);
                    break;
                    case "GRIS":
                    price = 13000;
                    iconCar.setIcon(volkswagenGray);
                    break;
                }
                break;
            }

                String s = moneyFormat(price); 
                txtExtra.setText(s);
                String txt = selectSerial.getSelectedItem().toString();
                String txtmodel = txt.substring(2);
                int model = Integer.parseInt(txtmodel);
                int extra = methodsSql.loadPriceCar(model);
                int price_total = price + extra;
                txtPriceTotal.setText(moneyFormat(price_total));
                if(!selectColorsNew.getSelectedItem().equals("Seleccionar")){
                    btnPurchase.setEnabled(true);
                } else {
                    btnPurchase.setEnabled(false);
                }
        }
        
    }//GEN-LAST:event_selectColorsNewActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        MenuUser.ReloadData = true;
        this.setVisible(false);
        Purchase purchase = new Purchase();
        purchase.setVisible(true);
    }//GEN-LAST:event_btnPurchaseActionPerformed

    
    private String moneyFormat(int i){ 
        DecimalFormat money = new DecimalFormat("###,###,###"); 
        String s = money.format(i);
        return s;
    }
    
    private void clear(){
        selectState.setEnabled(false);
        selectModel.setEnabled(false);
        selectColors.setEnabled(false);
        selectSerial.setEnabled(false);
        selectState.setSelectedIndex(0);
        selectModel.setSelectedIndex(0);
        selectSerial.setSelectedIndex(0);
        selectColors.setSelectedIndex(0);
        iconCar.setIcon(car);
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
            java.util.logging.Logger.getLogger(Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quotation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPurchase;
    private javax.swing.JLabel iconCar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JComboBox<String> selectColors;
    public static javax.swing.JComboBox<String> selectColorsNew;
    public static javax.swing.JComboBox<String> selectCompany;
    public static javax.swing.JComboBox<String> selectModel;
    public static javax.swing.JComboBox<String> selectSerial;
    public static javax.swing.JComboBox<String> selectState;
    public static javax.swing.JLabel txtExtra;
    public static javax.swing.JLabel txtPriceCar;
    public static javax.swing.JLabel txtPriceTotal;
    // End of variables declaration//GEN-END:variables
}
