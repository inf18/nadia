package tesujikom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nadia
 */
public class Koneksi {
    Connection conn;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.100:3306/db_nadia","smk","bivos");
            stm = conn.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal "+ e.getMessage());
        
        }
    }
    
}
