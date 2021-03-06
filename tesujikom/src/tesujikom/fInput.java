/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * fInput.java
 *
 * Created on Mar 6, 2018, 2:26:53 AM
 */
package tesujikom;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Nadia
 */
public class fInput extends javax.swing.JFrame {
    public DefaultTableModel tabModel;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    String nama, alamat, jkel, idcust, phone;

    /** Creates new form fInput */
    public fInput() {
        initComponents();
        Koneksi DB = new Koneksi();
        DB.config();
        con= (Connection) DB.conn;
        st = (Statement) DB.stm;
        setJTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        TxtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAlamat = new javax.swing.JTextArea();
        TxtPhone = new javax.swing.JTextField();
        BtnTambah = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TCustomer = new javax.swing.JTable();
        CbJkel = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("No Telepon");

        jLabel5.setText(":");

        jLabel6.setText(":");

        jLabel7.setText(":");

        jLabel8.setText(":");

        jLabel9.setText(":");

        jLabel10.setText("Jenis Kelamin");

        TxtId.setEnabled(false);
        TxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdActionPerformed(evt);
            }
        });

        TxtAlamat.setColumns(20);
        TxtAlamat.setRows(5);
        jScrollPane1.setViewportView(TxtAlamat);

        BtnTambah.setText("Tambah");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        BtnEdit.setText("Sunting");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnBatal.setText("Batal");
        BtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalActionPerformed(evt);
            }
        });

        TCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TCustomer);

        CbJkel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Wanita", "Pria" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbJkel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(CbJkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnTambah)
                            .addComponent(BtnEdit))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnHapus)
                            .addComponent(BtnBatal)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
// TODO add your handling code here:
    
    if(BtnTambah.getText().equals("Tambah")){
        idotomatis();
        TxtId.setEnabled(false);
        TxtNama.setEnabled(true);
        TxtAlamat.setEnabled(true);
        TxtPhone.setEnabled(true);
        CbJkel.setEnabled(true);
        
        BtnTambah.setText("Simpan");

        BtnTambah.setEnabled(true);
        BtnEdit.setEnabled(false);
        BtnHapus.setEnabled(false);
        BtnBatal.setEnabled(true); 
    }else if(BtnTambah.getText().equals("Simpan")){
        simpanData();
        TxtId.setEnabled(false);
        TxtNama.setEnabled(false);
        TxtAlamat.setEnabled(false);
        TxtPhone.setEnabled(false);
        CbJkel.setEnabled(false);

        BtnTambah.setEnabled(false);
        BtnEdit.setEnabled(true);
        BtnHapus.setEnabled(true);
        BtnBatal.setEnabled(true); 
    }
            
}//GEN-LAST:event_BtnTambahActionPerformed

private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
// TODO add your handling code here:
    if(BtnEdit.getText().equals("Sunting")){
        ambilData_dari_JTable();
        TxtId.setEnabled(false);
        TxtNama.setEnabled(true);
        TxtAlamat.setEnabled(true);
        TxtPhone.setEnabled(true);
        CbJkel.setEnabled(true);
        
        BtnEdit.setText("Perbaharui");

        BtnTambah.setEnabled(false);
        BtnEdit.setEnabled(true);
        BtnHapus.setEnabled(false);
        BtnBatal.setEnabled(true); 
    }else if(BtnEdit.getText().equals("Perbaharui")){
        //JOptionPane.showMessageDialog(this,"Input Berhasil");
        rubahData();
        TxtId.setEnabled(false);     
        TxtNama.setText(""); 
        TxtAlamat.setText("");     
        TxtPhone.setText("");    
        
        BtnTambah.setEnabled(false);
        BtnEdit.setEnabled(true);
        BtnHapus.setEnabled(false);
        BtnBatal.setEnabled(true); 
    }
        
}//GEN-LAST:event_BtnEditActionPerformed

private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
// TODO add your handling code here:
    hapus_Data();
    
}//GEN-LAST:event_BtnHapusActionPerformed

private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
// TODO add your handling code here:
    TxtId.setText("");
    TxtNama.setText("");
    TxtAlamat.setText("");
    TxtPhone.setText("");
    
    CbJkel.setEnabled(false);
    TxtId.setEnabled(false);
    TxtNama.setEnabled(false);
    TxtAlamat.setEnabled(false);
    TxtPhone.setEnabled(false);
    
    BtnTambah.setText("Tambah");
    BtnEdit.setText("Sunting");
    BtnTambah.setEnabled(true);
    BtnEdit.setEnabled(true);
    BtnHapus.setEnabled(true);
    BtnBatal.setEnabled(false);
}//GEN-LAST:event_BtnBatalActionPerformed

private void TxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_TxtIdActionPerformed

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
            java.util.logging.Logger.getLogger(fInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new fInput().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JComboBox CbJkel;
    private javax.swing.JTable TCustomer;
    private javax.swing.JTextArea TxtAlamat;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtPhone;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void getData(){
  try{
        //Memanggil Driver
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.0.100:3306/db_nadia","smk","bivos");
        String sql="Select * from customer";
        PreparedStatement st=con.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        String Id, Nama, Alamat, Phone, Jkel;
        int no=0;
        while(rs.next()){
         no=no+1;
         Id=rs.getString("idcust");
         Nama=rs.getString("nama");
         Alamat=rs.getString("alamat");
         Phone=rs.getString("phone");
         Jkel=rs.getString("jkel");

         Object Data[]={no,Id,Nama,Alamat,Phone,Jkel};
         tabModel.addRow(Data);
        }
          // Tutup Koneksi
//          st.close();
//          con.close();
    }
    catch (ClassNotFoundException cnfe) {         // Ketika Gagal Memanggil Driver
           System.out.println("Class Driver tidak ditemukan.. : " + cnfe);
           System.exit(0);
    }
    catch (SQLException sqle) {                   // Ketika Gagal Sql   // import java.sql.SQLException
           System.out.println("Proses Query Gagal = " + sqle);
           System.exit(0);
    }
    catch(Exception e){
           System.out.println("Koneksi Access Gagal " +e.getMessage());
           System.exit(0);
    }

    }    // Akhir Method getData
    
    private void setJTable(){
    String [] JudulKolom={"No","Id Pelanggan","Nama","Alamat","No Telepon","Jenis Kelamin"};
    tabModel = new DefaultTableModel(null, JudulKolom){
                  boolean[] canEdit = new boolean [] { false, false, false, false, false, false };
                  @Override
                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                   return canEdit [columnIndex];
                  }
              };
    TCustomer.setModel(tabModel);
    TCustomer.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    TCustomer.getColumnModel().getColumn(0).setPreferredWidth(30);
    TCustomer.getColumnModel().getColumn(1).setPreferredWidth(100);
    TCustomer.getColumnModel().getColumn(2).setPreferredWidth(100);
    TCustomer.getColumnModel().getColumn(3).setPreferredWidth(300);
    TCustomer.getColumnModel().getColumn(4).setPreferredWidth(100);
    TCustomer.getColumnModel().getColumn(5).setPreferredWidth(100);

    getData();
}
    
    void ambilData_dari_JTable() {
    int row = TCustomer.getSelectedRow();

    // Mengambil data yang dipilih pada JTable
    String idcust = tabModel.getValueAt(row, 1).toString();
    String nama = tabModel.getValueAt(row, 2).toString();
    String alamat = tabModel.getValueAt(row, 3).toString();
    String phone = tabModel.getValueAt(row, 4).toString();
    String jkel = tabModel.getValueAt(row, 5).toString();
    
    TxtId.setText(idcust);
    TxtNama.setText(nama);
    TxtAlamat.setText(alamat);
    TxtPhone.setText(phone);
    CbJkel.setSelectedItem(jkel);
  }
    
    // Method Untuk Menghapus Semua Isi JTable
public void hapusIsiJTable() {
    int row = tabModel.getRowCount();
    for (int i = 0; i < row; i++) {
      tabModel.removeRow(0);
    }
  }
//  Method Untuk Menampilkan Data dari tabel Anggota Ke JTable
public void tampilDataKeJTable() {
    hapusIsiJTable();
    try {
        con.close();
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.0.100:3306/db_nadia","smk","bivos");  
        String sql="Select * from customer";
        PreparedStatement st=con.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        String Id, Nama, Alamat, Phone, Jkel;
        int no=0;
        while(rs.next()){
         no=no+1;
         Id=rs.getString("idcust");
         Nama=rs.getString("nama");
         Alamat=rs.getString("alamat");
         Phone=rs.getString("phone");
         Jkel=rs.getString("jkel");
         Object Data[]={no,Id,Nama,Alamat,Phone,Jkel};
         tabModel.addRow(Data);
      }
  }
    catch (Exception e) {}
}

public void rubahData() {
    // Konfirmasi sebelum melakukan perubahan data
    int ok = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Ingin Mengubah Data\n Dengan Id Customer = '" + TxtId.getText() +
        "'", "Konfirmasi ",JOptionPane.YES_NO_OPTION);
    // Apabila tombol Yes ditekan
    if (ok == 0) {
      try {
        String sql ="UPDATE customer SET nama = ?, alamat= ?, phone=?, jkel=? WHERE idcust = ?";
        PreparedStatement st = con.prepareStatement(sql);
        try {
          st.setString(1, TxtNama.getText());
          st.setString(2, TxtAlamat.getText());
          st.setString(3, TxtPhone.getText());
          st.setObject(4, CbJkel.getSelectedItem());
          st.setString(5, TxtId.getText());
          st.executeUpdate();

         // Memanggil Method   tampilDataKeJTable();
          tampilDataKeJTable();

          TxtId.setText("");
          TxtNama.setText("");
          TxtAlamat.setText("");
          TxtPhone.setText("");
          CbJkel.setSelectedItem("");
        } catch (SQLException se) { }     // Silahkan tambahkan Sendiri informasi Eksepsi
      }catch (SQLException se) {}  // Silahkan tambahkan Sendiri informasi Eksepsi
    }
    
  }

public void simpanData(){
//Connection conn;
     try{
            Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.0.100:3306/db_nadia","smk","bivos");
            String sql="Insert into customer values(?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
                st.setString(1, TxtId.getText());
                st.setString(2, TxtNama.getText());
                st.setString(3, TxtAlamat.getText());
                st.setString(4, TxtPhone.getText());
                st.setObject(5, CbJkel.getSelectedItem());
            int rs=st.executeUpdate();

            if(rs>0){
            JOptionPane.showMessageDialog(this,"Input Berhasil");
      	    tampilDataKeJTable();
            }
            st.close();
            con.close();
        }
        catch (ClassNotFoundException cnfe) {
           System.out.println("Class Driver tidak ditemukan.. : " + cnfe);
        }
        catch (SQLException sqle) {
           System.out.println("Input  Gagal = " + sqle.getMessage());
        }
        catch(Exception e){
           System.out.println("Gagal Tuh.. Bego Lu " +e.getMessage());
        }
  }

public void hapus_Data() {
    // Konfirmasi sebelum melakukan penghapusan data
    ambilData_dari_JTable();
    int ok = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Ingin Menghapus Data\nDengan Id Customer = '" + TxtId.getText() +
        "'", "Konfirmasi Menghapus Data",JOptionPane.YES_NO_OPTION);
    if (ok == 0) {     // Apabila tombol OK ditekan
      try {
       Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.0.100:3306/db_nadia","smk","bivos");
        String sql = "DELETE FROM customer WHERE idcust = ?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, TxtId.getText());
        int rs=st.executeUpdate();
        if(rs>0){
        tampilDataKeJTable();
        JOptionPane.showMessageDialog(this,"Data Sudah dihapus");
        }
        TxtId.setText("");
        TxtNama.setText("");
        TxtAlamat.setText("");
        TxtPhone.setText("");
        CbJkel.setSelectedItem("");
      } catch (Exception se) {  // Silahkan tambahkan catch Exception yang lain
         JOptionPane.showMessageDialog(this,"Gagal Hapus Data.. ");
       }
    }
  }

public void idotomatis() {
        try {
        
        sql = "SELECT * FROM customer ORDER BY idcust desc";
        st= (Statement) con.prepareStatement(sql);
        rs=st.executeQuery(sql);   // import java.sql.ResultSet;
            
            if (rs.next()) {
                String id = rs.getString("idcust").substring(1);
                String AN = "" + (Integer.parseInt(id) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "00";}
                else if(AN.length()==2)
                {Nol = "0";}
                else if(AN.length()==3)
                {Nol = "";}
                TxtId.setText("P" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                TxtId.setText("P001");//sesuaikan dengan variable namenya
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();//penanganan masalah
        }
  }

class JTextFieldFilter extends PlainDocument {

    public static final String numeric = "0123456789";
    public static final String huruf = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXXYZ";
    public static final String alamat = " 0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXXYZ.-()";
    protected String acceptedChars = null;
    protected boolean negativeAccepted = false;

    public JTextFieldFilter(String acceptedchars) {
    acceptedChars = acceptedchars;
    }

    public void setNegativeAccepted(boolean negativeaccepted) {
    if (acceptedChars.equals(numeric) || (acceptedChars.equals(huruf))){
    negativeAccepted = negativeaccepted;
    acceptedChars += "-";
    }

    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    if (str == null)
    return;

    for (int i = 0; i < str.length(); i++) {
    if (acceptedChars.indexOf(str.valueOf(str.charAt(i))) == -1)
    return;
    }

    if (negativeAccepted && str.indexOf("-") != -1) {
    if (str.indexOf("-") != 0 || offset != 0) {
    return;
    }
    }

    super.insertString(offset, str, attr);
    }
    }


}
