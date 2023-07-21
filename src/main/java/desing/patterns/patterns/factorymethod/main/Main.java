/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.factorymethod.main;

import desing.patterns.patterns.factorymethod.connections.JDBCConnection;
import desing.patterns.patterns.factorymethod.creator.JDBCConnectionCreator;
import desing.patterns.patterns.factorymethod.creator.JDBCDevConnectionCreator;
import desing.patterns.patterns.factorymethod.creator.JDBCProdConnectionCreator;

/**
 * @author Veljko
 */
public class Main {

    public static void main(final String[] args) {
        createProdConnection();
        createDevConnection();
    }

    private static void createProdConnection() {
        try {
            final JDBCConnectionCreator connectionCreator = new JDBCProdConnectionCreator();
            final JDBCConnection jdbcConnection = connectionCreator.getConnection();
            System.out.println(jdbcConnection);
        } catch (final Exception ex) {
            throw new IllegalStateException("Exception during creation database connection", ex);
        }
    }


    private static void createDevConnection() {
        try {
            final JDBCConnectionCreator connectionCreator = new JDBCDevConnectionCreator();
            final JDBCConnection jdbcConnection = connectionCreator.getConnection();
            System.out.println(jdbcConnection);
        } catch (final Exception ex) {
            throw new IllegalStateException("Exception during creation database connection", ex);
        }
    }
}
