/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class ExecutiveCourseDelete extends javax.swing.JInternalFrame {

    /**
     * Creates new form ExecutiveCourseDelete
     */
    public ExecutiveCourseDelete() {
        initComponents();
        show_user();
    }
     public ArrayList<users> userList(){
        ArrayList<users> usersList = new ArrayList<>();
        
         
         try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esoft","root","");
          String quary1="SELECT * FROM courses";
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(quary1);
         users user;
         while(rs.next()){
             user=new users(rs.getInt("no"),rs.getString("name"),rs.getString("fee"),rs.getString("duration"),rs.getString("lectures"),rs.getString("details"));
             usersList.add(user);
         }
        }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
         return usersList;
    }
     public void show_user(){
            ArrayList<users> list =userList();
           DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
           Object[]row = new Object[6];
            for(int i = 0;i<list.size(); i++){
                    
                    row[0]=list.get(i).getno();
                    row[1]=list.get(i).getname();
                    row[2]=list.get(i).getfee();
                    row[3]=list.get(i).getduration();
                    row[4]=list.get(i).getlectures();
                    row[5]=list.get(i).getdetail();
                    
                
                    model.addRow(row);
            }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "Courses names", "fee", "Duration", "lectures", "Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setPreferredSize(new java.awt.Dimension(225, 64));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(154, 154, 154)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       

     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
          
         try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esoft","root","");
          int row =jTable1.getSelectedRow();
          String value=(jTable1.getModel().getValueAt(row,0).toString());
          String query="DELETE FROM courses where no="+value;
          PreparedStatement pst= con.prepareStatement(query);
          pst.executeUpdate();
          DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
          model.setRowCount(0);
          show_user();
          JOptionPane.showMessageDialog(null, "Deleted Successfully");
          
        
        } 
           catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
