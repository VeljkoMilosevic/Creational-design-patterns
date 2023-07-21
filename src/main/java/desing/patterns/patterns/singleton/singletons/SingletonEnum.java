/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.singleton.singletons;

/**
 * @author Veljko
 */
public enum SingletonEnum {
    INSTANCE;
    
    public void method() {
        System.out.println("Singleton enum method!");
    }
}
