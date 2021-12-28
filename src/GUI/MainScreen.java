
package GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainScreen extends javax.swing.JFrame {

    public ClassMethode data; 
    public int sizeTable;
    DefaultTableModel model;
    public Object[] objek;
    public int nomor;
    String[] tabHeader = new String[]{"No","Nama","No Rumah","No KK","No Telephone","Jumlah Anggota"};
    
    public MainScreen(int size) {
        
        this.sizeTable = size;        
        initComponents();
        this.setLocationRelativeTo(null);
        model = new DefaultTableModel(tabHeader,0);
        data = new ClassMethode(sizeTable);
        objek = new Object[100];
        tableData.setModel(model); 
        this.nomor = 0;
        
    }

    private MainScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Insert = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNoUrut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoKK = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNoRumah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtBanyakRumah = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Tampilan = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSorting = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Adobe Garamond Pro", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Sistem Manajemen Informasi Desa");

        jTabbedPane2.setBackground(new java.awt.Color(255, 153, 51));
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(760, 478));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(760, 531));

        Insert.setBackground(new java.awt.Color(255, 153, 0));
        Insert.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("No. Urut");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtNoUrut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtNoUrut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 310, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nama");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 310, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("No. KK");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtNoKK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtNoKK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 310, -1));

        txtJumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 310, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Jumlah Anggota");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        txtNoTelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtNoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 310, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("No. Telephone");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        txtNoRumah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtNoRumah, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 310, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("No. Rumah");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertMouseClicked(evt);
            }
        });
        jPanel2.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 140, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 140, -1));

        txtBanyakRumah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtBanyakRumah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("Save");
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
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("*Masukkan Banyak Data Warga terlebih dahulu");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.jpg"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        Insert.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        jTabbedPane2.addTab("Insert", Insert);

        Tampilan.setBackground(new java.awt.Color(255, 153, 0));
        Tampilan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "No KK", "No Rumah", "No Telephone", "Jumlah Anggota"
            }
        ));
        jScrollPane1.setViewportView(tableData);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 710, 170));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama", "No. Rumah", "No. KK", "Jumlah Anggota" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 160, -1));

        btnSorting.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSorting.setText("Sorting");
        btnSorting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortingActionPerformed(evt);
            }
        });
        jPanel3.add(btnSorting, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 160, -1));

        btnShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnShow.setText("Show");
        btnShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowMouseClicked(evt);
            }
        });
        jPanel3.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, -1));

        btnDeleteAll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteAll.setText("Delete All");
        btnDeleteAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteAllMouseClicked(evt);
            }
        });
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });
        jPanel3.add(btnDeleteAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 170, -1));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 40, 230, -1));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 40, 110, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.jpg"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        Tampilan.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        jTabbedPane2.addTab("Tampilan", Tampilan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseClicked
        String nama = txtNama.getText();
        int noRumah = Integer.parseInt(txtNoRumah.getText());
        int noKK = Integer.parseInt(txtNoKK.getText());
        String noTelp = txtNoTelp.getText();
        int jumlah = Integer.parseInt(txtJumlah.getText());
        int urut = Integer.parseInt(txtNoUrut.getText());
        
        
        data.insert(nama, noRumah, noKK, noTelp, jumlah, urut);        
        JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
            
        
    }//GEN-LAST:event_btnInsertMouseClicked

    private void btnShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMouseClicked
       Show();
    }//GEN-LAST:event_btnShowMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        clearForm();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnDeleteAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAllMouseClicked
        data.DeleteAll();
    }//GEN-LAST:event_btnDeleteAllMouseClicked

    private void btnSortingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortingActionPerformed
        String valueCombo = jComboBox1.getSelectedItem().toString();
        if(valueCombo.equals("Nama")){
            data.quickSortNama();
            Show();
            
        } else if(valueCombo.equals("No. Rumah")){
            data.BubbleSortNoRumah();
            Show();
        } else if(valueCombo.equals("No. KK")){
           data.BubbleSortNoKK();
            Show();
        }
        else if(valueCombo.equals("Jumlah Anggota")) {
            data.BubbleSortJmlAnggota();
            Show();
        }else{
           JOptionPane.showMessageDialog(null, "Data tidak dapat di urutkan");
        }
    }//GEN-LAST:event_btnSortingActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = txtSearch.getText();
        int hasil = data.binarySearch(search);    
        model.setRowCount(0);
        Object[]objek = {hasil, data.hashArray[hasil].nama, data.hashArray[hasil].noRumah, data.hashArray[hasil].noKK, data.hashArray[hasil].noTelp, data.hashArray[hasil].jumlah};
        model.addRow(objek);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        int size = Integer.parseInt(txtBanyakRumah.getText());
        MainScreen data = new MainScreen(size);        
        JOptionPane.showMessageDialog(null, "Data telah tersimpan");
        data.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void clearForm(){
        txtNoUrut.setText("");
        txtNama.setText("");
        txtNoRumah.setText("");
        txtNoKK.setText("");
        txtNoTelp.setText("");
        txtJumlah.setText("");
    }
    
    public void Show(){
       model.setRowCount(0);
       for(int i=0;i<data.size;i++){
            if(data.hashArray[i] == null){
                data.hashArray[i] = null;
            }
            else {
                Object[]objek = {i, data.hashArray[i].nama, data.hashArray[i].noRumah, data.hashArray[i].noKK, data.hashArray[i].noTelp,data.hashArray[i].jumlah};
                model.addRow(objek);              
            }             
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Insert;
    private javax.swing.JPanel Tampilan;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSorting;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtBanyakRumah;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoKK;
    private javax.swing.JTextField txtNoRumah;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtNoUrut;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
