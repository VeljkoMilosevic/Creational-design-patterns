/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.factorymethod.creator;


import desing.patterns.patterns.factorymethod.connections.JDBCConnection;

import java.sql.SQLException;

/**
 * @author Veljko
 */
public abstract class JDBCConnectionCreator {

    public JDBCConnection getConnection() throws SQLException {
        return getConcreteConnection();
    }

    protected abstract JDBCConnection getConcreteConnection() throws SQLException;
}
