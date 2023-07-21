/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.objectpool.connection.pools;

import java.sql.SQLException;
import java.util.Date;

/**
 * @author Veljko
 */
public class ConnectionMain {

    public static void main(final String[] args) throws SQLException {
        calculateTimeWithPool();
        calculateTimeWithoutPool();
    }

    private static void calculateTimeWithPool() throws SQLException {
        final ConnectionPool connectionPool = new ConnectionPool();
        final Date date = new Date();

        for (int i = 0; i < 1000; i++) {
            connectionPool.makeConnection();
            connectionPool.breakConnection();
        }
        System.out.println(String.format("Time needed for creating 1000 connection when using pool:%s ms.", (new Date().getTime() - date.getTime())));
    }

    private static void calculateTimeWithoutPool() throws SQLException {
        final ConnectionWithoutPool connectionWithoutPool = new ConnectionWithoutPool();
        final Date date = new Date();

        for (int i = 0; i < 1000; i++) {
            connectionWithoutPool.makeConnection();
            connectionWithoutPool.breakConnection();
        }
        System.out.println(String.format("Time needed for creating 1000 connection when create new connection each time:%s ms.", (new Date().getTime() - date.getTime())));
    }
}
