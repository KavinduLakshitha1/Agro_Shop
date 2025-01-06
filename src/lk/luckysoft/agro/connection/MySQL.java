/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.luckysoft.agro.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author KAVINDU
 */
public class MySQL {

    private static Connection connection;

    private static Connection getconnetion() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agro_db", "root", "Mamunuwa@123");

            }
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            throw new ExceptionInInitializerError("MySQL Connetion error...!");
        }

    }

    public static void iud(String query) {
        try {
            getconnetion().createStatement().executeUpdate(query);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ResultSet search(String query) throws SQLException {
        return getconnetion().createStatement().executeQuery(query);
    }

}
