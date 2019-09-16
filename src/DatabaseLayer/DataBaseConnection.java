/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gugatharsan
 */
public class DataBaseConnection {
        private final String URL = "jdbc:derby://localhost:1527/viva";

    private Connection conn;
    private static DataBaseConnection instance;

    private DataBaseConnection() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL);
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not loaded");
        } catch (SQLException ex) {
            System.out.println("Your connection has issue");
        }

    }

    public boolean InsertQuery(String Query) {
        try {
            java.sql.Statement st = conn.createStatement();
            int result = st.executeUpdate(Query);
            boolean status = (result > 0);
            return status;
        } catch (SQLException ex) {
            System.out.println("Someting wrong in your query");
            return false;

        }
    }

    public static  DataBaseConnection getSingleConnection() {
        try {
            if (instance == null) {
                instance = new DataBaseConnection();
                return instance;

            } else if (instance.conn.isClosed()) {
                instance = new DataBaseConnection();
                return instance;

            } else {
                return instance;
            }

        } catch (SQLException ex) {
            System.out.println("Somthing Worng with DB");
            return null;

        }

    }
}
