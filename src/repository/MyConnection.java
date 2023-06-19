package repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MyConnection {
    
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/charactersheet?zeroDateTimeBehavior=convertToNull";
    private static final String USER = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SENHA = "root";
    
    public static void myExecute(String query){
        try {
            Class.forName( DRIVER );
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            st.execute( query );
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public static ResultSet consult(String query){
        try {
            Class.forName( DRIVER );
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery( query );
        //    conn.close();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }   
}