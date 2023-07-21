/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.factorymethod.connections;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Veljko
 */
public class JDBCDevConnection extends JDBCConnection {

    private static final String DATABASE_PASSWORD = "root_password";

    public JDBCDevConnection() throws SQLException {
        url = "jdbc:mysql://localhost:3306/devDB?characterEncoding=utf8";
        connection = DriverManager.getConnection(url, username, DATABASE_PASSWORD);
    }

    @Override
    public String toString() {
        return "This is database connection to dev database!";
    }
}
