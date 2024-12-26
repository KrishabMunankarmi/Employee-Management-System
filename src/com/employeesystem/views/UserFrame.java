/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.employeesystem.views;

import com.employeesystem.model.EmployeeModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
* @author Krishab Munankarmi
* LMU ID: 23048630
 */
public class UserFrame extends javax.swing.JFrame {

    //Creating a new Array List
    ArrayList<EmployeeModel> arrayList = new ArrayList<EmployeeModel>();
    DefaultTableModel employeeTable;
    /**
     * Creates new form UserFrame
     */
    public UserFrame() {
        initComponents();
        PreviousEmployeesDetails();
        employeeTable = (DefaultTableModel) tableEmployeeInformation.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainAdmin = new javax.swing.JPanel();
        pnlHeading = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblBarImage = new javax.swing.JLabel();
        tabPaneMain = new javax.swing.JTabbedPane();
        pnlHomePage = new javax.swing.JPanel();
        lblGreeting = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblImageEmpManage = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        lblDescription = new javax.swing.JLabel();
        lblDescription1 = new javax.swing.JLabel();
        lblNote = new javax.swing.JLabel();
        lblNote2 = new javax.swing.JLabel();
        lblNote3 = new javax.swing.JLabel();
        pnlEmployeeLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployeeInformation = new javax.swing.JTable();
        lblTableinfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1540, 960));
        setMinimumSize(new java.awt.Dimension(1540, 960));
        setPreferredSize(new java.awt.Dimension(1540, 960));

        pnlMainAdmin.setBackground(new java.awt.Color(255, 204, 0));
        pnlMainAdmin.setMaximumSize(new java.awt.Dimension(1540, 960));
        pnlMainAdmin.setMinimumSize(new java.awt.Dimension(1540, 960));

        pnlHeading.setBackground(new java.awt.Color(0, 102, 204));
        pnlHeading.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitle.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 204, 0));
        lblTitle.setText("Employee Management System");

        lblBarImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/employeesystem/resources/BarLogo.png"))); // NOI18N

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblBarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                        .addComponent(lblBarImage)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(71, 71, 71))))
        );

        tabPaneMain.setBackground(new java.awt.Color(0, 102, 204));
        tabPaneMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabPaneMain.setForeground(new java.awt.Color(255, 204, 0));
        tabPaneMain.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        pnlHomePage.setBackground(new java.awt.Color(0, 102, 204));

        lblGreeting.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        lblGreeting.setForeground(new java.awt.Color(255, 204, 0));
        lblGreeting.setText("Greetings User!");

        lblWelcome.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 204, 0));
        lblWelcome.setText("And welcome to the newly developed Employee Management system");

        lblImageEmpManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/employeesystem/resources/Employee Management.png"))); // NOI18N

        btnReturn.setBackground(new java.awt.Color(255, 204, 0));
        btnReturn.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(0, 102, 204));
        btnReturn.setText("<-  Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        lblDescription.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 204, 0));
        lblDescription.setText("Here you can view the records of all your colleagues");

        lblDescription1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblDescription1.setForeground(new java.awt.Color(255, 204, 0));
        lblDescription1.setText("and co-workers along with your own details.");

        lblNote.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblNote.setForeground(new java.awt.Color(255, 204, 0));
        lblNote.setText("You may not worry as all the details are added, created");

        lblNote2.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblNote2.setForeground(new java.awt.Color(255, 204, 0));
        lblNote2.setText("updated and deleted by the admin and can be viewed in");

        lblNote3.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblNote3.setForeground(new java.awt.Color(255, 204, 0));
        lblNote3.setText("the \"Employee Details\" tab at the top.");

        javax.swing.GroupLayout pnlHomePageLayout = new javax.swing.GroupLayout(pnlHomePage);
        pnlHomePage.setLayout(pnlHomePageLayout);
        pnlHomePageLayout.setHorizontalGroup(
            pnlHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomePageLayout.createSequentialGroup()
                        .addGap(0, 204, Short.MAX_VALUE)
                        .addGroup(pnlHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomePageLayout.createSequentialGroup()
                                .addComponent(lblWelcome)
                                .addGap(189, 189, 189))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomePageLayout.createSequentialGroup()
                                .addComponent(lblGreeting)
                                .addGap(632, 632, 632))))
                    .addGroup(pnlHomePageLayout.createSequentialGroup()
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pnlHomePageLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomePageLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlHomePageLayout.createSequentialGroup()
                        .addGroup(pnlHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNote, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNote2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNote3, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImageEmpManage, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(pnlHomePageLayout.createSequentialGroup()
                        .addComponent(lblDescription)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlHomePageLayout.setVerticalGroup(
            pnlHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomePageLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblGreeting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWelcome)
                .addGroup(pnlHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomePageLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImageEmpManage)
                        .addGap(3, 3, 3))
                    .addGroup(pnlHomePageLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescription1)
                        .addGap(58, 58, 58)
                        .addComponent(lblNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNote2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNote3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)))
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        tabPaneMain.addTab("Home", pnlHomePage);

        pnlEmployeeLists.setBackground(new java.awt.Color(0, 102, 204));

        tableEmployeeInformation.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        tableEmployeeInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Full Name", "Address", "Contact No.", "Age", "Position", "Contract Period (Years)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmployeeInformation.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tableEmployeeInformation);
        if (tableEmployeeInformation.getColumnModel().getColumnCount() > 0) {
            tableEmployeeInformation.getColumnModel().getColumn(0).setResizable(false);
            tableEmployeeInformation.getColumnModel().getColumn(1).setResizable(false);
            tableEmployeeInformation.getColumnModel().getColumn(2).setResizable(false);
            tableEmployeeInformation.getColumnModel().getColumn(3).setResizable(false);
            tableEmployeeInformation.getColumnModel().getColumn(4).setResizable(false);
            tableEmployeeInformation.getColumnModel().getColumn(5).setResizable(false);
            tableEmployeeInformation.getColumnModel().getColumn(6).setResizable(false);
        }

        lblTableinfo.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblTableinfo.setForeground(new java.awt.Color(255, 204, 0));
        lblTableinfo.setText("The details of all employees are given in the table below.");

        javax.swing.GroupLayout pnlEmployeeListsLayout = new javax.swing.GroupLayout(pnlEmployeeLists);
        pnlEmployeeLists.setLayout(pnlEmployeeListsLayout);
        pnlEmployeeListsLayout.setHorizontalGroup(
            pnlEmployeeListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeListsLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmployeeListsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTableinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(384, 384, 384))
        );
        pnlEmployeeListsLayout.setVerticalGroup(
            pnlEmployeeListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmployeeListsLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lblTableinfo)
                .addGap(114, 114, 114)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        tabPaneMain.addTab("Employee Details", pnlEmployeeLists);

        javax.swing.GroupLayout pnlMainAdminLayout = new javax.swing.GroupLayout(pnlMainAdmin);
        pnlMainAdmin.setLayout(pnlMainAdminLayout);
        pnlMainAdminLayout.setHorizontalGroup(
            pnlMainAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneMain)
            .addComponent(pnlHeading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMainAdminLayout.setVerticalGroup(
            pnlMainAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainAdminLayout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlMainAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlMainAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        ReturnToLogin(); //Calling Return method
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }
    
    public void PreviousEmployeesDetails(){ //Values already stored in table
        
        EmployeeModel Employee1 = new EmployeeModel(1, "Ram Bahadur", "Kathmandu", "9841236570", 35, "Developer", 5);
        EmployeeModel Employee2 = new EmployeeModel(2, "Shyam Nepal", "Bhaktapur", "9841236571", 25, "Tester", 2);
        EmployeeModel Employee3 = new EmployeeModel(3, "Krishna Lal", "Lalitpur", "9841236572", 32, "Designer", 6);
        EmployeeModel Employee4 = new EmployeeModel(4, "Hari Tiwari", "Bhaktapur", "9841236573", 44, "Developer", 8);
        EmployeeModel Employee5 = new EmployeeModel(5, "Indra Khanal", "Kathmandu", "9841236574", 50, "Guard", 7);
        EmployeeModel Employee6 = new EmployeeModel(6, "Shiv Shrestha", "Lalitpur", "9841236575", 23, "Janitor", 12);
        EmployeeModel Employee7 = new EmployeeModel(7, "Deepak Gurung", "Kathmandu", "9841236576", 47, "Tester", 4);
        EmployeeModel Employee8 = new EmployeeModel(8, "Prakash Ghimire", "Lalitpur", "9841236577", 38, "Developer", 1);
        EmployeeModel Employee9 = new EmployeeModel(9, "Raj Malla", "Bhaktapur", "9841236578", 31, "Manager", 3);
        EmployeeModel Employee10 = new EmployeeModel(10, "Puspa Singh", "Kathmandu", "9841236579", 45, "Designer", 10);
        
        arrayList.add(Employee1);
        AddingEmployeesToTable(Employee1);
        arrayList.add(Employee2);
        AddingEmployeesToTable(Employee2);
        arrayList.add(Employee3);
        AddingEmployeesToTable(Employee3);
        arrayList.add(Employee4);
        AddingEmployeesToTable(Employee4);
        arrayList.add(Employee5);
        AddingEmployeesToTable(Employee5);
        arrayList.add(Employee6);
        AddingEmployeesToTable(Employee6);
        arrayList.add(Employee7);
        AddingEmployeesToTable(Employee7);
        arrayList.add(Employee8);
        AddingEmployeesToTable(Employee8);
        arrayList.add(Employee9);
        AddingEmployeesToTable(Employee9);
        arrayList.add(Employee10);
        AddingEmployeesToTable(Employee10);
        
    }
    
     public void AddingEmployeesToTable(EmployeeModel Employee){
        
        employeeTable = (DefaultTableModel) tableEmployeeInformation.getModel();
        employeeTable.addRow(new Object[]{Employee.getEmpID(), Employee.getFullName(), Employee.getAddress(), Employee.getContactNo(), Employee.getAge(), Employee.getPosition(), Employee.getContractPeriod()});
    }
    
    public void ReturnToLogin(){ //Returning to login
        EmployeeApp Return = new EmployeeApp();
        int choiceofUser =  JOptionPane.showConfirmDialog(rootPane, "Do you want to return back to login page??", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(choiceofUser==JOptionPane.YES_OPTION)
        {
            Return.setVisible(true);
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarImage;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDescription1;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblImageEmpManage;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblNote2;
    private javax.swing.JLabel lblNote3;
    private javax.swing.JLabel lblTableinfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlEmployeeLists;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlHomePage;
    private javax.swing.JPanel pnlMainAdmin;
    private javax.swing.JTabbedPane tabPaneMain;
    private javax.swing.JTable tableEmployeeInformation;
    // End of variables declaration//GEN-END:variables
}
