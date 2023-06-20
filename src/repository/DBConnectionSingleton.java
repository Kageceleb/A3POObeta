package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DBConnectionSingleton {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/charactersheet?zeroDateTimeBehavior=convertToNull";
    private static final String USER = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SENHA = "root";

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, SENHA);
            return connection;
        } catch (Exception e) {
            System.out.println("Error connection to db");
            System.out.println(e);
            return null;
        }
    }

    static public ResultSet execute(String query) {
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println("Error connection to db");
            System.out.println(e);
            return null;
        }
    }

    static public void closeConnection() {
        if (connection != null)
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Error connection to db");
                System.out.println(e);
            }

    }

}