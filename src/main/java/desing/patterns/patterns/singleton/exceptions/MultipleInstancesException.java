/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.singleton.exceptions;

/**
 * @author Veljko
 */
public class MultipleInstancesException extends RuntimeException {

    public MultipleInstancesException(final String msg) {
        super(msg);
    }
}
