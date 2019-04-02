/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alexis
 */
public class conexion {

    private static Connection connection = null;
    private static String login = "ALEXIS";
    private static String password = "alex123";
    private static String cadena = "jdbc:oracle:thin:@localhost:1521:XE";

    public conexion() {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(cadena, login, password);
            connection.setAutoCommit(false);
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

    public Connection getConexion() {
        return connection;
    }

    public void closeconn() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }
  
}
