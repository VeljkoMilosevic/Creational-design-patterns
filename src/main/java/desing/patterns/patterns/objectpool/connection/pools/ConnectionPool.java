/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.objectpool.connection.pools;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;


/**
 * @author Veljko
 */
public class ConnectionPool {

    Connection connection;
    HikariDataSource dataSource;

    private static final String USER = "root";
    private static final String USER_PASSWORD = "root_password";

    public ConnectionPool() {
        initPoolDataSource();
    }

    private void initPoolDataSource() {
        final HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/devDB?characterEncoding=utf8");
        config.setUsername(USER);
        config.setPassword(USER_PASSWORD);

        config.setMaximumPoolSize(30);
        config.setConnectionTimeout(10000);

        dataSource = new HikariDataSource(config);
    }

    public void breakConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public void makeConnection() throws SQLException {
        connection = dataSource.getConnection();
        connection.setAutoCommit(false);
    }

}
