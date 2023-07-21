/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.singleton.singletons;

/**
 * @author Veljko
 */
public class SingletonClassLazyInitialization {

    private static SingletonClassLazyInitialization singletonInstance;

    private SingletonClassLazyInitialization() {
    }

    public static SingletonClassLazyInitialization getInstance() {
        //eager initialization
        if (singletonInstance == null) {
            singletonInstance = new SingletonClassLazyInitialization();
        }
        return singletonInstance;
    }

    public void method() {
        System.out.println("Lazy singleton method!");
    }
}
