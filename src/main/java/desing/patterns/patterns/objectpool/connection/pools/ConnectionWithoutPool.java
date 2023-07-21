/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.objectpool.connection.pools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Veljko
 */
public class ConnectionWithoutPool {
    private static Connection connection;
    private static final String user = "root";
    private static final String userPassword = "root_password";


    public void makeConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/devDB?characterEncoding=utf8", user, userPassword);
    }


    public void breakConnection() throws SQLException {
        connection.close();
    }
}
