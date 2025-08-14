/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalRecords;

import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Bim
 */
public class Checkup extends javax.swing.JFrame {

    ArrayList<BillingInfo> allRecord = new ArrayList<>();
    ArrayList<Medicine> allMedicines = new ArrayList<>();
    ArrayList<Patient> allPatients = new ArrayList<>();

    /**
     * Creates new form Checkup
     */
    public Checkup() {
        initComponents();
        readAllMData();
        readAllPData();
        readAllRData();
        LoadMed();
    }

    void readAllRData() {
        try {
            File pfile = new File("record.txt");
            Scanner scan = new Scanner(pfile);

            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                String[] curData = data.split(";");
                BillingInfo record = new BillingInfo();
                record.setPatientID(Integer.parseInt(curData[0]));

                record.setFee(Integer.parseInt(curData[1]));

                record.setRecomendation(curData[2]);

                record.setDate(curData[3]);
                String[] mList = curData[4].split(";");

                for (int i = 0; i < mList.length; i++) {
                    record.setMedicineID(Integer.parseInt(mList[i]));

                }
                allRecord.add(record);
            }

            scan.close();

        } catch (Exception e) {

        }
    }

    void LoadMed() {
        allMed.removeAllItems();
        for (int i = 0; i < allMedicines.size(); i++) {
            allMed.addItem(allMedicines.get(i).getId() + ": " + allMedicines.get(i).getName());
        }
    }

    void readAllPData() {
        try {
            File pfile = new File("pdata.txt");
            Scanner scan = new Scanner(pfile);

            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                String[] curData = data.split(";");
                Patient patient = new Patient();
                patient.setId(Integer.parseInt(curData[0]));

                patient.setName(curData[1]);

                patient.setAge(Integer.parseInt(curData[2]));

                patient.setGender(curData[3]);

                patient.setAddress(curData[4]);

                patient.setContact(curData[5]);

                allPatients.add(patient);

            }

            scan.close();

        } catch (Exception e) {

        }
    }

    void readAllMData() {
        try {
            File pfile = new File("mdata.txt");
            Scanner scan = new Scanner(pfile);

            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                String[] curData = data.split(";");
                Medicine medicine = new Medicine();
                medicine.setId(Integer.parseInt(curData[0]));

                medicine.setName(curData[1]);

                medicine.setSellingPrice(Integer.parseInt(curData[2]));

                medicine.setBuyingPrice(Integer.parseInt(curData[3]));

                medicine.setQuantity(Integer.parseInt(curData[4]));

                medicine.setDescription(curData[5]);

                allMedicines.add(medicine);

            }

            scan.close();

        } catch (Exception e) {

        }
    }

    void SaveAllMData() {
        try {
            FileWriter fileWriter = new FileWriter("mdata.txt");

            for (int i = 0; i < allMedicines.size(); i++) {
                fileWriter.write(allMedicines.get(i).getId() + ";" + allMedicines.get(i).getName() + ";" + allMedicines.get(i).getSellingPrice() + ";" + allMedicines.get(i).getBuyingPrice() + ";" + allMedicines.get(i).getQuantity() + ";" + allMedicines.get(i).getDescription() + ";" + "\n");
            }

            fileWriter.close();
        } catch (Exception e) {

        }
    }

    void SaveAllPData() {
        try {
            FileWriter fileWriter = new FileWriter("pdata.txt");

            for (int i = 0; i < allPatients.size(); i++) {
                fileWriter.write(allPatients.get(i).getId() + ";" + allPatients.get(i).getName() + ";" + allPatients.get(i).getAge() + ";" + allPatients.get(i).getGender() + ";" + allPatients.get(i).getAddress() + ";" + allPatients.get(i).getContact() + ";" + "\n");
            }

            fileWriter.close();
        } catch (Exception e) {

        }
    }

    boolean checkForQuantity() {
        int currMId = Integer.parseInt(allMed.getSelectedItem().toString().split(":")[0]);
        for (int i = 0; i < allMedicines.size(); i++) {
            if (currMId == allMedicines.get(i).getId()) {
                if (Integer.parseInt(quantity.getText()) > allMedicines.get(i).getQuantity()) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    boolean PatientIdExist() {

        for (int i = 0; i < allPatients.size(); i++) {
            if (patientID.getText().equals(allPatients.get(i).getId() + "")) {
                return false;
            }
        }

        return true;
    }

    void SaveAllRData() {
        try {
            FileWriter fileWriter = new FileWriter("record.txt");

            for (int i = 0; i < allRecord.size(); i++) {
                fileWriter.append(allRecord.get(i).getPatientID() + ";" + allRecord.get(i).getFee() + ";" + allRecord.get(i).getRecomendation() + ";" + allRecord.get(i).getDate() + ";");
                ArrayList<Integer> tmp = allRecord.get(i).getMedicineID();

                for (int j = 0; j < tmp.size(); j++) {
                    fileWriter.append(tmp.get(j) + ",");
                }
                fileWriter.append("\n");
            }

            fileWriter.close();
        } catch (Exception e) {

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        patientID = new javax.swing.JTextField();
        fee = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        allMed = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        recomend = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        medList = new javax.swing.JTextArea();
        save = new javax.swing.JButton();
        addMedicine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1636, 137));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Checkup Menu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Luchimir Hospital");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedicalRecords/images/Checkups.png"))); // NOI18N

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(0, 0, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addGap(415, 415, 415)
                .addComponent(home)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Patient ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fee");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Recomendations");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Quantity");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Medicines");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Medicine List");

        patientID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        fee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        quantity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        allMed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        allMed.setForeground(new java.awt.Color(0, 0, 0));
        allMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        recomend.setColumns(20);
        recomend.setRows(5);
        jScrollPane1.setViewportView(recomend);

        medList.setColumns(20);
        medList.setRows(5);
        jScrollPane2.setViewportView(medList);

        save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(255, 0, 0));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        addMedicine.setBackground(new java.awt.Color(204, 204, 204));
        addMedicine.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addMedicine.setForeground(new java.awt.Color(0, 153, 51));
        addMedicine.setText("Add Medicine");
        addMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fee, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)))))
                .addGap(220, 220, 220)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quantity)
                    .addComponent(allMed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(600, 600, 600))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(allMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 277, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1650, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void addMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineActionPerformed
        // TODO add your handling code here:
        if (quantity.getText().equals("") || allMed.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select Medication or Enter Quantity");
        } else if (checkForQuantity()) {
            JOptionPane.showMessageDialog(null, "Current Quantity is greater than available quantity");
        } else {

            medList.append(allMed.getSelectedItem() + ":" + quantity.getText() +"\n");
        }
    }//GEN-LAST:event_addMedicineActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        if (patientID.getText().equals("") || fee.getText().equals("") || recomend.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else if (PatientIdExist()) {
            JOptionPane.showMessageDialog(null, "Patient Id didn't Exist!");
        } else {

            try {

                BillingInfo billingInfo = new BillingInfo();

                String Bill = "";
                int total = 0;

                billingInfo.setPatientID(Integer.parseInt(patientID.getText()));
                billingInfo.setFee(Integer.parseInt(fee.getText()));

                String[] Mdata = medList.getText().split("\n");

                for (int i = 0; i < Mdata.length; i++) {
                    billingInfo.setMedicineID(Integer.parseInt(Mdata[i].split(":")[0]));
                    int curQ = Integer.parseInt(Mdata[i].split(":")[2]);
                    int curID = Integer.parseInt(Mdata[i].split(":")[0]);

                    for (int j = 0; j < allMedicines.size(); j++) {
                        if (allMedicines.get(j).getId() == curID) {

                            Bill += allMedicines.get(j).getName() + "  =  " + allMedicines.get(j).getSellingPrice() + "\n";
                            total += allMedicines.get(j).getSellingPrice();
                            allMedicines.get(j).setQuantity(allMedicines.get(j).getQuantity() - curQ);
                        }
                    }
                }
                billingInfo.setRecomendation(recomend.getText());
                DateFormat cDateFormat = new SimpleDateFormat("dd-MM-YYYY");
                Date cdate = new Date();
                billingInfo.setDate(cDateFormat.format(cdate));
                allRecord.add(billingInfo);

                SaveAllMData();
                SaveAllRData();
                Bill += "\nTotal Medicine Cost: " + (total*Integer.parseInt(quantity.getText()));
                quantity.setText("");
                Bill += "\nFee: " + fee.getText();
                Bill += "\n\nTotal: " + (total + Integer.parseInt(fee.getText()));
                JOptionPane.showMessageDialog(null, "Total Bill: \n\n" + Bill);
                patientID.setText("");
                fee.setText("");
                recomend.setText("");
                medList.setText("");
            } catch (Exception e) {
                System.out.println(e);
            }
    }//GEN-LAST:event_saveActionPerformed
    }
    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Checkup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicine;
    private javax.swing.JComboBox<String> allMed;
    private javax.swing.JTextField fee;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea medList;
    private javax.swing.JTextField patientID;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextArea recomend;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
