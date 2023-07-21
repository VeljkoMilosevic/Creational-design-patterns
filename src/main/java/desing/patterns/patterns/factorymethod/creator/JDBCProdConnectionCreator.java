/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.factorymethod.creator;

import desing.patterns.patterns.factorymethod.connections.JDBCConnection;
import desing.patterns.patterns.factorymethod.connections.JDBCProdConnection;

import java.sql.SQLException;


/**
 * @author Veljko
 */
public class JDBCProdConnectionCreator extends JDBCConnectionCreator {

    @Override
    protected JDBCConnection getConcreteConnection() throws SQLException {
        return new JDBCProdConnection();
    }


}
