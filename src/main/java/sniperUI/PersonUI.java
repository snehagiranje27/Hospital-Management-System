/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sniperUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sniperModel.CommunityDirectory;
import sniperModel.PersonDirectory;
import sniperModel.Person;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ganes
 */
public class PersonUI extends javax.swing.JPanel {

    /**
     * Creates new form PersonUI
     */
    
    PersonDirectory pDir;
    CommunityDirectory cDir;
    int id = 0 ;
    String fName ,lName , pMail = null, pMob = null , pHouse = null, pCity =null,pCom =null, un= null, pass = null ;
    Map<Integer,Person> pD = new HashMap();
    ArrayList<String> cl = new ArrayList();
    ArrayList<String> coml = new ArrayList();
    
    public PersonUI(PersonDirectory p,CommunityDirectory c) {
        initComponents();
        this.pDir = p ;
        this.cDir = c;
        pD = this.pDir.getpDir();
        cl = this.cDir.getCityList();
        displayCity();
        Tun.setEditable(false);
    }
    
    public void displayCity(){
        CBcity.removeAllItems();
        for(String s : cl)
            CBcity.addItem(s);
    }
    
    public void clear(){
        pid.setText("");
        fn.setText("");
        ln.setText("");
        pmail.setText("");
        pmobile.setText("");
        ph.setText("");
        Tun.setText("");
        Tp.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        pmobile = new javax.swing.JTextField();
        pmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ph = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Tun = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Tp = new javax.swing.JTextField();
        CBcity = new javax.swing.JComboBox<>();
        CBcom = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        CreatePer = new javax.swing.JButton();
        UpdatePer = new javax.swing.JButton();
        DeletePer = new javax.swing.JButton();
        ViewPer = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PersonTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person Registration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel12.setText("ID");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("House");

        pid.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel10.setText("City");

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel11.setText("Community");

        fn.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        ln.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        pmobile.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        pmail.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("First Name");

        ph.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Last Name");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("Mobile Number");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("Email ID");

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel13.setText("Username");

        Tun.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel14.setText("Password");

        Tp.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        CBcity.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        CBcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBcityActionPerformed(evt);
            }
        });

        CBcom.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tun, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Tp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBcity, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBcom, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CBcity, CBcom, Tp, ph, pid});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(pmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(CBcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(pmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(CBcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        CreatePer.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        CreatePer.setText("Create");
        CreatePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePerActionPerformed(evt);
            }
        });

        UpdatePer.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        UpdatePer.setText("Update");
        UpdatePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePerActionPerformed(evt);
            }
        });

        DeletePer.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        DeletePer.setText("Delete");
        DeletePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePerActionPerformed(evt);
            }
        });

        ViewPer.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        ViewPer.setText("View All");
        ViewPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPerActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreatePer)
                    .addComponent(UpdatePer)
                    .addComponent(DeletePer)
                    .addComponent(ViewPer)
                    .addComponent(Reset)
                    .addComponent(save))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CreatePer, DeletePer, Reset, UpdatePer, ViewPer, save});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CreatePer)
                .addGap(18, 18, 18)
                .addComponent(UpdatePer)
                .addGap(18, 18, 18)
                .addComponent(DeletePer)
                .addGap(18, 18, 18)
                .addComponent(ViewPer)
                .addGap(18, 18, 18)
                .addComponent(Reset)
                .addGap(18, 18, 18)
                .addComponent(save)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CreatePer, DeletePer, Reset, UpdatePer, ViewPer, save});

        PersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Mobile", "House", "City", "Community", "Username", "Password"
            }
        ));
        PersonTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PersonTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreatePerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePerActionPerformed
        // TODO add your handling code here:
               
            //First name validation
               if(fn.getText().isEmpty()) 
               {
                    JOptionPane.showMessageDialog(CreatePer, "First name is required");
                    return;
                }else 
               {
                    String nameRegex = "^[a-zA-z]+([\\s][a-zA-Z]+)*$";
                    Pattern namePattern = Pattern.compile(nameRegex);
                    Matcher nameMatcher = namePattern.matcher(fn.getText());

                    if(!nameMatcher.matches())
                    {
                        JOptionPane.showMessageDialog(CreatePer, "Please enter valid first name");
                        return;
                    }
               }
               
             //last name validation
               if(ln.getText().isEmpty()) 
               {
                    JOptionPane.showMessageDialog(CreatePer, "Last name is required");
                    return;
                }else 
               {
                    String nameRegex = "^[a-zA-z]+([\\s][a-zA-Z]+)*$";
                    Pattern namePattern = Pattern.compile(nameRegex);
                    Matcher nameMatcher = namePattern.matcher(ln.getText());

                    if(!nameMatcher.matches())
                    {
                        JOptionPane.showMessageDialog(CreatePer, "Please enter valid last name");
                        return;
                    }
               } 
               
               //Mobile Number Validation
               if(pmobile.getText().isEmpty()) 
               {
                    JOptionPane.showMessageDialog(CreatePer, "Mobile number is required");
                    return;
                }else 
               {
                    String nameRegex = "(0/91)?[7-9][0-9]{9}";
                    Pattern namePattern = Pattern.compile(nameRegex);
                    Matcher nameMatcher = namePattern.matcher(pmobile.getText());

                    if(!nameMatcher.matches())
                    {
                        JOptionPane.showMessageDialog(CreatePer, "Please enter valid mobile number");
                        return;
                    }
               } 
               
               //Email Validation
               if(pmail.getText().isEmpty()) 
               {
                    JOptionPane.showMessageDialog(CreatePer, "Email is required");
                    return;
                }else 
               {
                    String nameRegex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
                    Pattern namePattern = Pattern.compile(nameRegex);
                    Matcher nameMatcher = namePattern.matcher(pmail.getText());

                    if(!nameMatcher.matches())
                    {
                        JOptionPane.showMessageDialog(CreatePer, "Please enter valid Email");
                        return;
                    }
               } 
               
               
                //House Validation
                if(ph.getText().isEmpty()) 
                {
                    JOptionPane.showMessageDialog(CreatePer, "House Number is required");
                    return;
                }
                else 
                {
                    String nameRegex = "^[1-9]\\d*(?:[ -]?(?:[a-zA-Z]+|[1-9]\\d*))?$";
                    Pattern namePattern = Pattern.compile(nameRegex);
                    Matcher nameMatcher = namePattern.matcher(ph.getText());

                    if(!nameMatcher.matches()){
                        JOptionPane.showMessageDialog(CreatePer, "Please enter valid house number");
                        return;
                    }
                }
                //ID Validation
                id = Integer.parseInt(pid.getText());
               if(pid.getText().isEmpty()) 
               {
                    JOptionPane.showMessageDialog(CreatePer, "ID is required");
                    return;
                }
               else 
               {
                   
                    String nameRegex = "^[1-9]\\d*$";
                    Pattern namePattern = Pattern.compile(nameRegex);
                    Matcher nameMatcher = namePattern.matcher(pid.getText());

                    if(!nameMatcher.matches())
                    {
                        JOptionPane.showMessageDialog(CreatePer, "Please enter valid ID");
                        return;
                    }
               } 
               if(this.pDir.ifIdExists(id))
               {
                    JOptionPane.showMessageDialog(CreatePer, "This ID already exists,Enter a unique ID");
                    return;
               }
             
               
               //Password Validation
               if(Tp.getText().isEmpty()) 
               {
                    JOptionPane.showMessageDialog(CreatePer, "Password is required");
                    return;
                }               
             
               
               
        id = Integer.parseInt(pid.getText());
        fName = fn.getText();
        lName = ln.getText();
        pMail = pmail.getText();
        pMob = pmobile.getText();
        pHouse = ph.getText();
        pCity = CBcity.getSelectedItem().toString();
        pCom = CBcom.getSelectedItem().toString();
        un =id+fName+lName;
        pass = Tp.getText();
        
        Object[] ob = new Object[10];
        
        ob[0] = id;
        ob[1] = fName;
        ob[2] = lName;
        ob[3] = pMail;
        ob[4] = pMob;
        ob[5] = pHouse;
        ob[6] = pCity;
        ob[7] = pCom;
        ob[8] = un;
        ob[9] = pass;
        
        DefaultTableModel per = (DefaultTableModel) PersonTable.getModel();  
        per.addRow(ob);
        
        Person p = new Person();
        
        p.setPid(id);
        p.setfName(fName);
        p.setlName(lName);
        p.setPmail(pMail);
        p.setPmob(pMob);
        p.setHouse(pHouse);
        p.setCity(pCity);
        p.setCom(pCom);
        p.setUserName(un);
        p.setPassword(pass);
        
        this.pD.put(id, p);
                
        clear();
        JOptionPane.showMessageDialog(this, "Record is Successfully Created");
    }//GEN-LAST:event_CreatePerActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        clear();
        pid.setEditable(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void UpdatePerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePerActionPerformed
        // TODO add your handling code here:
        try{
        DefaultTableModel per = (DefaultTableModel) PersonTable.getModel();
        
        if(PersonTable.getSelectedRowCount()==1){
            
            id = Integer.parseInt(pid.getText());
            fName = fn.getText();
            lName = ln.getText();
            pMob = pmobile.getText();
            pMob = pmobile.getText();
            pHouse = ph.getText();
            pCity = CBcity.getSelectedItem().toString();
            pCom = CBcom.getSelectedItem().toString();
            un = id+fName+lName;
            pass = Tp.getText();
                         
            Person p = new Person();
        
            p.setPid(id);
            p.setfName(fName);
            p.setlName(lName);
            p.setPmail(pMail);
            p.setPmob(pMob);
            p.setHouse(pHouse);
            p.setCity(pCity);
            p.setCom(pCom);
            p.setUserName(un);
            p.setPassword(pass);
        
            this.pD.put(id, p);
            
            per.setValueAt(fName, PersonTable.getSelectedRow(), 1);
            per.setValueAt(lName, PersonTable.getSelectedRow(), 2);
            per.setValueAt(pMail, PersonTable.getSelectedRow(), 3);
            per.setValueAt(pMob, PersonTable.getSelectedRow(), 4);
            per.setValueAt(pHouse, PersonTable.getSelectedRow(), 5);
            per.setValueAt(pCity, PersonTable.getSelectedRow(), 6);
            per.setValueAt(pCom, PersonTable.getSelectedRow(), 7);
            per.setValueAt(un, PersonTable.getSelectedRow(), 8);            
            per.setValueAt(pass, PersonTable.getSelectedRow(), 9);
            
            JOptionPane.showMessageDialog(this, "Record is Successfully Updated");
            clear();  
            pid.setEditable(true);
        }
        else{
            if(PersonTable.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty. Please add data!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select single row to update!");
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Problem occured while updating. Please try again!!");
        }
        
    }//GEN-LAST:event_UpdatePerActionPerformed

    private void PersonTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel doc = (DefaultTableModel) PersonTable.getModel();
        
        id = Integer.parseInt(doc.getValueAt(PersonTable.getSelectedRow(), 0).toString());
        fName = doc.getValueAt(PersonTable.getSelectedRow(), 1).toString();
        lName = doc.getValueAt(PersonTable.getSelectedRow(), 2).toString();
        pMail = doc.getValueAt(PersonTable.getSelectedRow(), 3).toString();
        pMob = doc.getValueAt(PersonTable.getSelectedRow(), 4).toString();
        pHouse = doc.getValueAt(PersonTable.getSelectedRow(), 5).toString();
        pCity = doc.getValueAt(PersonTable.getSelectedRow(), 6).toString();
        pCom = doc.getValueAt(PersonTable.getSelectedRow(), 7).toString();
        un = doc.getValueAt(PersonTable.getSelectedRow(), 8).toString();
        pass = doc.getValueAt(PersonTable.getSelectedRow(), 9).toString();
        
        pid.setText(""+id);
        fn.setText(fName);
        ln.setText(lName);
        pmail.setText(pMail);
        pmobile.setText(pMob);
        ph.setText(pHouse);
        CBcity.setSelectedItem(pCity);
        CBcom.setSelectedItem(pCom);
        Tun.setText(un);
        Tp.setText(pass);
        pid.setEditable(false);
    }//GEN-LAST:event_PersonTableMouseClicked

    private void DeletePerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePerActionPerformed
        // TODO add your handling code here:
        try{
        DefaultTableModel doc = (DefaultTableModel) PersonTable.getModel();
        
        if(PersonTable.getSelectedRowCount() == 1){
            
            id = Integer.parseInt(pid.getText());
            pD.remove(id);
            doc.removeRow(PersonTable.getSelectedRow());
            
            JOptionPane.showMessageDialog(this, "Record is Successfully Deleted");
            clear(); 
            pid.setEditable(true);
        }
        else{
            if(PersonTable.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty. Please add data!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select single row to delete!");
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Problem occured while deleting. Please try again!!");
        }
        
    }//GEN-LAST:event_DeletePerActionPerformed

    private void ViewPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPerActionPerformed
        // TODO add your handling code here:
        
         try{
        if(pDir.isEmpty()){
            JOptionPane.showMessageDialog(this, "Person Directory is empty. Please add Person data!!");
        }
        else{
            DefaultTableModel per = (DefaultTableModel) PersonTable.getModel();
            int rc = per.getRowCount();
            for(int i = 0; i<rc; i++)
                per.removeRow(0);            
            
            Map<Integer,Person> pp = pDir.getpDir();
            Set<Map.Entry<Integer,Person>> pList = pp.entrySet();
        
            for(Map.Entry<Integer,Person> e : pList){
                
                Object[] sd = new Object[10];                
                Person p1 = e.getValue();
                
                sd[0] = (int) e.getKey();
                sd[1] = p1.getfName();
                sd[2] = p1.getlName();
                sd[3] = p1.getPmail();
                sd[4] = p1.getPmob();
                sd[5] = p1.getHouse();
                sd[6] = p1.getCity();
                sd[7] = p1.getCom();
                sd[8] = p1.getUserName();
                sd[9] = p1.getPassword();
                
                per.addRow(sd);                                
            }
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Something went wrong. Please try again");
        }
        clear();
    }//GEN-LAST:event_ViewPerActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        clear();
             this.pDir.setpDir(pD);
             this.pDir.displayPersonDir();
             JOptionPane.showMessageDialog(this, "Details Saved Successfully");
    }//GEN-LAST:event_saveActionPerformed

    private void CBcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBcityActionPerformed
        // TODO add your handling code here:
        CBcom.removeAllItems();
        String x = CBcity.getSelectedItem().toString();
        coml = this.cDir.getComList(x);
        for(String s : coml)
            CBcom.addItem(s);
    }//GEN-LAST:event_CBcityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBcity;
    private javax.swing.JComboBox<String> CBcom;
    private javax.swing.JButton CreatePer;
    private javax.swing.JButton DeletePer;
    private javax.swing.JTable PersonTable;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField Tp;
    private javax.swing.JTextField Tun;
    private javax.swing.JButton UpdatePer;
    private javax.swing.JButton ViewPer;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pmail;
    private javax.swing.JTextField pmobile;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
