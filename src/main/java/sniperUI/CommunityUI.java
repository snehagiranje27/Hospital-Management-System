/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package sniperUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sniperModel.Community;
import sniperModel.CommunityDirectory;

/**
 *
 * @author ganes
 */
public class CommunityUI extends javax.swing.JPanel {

    /** Creates new form CommunityUI */
    CommunityDirectory cDir;
    String city = null, com =null, hou = null;
    ArrayList<Community> cl;
    
    public CommunityUI(CommunityDirectory c) {
        initComponents();
        this.cDir = c;
        cl = this.cDir.getComList();
        if(!c.isEmpty()){
            cl = this.cDir.getComList();
        }
    }
    
    public void clear(){
        Tcity.setText("");
        Tcom.setText("");
        Th.setText("");
    }
    
    public int indexOf( ArrayList<Community> clist, Community comobj){
        for(Community c : clist ){
            if( c.getHouse().equalsIgnoreCase(comobj.getHouse()) && c.getCity().equalsIgnoreCase(comobj.getCity()) && c.getCom().equalsIgnoreCase(comobj.getCom())){
                return clist.lastIndexOf(c);
            }
        }
        return -1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tcity = new javax.swing.JTextField();
        Tcom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Th = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        create = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        viewall = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        comTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("Community Registration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setText("City");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("Community");

        Tcity.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        Tcom.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("House");

        Th.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Th, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tcom, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tcity, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Tcity, Tcom});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(Tcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Th, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Tcity, Tcom, Th});

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        create.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        viewall.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        viewall.setText("View All");
        viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(viewall, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewall, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        comTable.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        comTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House", "Community", "City"
            }
        ));
        comTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(comTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
       city = Tcity.getText();
       com = Tcom.getText();
       hou = Th.getText();
       
       Object[] ob = new Object[3];
       
       ob[0] = hou;
       ob[1] = com;
       ob[2] = city;
       
       DefaultTableModel ct = (DefaultTableModel) comTable.getModel();
       ct.addRow(ob);
       
       Community c = new Community();
       
       c.setCity(city);
       c.setCom(com);
       c.setHouse(hou);
       
       cl.add(c);
       clear();
       JOptionPane.showMessageDialog(this, "Record is Successfully Created");
         
    }//GEN-LAST:event_createActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         try{
        DefaultTableModel ct = (DefaultTableModel) comTable.getModel();
        
        if(comTable.getSelectedRowCount()==1){
            
            Community cdel = new Community();
             
            hou = ct.getValueAt(comTable.getSelectedRow(), 0).toString();
            com = ct.getValueAt(comTable.getSelectedRow(), 1).toString();
            city = ct.getValueAt(comTable.getSelectedRow(), 2).toString();
            
            cdel.setHouse(hou);
            cdel.setCom(com);
            cdel.setCity(city);
            
            int in = indexOf(cl,cdel) ;
            System.out.println(cl.get(in).getCommunityDetails());
            
            if(in != -1)
            cl.remove(in);
            else
            throw new Exception();
            
            hou = Th.getText();
            city = Tcity.getText();
            com = Tcom.getText();
       
            Object[] ob = new Object[3];
       
            ob[0] = hou;
            ob[1] = com;
            ob[2] = city;
            
            Community c = new Community();
            c.setCity(city);
            c.setCom(com);     
            c.setHouse(hou);
            
            cl.add(c);
            
            ct.setValueAt(hou, comTable.getSelectedRow(), 0);
            ct.setValueAt(com, comTable.getSelectedRow(), 1);
            ct.setValueAt(city, comTable.getSelectedRow(), 2);
            
            JOptionPane.showMessageDialog(this, "Record is Successfully Updated");
            clear();  
        }
        else{
            if(comTable.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty. Please add data!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select single row to update!");
            }
        }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Problem occured while updating. Please try again!!");
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void comTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel ct = (DefaultTableModel) comTable.getModel();
        
        hou = ct.getValueAt(comTable.getSelectedRow(), 0).toString();
        com = ct.getValueAt(comTable.getSelectedRow(), 1).toString();
        city = ct.getValueAt(comTable.getSelectedRow(), 2).toString();
        Th.setText(hou);
        Tcity.setText(city);
        Tcom.setText(com);
        
    }//GEN-LAST:event_comTableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
        DefaultTableModel ct = (DefaultTableModel) comTable.getModel();
        
        if(comTable.getSelectedRowCount() == 1){
            
            hou = Th.getText();
            city = Tcity.getText();
            com = Tcom.getText();
            
            Community c = new Community();
            c.setCity(city);
            c.setCom(com);  
            c.setHouse(hou);
            
            int in = indexOf(cl,c) ;
            if(in != -1)
            cl.remove(in);
            else
                throw new Exception();
            
            ct.removeRow(comTable.getSelectedRow());
            
            JOptionPane.showMessageDialog(this, "Record is Successfully Deleted");
            clear(); 
        }
        else{
            if(comTable.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty. Please add data!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select single row to delete!");
            }
        }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Problem occured while deleting. Please try again!!");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_resetActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:           
             this.cDir.setComList(cl);
             this.cDir.displayCommunityDirectory();
             JOptionPane.showMessageDialog(this, "Details Saved Successfully");
        
    }//GEN-LAST:event_saveActionPerformed

    private void viewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallActionPerformed
        // TODO add your handling code here:
        try{
        if(cDir.isEmpty()){
            JOptionPane.showMessageDialog(this, "Community Directory is empty. Please add Community data!!");
        }
        else{
            clear();
            DefaultTableModel doc = (DefaultTableModel) comTable.getModel();
            int rc = doc.getRowCount();
            for(int i = 0; i<rc; i++)
            doc.removeRow(0);
            
            ArrayList<Community> cd = cDir.getComList();
                   
            for(Community c : cd ){
                
                Object[] sd = new Object[3];
                
                sd[0] = c.getHouse();
                sd[1] = c.getCom();
                sd[2] = c.getCity();
                doc.addRow(sd);                                
            }
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Something went wrong. Please try again");
        }
    }//GEN-LAST:event_viewallActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tcity;
    private javax.swing.JTextField Tcom;
    private javax.swing.JTextField Th;
    private javax.swing.JTable comTable;
    private javax.swing.JButton create;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    private javax.swing.JButton viewall;
    // End of variables declaration//GEN-END:variables

}
