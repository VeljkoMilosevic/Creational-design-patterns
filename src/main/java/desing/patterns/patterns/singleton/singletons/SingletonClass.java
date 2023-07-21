/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.singleton.singletons;

import desing.patterns.patterns.singleton.exceptions.MultipleInstancesException;

/**
 * @author Veljko
 */
public class SingletonClass {

    private static final SingletonClass singletonInstance;

    static {
        singletonInstance = new SingletonClass();
    }

    private SingletonClass() throws MultipleInstancesException {
        if (singletonInstance != null) {
            throw new MultipleInstancesException("You tried initialize another singleton instance with reflection!");
        }
    }

    public static SingletonClass getInstance() {
        return singletonInstance;
    }
}
