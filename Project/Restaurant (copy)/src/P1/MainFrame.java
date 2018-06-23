/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.List;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author amarnath
 */
public class MainFrame extends javax.swing.JFrame {
    int i=0;
     String s;
     double sum1=0.0;
    int ji=1; 
     double []m={95,100,120,140,150,165,20,25,50,60,70};
        double []d={30,30,60,50,50,60,40};
        double de=100.000d;
        double tax=2.987d;
 String []column= new String [] {  "ID", "Name", "UserName", "DOB", "Password"  };
 DefaultTableModel model=new DefaultTableModel();
 String id, name,username,dob;
 int passwd;


        public MainFrame() {
        
        initComponents();
    }
    
   
      
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reca = new javax.swing.JTextArea();
        iteml2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        meall = new javax.swing.JList<>();
        Iteml1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        drinkl = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        costm = new javax.swing.JTextField();
        costd = new javax.swing.JTextField();
        costde = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        costtax = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        costtotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        exitb = new javax.swing.JButton();
        resetb = new javax.swing.JButton();
        receiptb = new javax.swing.JButton();
        totalb = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Insert = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        uservar1 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        uservar = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        passvar = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        uservar3 = new javax.swing.JLabel();
        Birth = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        reg = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        min = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(228, 242, 242));

        jTabbedPane1.setBorder(null);
        jTabbedPane1.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        Reca.setColumns(20);
        Reca.setRows(5);
        jScrollPane1.setViewportView(Reca);

        iteml2.setBackground(new java.awt.Color(149, 165, 166));
        iteml2.setFont(new java.awt.Font("Noto Sans CJK JP Light", 1, 14)); // NOI18N
        iteml2.setForeground(new java.awt.Color(65, 131, 215));
        iteml2.setText("Drink Items");

        meall.setBackground(new java.awt.Color(236, 240, 241));
        meall.setFont(new java.awt.Font("Ubuntu Light", 2, 13)); // NOI18N
        meall.setForeground(new java.awt.Color(58, 83, 155));
        meall.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Veg Rice", "Egg Rice", "Chicken Rice", "Mutton Rice", "Fish Rice", "Mixed Rice", "Boiled Egg", "Fried Egg", "Chilly Fish Dry", "Ginder Fish Dry", "Garlic Fish Dry" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        meall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meallMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(meall);

        Iteml1.setBackground(new java.awt.Color(149, 165, 166));
        Iteml1.setFont(new java.awt.Font("Noto Sans CJK JP Light", 1, 14)); // NOI18N
        Iteml1.setForeground(new java.awt.Color(65, 131, 215));
        Iteml1.setText("Meals Items");

        drinkl.setBackground(new java.awt.Color(236, 240, 241));
        drinkl.setFont(new java.awt.Font("Ubuntu Light", 2, 13)); // NOI18N
        drinkl.setForeground(new java.awt.Color(58, 83, 155));
        drinkl.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Coffee", "Tea", "Mango", "Rose milk", "Vannila", "Strawberry", "Coconut Water" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        drinkl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinklMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(drinkl);

        jPanel5.setBackground(new java.awt.Color(238, 238, 238));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 131, 215));
        jLabel3.setText("Cost of Drink");

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(65, 131, 215));
        jLabel4.setText("Sub-Total");

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(65, 131, 215));
        jLabel5.setText("Cost of Meals");

        costm.setEditable(false);
        costm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costmActionPerformed(evt);
            }
        });

        costd.setEditable(false);
        costd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costdActionPerformed(evt);
            }
        });

        costde.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(65, 131, 215));
        jLabel6.setText("     Total :");

        costtax.setEditable(false);
        costtax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costtaxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(65, 131, 215));
        jLabel7.setText("     Tax  :");

        costtotal.setEditable(false);
        costtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costtotalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(65, 131, 215));
        jLabel8.setText("Cost of Delivery");

        subtotal.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(costd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addComponent(costm, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(costde, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(subtotal))
                    .addComponent(costtax, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(223, 223, 223))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costtax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        exitb.setBackground(new java.awt.Color(217, 30, 24));
        exitb.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 1, 13)); // NOI18N
        exitb.setForeground(new java.awt.Color(251, 251, 252));
        exitb.setText("Exit");
        exitb.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        exitb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbActionPerformed(evt);
            }
        });

        resetb.setBackground(new java.awt.Color(68, 108, 179));
        resetb.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 1, 13)); // NOI18N
        resetb.setForeground(new java.awt.Color(254, 254, 254));
        resetb.setText("Reset");
        resetb.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        resetb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbActionPerformed(evt);
            }
        });

        receiptb.setBackground(new java.awt.Color(68, 108, 179));
        receiptb.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 1, 13)); // NOI18N
        receiptb.setForeground(new java.awt.Color(233, 243, 248));
        receiptb.setText("Receipt");
        receiptb.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        receiptb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptbActionPerformed(evt);
            }
        });

        totalb.setBackground(new java.awt.Color(68, 108, 179));
        totalb.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 1, 13)); // NOI18N
        totalb.setForeground(new java.awt.Color(254, 254, 254));
        totalb.setText("Total");
        totalb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        totalb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(exitb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(receiptb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(resetb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(totalb, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitb)
                    .addComponent(resetb)
                    .addComponent(receiptb)
                    .addComponent(totalb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(238, 238, 238));

        jCheckBox2.setBackground(new java.awt.Color(238, 238, 238));
        jCheckBox2.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(65, 131, 215));
        jCheckBox2.setText("Tax");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(65, 131, 215));
        jCheckBox1.setText("Delivery");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Iteml1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iteml2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Iteml1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iteml2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bill Payment", jPanel3);

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
        });

        table.setColumnSelectionAllowed(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Insert.setBackground(new java.awt.Color(89, 171, 227));
        Insert.setFont(new java.awt.Font("Phetsarath OT", 1, 14)); // NOI18N
        Insert.setForeground(new java.awt.Color(244, 240, 240));
        Insert.setText("Insert");
        Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertMouseClicked(evt);
            }
        });
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(207, 0, 15));
        Exit.setFont(new java.awt.Font("Phetsarath OT", 1, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(254, 242, 242));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(89, 171, 227));
        Delete.setFont(new java.awt.Font("Phetsarath OT", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(251, 249, 249));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(103, 65, 114));
        jLabel1.setFont(new java.awt.Font("MathJax_Main", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(103, 65, 114));
        jLabel1.setText("User Detail");

        uservar1.setFont(new java.awt.Font("Noto Sans CJK TC Light", 1, 13)); // NOI18N
        uservar1.setForeground(new java.awt.Color(154, 18, 179));
        uservar1.setText("First Name  :");

        fn.setBackground(new java.awt.Color(245, 249, 250));
        fn.setForeground(new java.awt.Color(103, 128, 159));
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });

        uservar.setFont(new java.awt.Font("Noto Sans CJK TC Light", 1, 13)); // NOI18N
        uservar.setForeground(new java.awt.Color(154, 18, 179));
        uservar.setText("User Name   :");

        un.setBackground(new java.awt.Color(245, 249, 250));
        un.setForeground(new java.awt.Color(103, 128, 159));

        passvar.setFont(new java.awt.Font("Noto Sans CJK SC Light", 1, 13)); // NOI18N
        passvar.setForeground(new java.awt.Color(154, 18, 179));
        passvar.setText("Password     :");

        password.setBackground(new java.awt.Color(245, 249, 250));
        password.setForeground(new java.awt.Color(103, 128, 159));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        uservar3.setFont(new java.awt.Font("Noto Sans CJK TC Light", 1, 13)); // NOI18N
        uservar3.setForeground(new java.awt.Color(154, 18, 179));
        uservar3.setText("BirthDate     :");

        Birth.setBackground(new java.awt.Color(245, 249, 250));
        Birth.setForeground(new java.awt.Color(103, 128, 159));
        Birth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uservar3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uservar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passvar))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(un, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(Birth)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(uservar1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uservar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uservar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uservar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Insert)
                            .addComponent(Delete)
                            .addComponent(Exit))))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("storage Details", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(155, 89, 182));

        reg.setFont(new java.awt.Font("MathJax_SansSerif", 1, 24)); // NOI18N
        reg.setForeground(new java.awt.Color(31, 58, 147));
        reg.setText("Hotel  Management");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P1/Close-icon.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P1/Maximize-Window-icon.png"))); // NOI18N
        max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxMouseClicked(evt);
            }
        });

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P1/Minimize-Window-icon.png"))); // NOI18N
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 833, Short.MAX_VALUE)
                .addComponent(min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(max)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(close)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(max)
                    .addComponent(min)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close)))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
   this.setState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
  this.setState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_maxMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    
    private void costmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costmActionPerformed
      
    }//GEN-LAST:event_costmActionPerformed

    private void costdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costdActionPerformed

    private void costtaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costtaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costtaxActionPerformed

    private void costtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costtotalActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
     if(jCheckBox1.isSelected()){
      costde.setText(de+"");
      sub(de);
     
     }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
 if(jCheckBox2.isSelected()){
      costtax.setText(tax+"");
      Reca.append("\nTax         :"+tax+"");
      sub(tax);
     
     }
 else{
      double t=0;
    t=Double.parseDouble(subtotal.getText());
    costtax.setText("");
      costtotal.setText(t-tax+"");
      subtotal.setText(t-tax+"");
 }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void resetbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbActionPerformed
 i=0;
 costm.setText("");
 costde.setText("");
 costd.setText("");
 subtotal.setText("");
 Reca.setText("");
 costtax.setText("");
 costtotal.setText("");
 
    }//GEN-LAST:event_resetbActionPerformed

    private void receiptbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptbActionPerformed
     Reca.setText("Thanks for you Purchase \n *****     *****   *****");
    }//GEN-LAST:event_receiptbActionPerformed

    private void totalbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbActionPerformed
    double t=0;
    t=Double.parseDouble(subtotal.getText());
     costtotal.setText(String.format("%.3f",t));
     Reca.append("\n-------------------------------------------------------------------------------------\n");
     Reca.append("\n\t\tTotal--:"+t);
     Reca.append("\n-----------------------------------------------------------------------------------\n");

    }//GEN-LAST:event_totalbActionPerformed

    private void exitbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbActionPerformed

     int a=JOptionPane.showConfirmDialog(this,"Are you sure?");  
if(a==JOptionPane.YES_OPTION){  
   System.exit(0);
}  
       
    }//GEN-LAST:event_exitbActionPerformed

    private void meallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meallMouseClicked
        //double d=Double.parseDouble();
         double t=m[meall.getSelectedIndex()];
          sub(t);
         Reca.append(meall.getSelectedValue()+"\t:    "+m[meall.getSelectedIndex()]+"\n");     
        costm.setText(t+"");
         
    }//GEN-LAST:event_meallMouseClicked

    private void drinklMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinklMouseClicked
   double  t=d[drinkl.getSelectedIndex()];
              sub(t);
              Reca.append(drinkl.getSelectedValue()+"\t :    "+d[drinkl.getSelectedIndex()]+"\n");
              costd.setText(t+"");
    }//GEN-LAST:event_drinklMouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        
    }//GEN-LAST:event_jPanel4MouseEntered

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void BirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthActionPerformed
/*
        try {
            DateFormat format = new SimpleDateFormat("dd-MMMM-yyyy");
            DateFormatter df = new DateFormatter(format);
            JFormattedTextField Birth = new JFormattedTextField(df);

        } catch (Exception e) {
            e.printStackTrace();
            Birth.setText("Wrong Data Format");
        }
        Birth.setValue(new Date());

        add(Birth);
        */
    }//GEN-LAST:event_BirthActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
    String sql;
    
        try {
            //insert into userRecord value(1,'amarnath','amar','05-08-1998',1234);
                sql="insert into userRecord value(null,'"+fn.getText()+"','"+un.getText()+"','"+Birth.getText()+"','"+password.getText()+"');";

            executesql(sql,1);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error");
        }
    
    
    
    }//GEN-LAST:event_InsertActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
  TableModel tm=new TableModel() {
       @Override
       public int getRowCount() {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public int getColumnCount() {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public String getColumnName(int columnIndex) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public Class<?> getColumnClass(int columnIndex) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public boolean isCellEditable(int rowIndex, int columnIndex) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public Object getValueAt(int rowIndex, int columnIndex) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public void addTableModelListener(TableModelListener l) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public void removeTableModelListener(TableModelListener l) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }
   };
model.setColumnIdentifiers(column);
table.setModel(model);
        try{
          Class.forName("com.mysql.jdbc.Driver");
          
        Connection con;
        
          con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sam","root","dear");
         PreparedStatement  pt=con.prepareStatement("select *from userRecord");

ResultSet rs = pt.executeQuery();
int i =0;
while(rs.next())
{
 //  id = rs.getString("id");
   name= rs.getString("name");
   username = rs.getString("username");
       dob = rs.getString("DOB");
        passwd=rs.getInt(5);
       
model.addRow(new Object[]{ name,username,dob,passwd});
i++; 
}
if(i <1){JOptionPane.showMessageDialog(null, "No Record Found","Error",JOptionPane.ERROR_MESSAGE);}
}   
        catch(Exception e){
        e.printStackTrace();
          
        } 
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
     int i=table.getSelectedRow();
  TableModel m=table.getModel();
     fn.setText(m.getValueAt(i,1)+"");
          un.setText(m.getValueAt(i,2)+"");
            password.setText(m.getValueAt(i,4)+"");
              Birth.setText(m.getValueAt(i,3)+"");

    
    }//GEN-LAST:event_tableMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int i=table.getSelectedRow();
    //    string s=getText(m.getValueAt(i,2)+"");
        model.removeRow(table.getSelectedRow());
        String sql="delete from userRecord where DOB='"+Birth.getText()+"';";
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Birth;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Insert;
    private javax.swing.JLabel Iteml1;
    private javax.swing.JTextArea Reca;
    private javax.swing.JLabel close;
    private javax.swing.JTextField costd;
    private javax.swing.JTextField costde;
    private javax.swing.JTextField costm;
    private javax.swing.JTextField costtax;
    private javax.swing.JTextField costtotal;
    private javax.swing.JList<String> drinkl;
    private javax.swing.JButton exitb;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel iteml2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel max;
    private javax.swing.JList<String> meall;
    private javax.swing.JLabel min;
    private javax.swing.JLabel passvar;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton receiptb;
    private javax.swing.JLabel reg;
    private javax.swing.JButton resetb;
    public javax.swing.JTextField subtotal;
    public static javax.swing.JTable table;
    private javax.swing.JButton totalb;
    private javax.swing.JTextField un;
    private javax.swing.JLabel uservar;
    private javax.swing.JLabel uservar1;
    private javax.swing.JLabel uservar3;
    // End of variables declaration//GEN-END:variables

    private void sub(double d) {
   if(i==0){  
       sum1=d;
     Reca.setText("--------------------------------------Receipt--------------------------------\n");
      i++; }
    else{ sum1+=d;}
   
        subtotal.setText(String.format("%.3f",sum1)+"");
    }

    private void executesql(String sql,int n) throws ClassNotFoundException {
       try{
          Class.forName("com.mysql.jdbc.Driver");
          
        Connection con;
        
          con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sam","root","dear");
         PreparedStatement  pt=con.prepareStatement(sql);

         if(n==1){
              int rs = pt.executeUpdate();
               PreparedStatement  po=con.prepareStatement("select *from userRecord");
               ResultSet rw = po.executeQuery();
   rw.last();
       
   model.addRow(new Object[]{rw.getString(1),rw.getString(2) ,rw.getString(3),rw.getString(4),rw.getString(5)});
              ji++;
                int i=table.getSelectedRow();
  TableModel m=table.getModel();
     fn.setText(m.getValueAt(i,1)+"");
          un.setText(m.getValueAt(i,2)+"");
            password.setText(m.getValueAt(i,4)+"");
              Birth.setText(m.getValueAt(i,3)+"");
       
             
JOptionPane.showMessageDialog(null,"Record Inserted Successfully");
    }
       }
      catch(Exception e){
        e.printStackTrace();
          
        } 
       

 
}        




}


