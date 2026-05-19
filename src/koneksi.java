import java.sql.*;
import javax.swing.*;
public class koneksi {
    Connection con;
    Statement stm;
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbpegawai","root","");
            stm = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal Karena " + e.getMessage());
        }
    }
}