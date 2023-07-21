/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.singleton.main;

import desing.patterns.patterns.singleton.singletons.DoubleCheckLockSingleton;
import desing.patterns.patterns.singleton.singletons.SingletonClass;
import desing.patterns.patterns.singleton.singletons.SingletonClassLazyInitialization;
import desing.patterns.patterns.singleton.singletons.SingletonEnum;

import java.lang.reflect.Constructor;

/**
 * @author Veljko
 */
public class Main {

    public static void main(final String[] args) {
        callingSingletonEnum();
        callingSingletonLazyInit();
        callingSingletonWithReflection();
        callingDoubleCheckLockSingleton();
    }

    private static void callingSingletonWithReflection() {
        final SingletonClass singletonClass1 = SingletonClass.getInstance();
        final SingletonClass singletonClass2 = SingletonClass.getInstance();
        System.out.println("Both singleton instances are on same memory location:" + (singletonClass1 == singletonClass2));

        try {
            final Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
            constructor.newInstance();
        } catch (final Exception ex) {
            System.out.println("Caught exception. Cannot access with reflect. Only one instance is allowed to be created!");
        }
    }

    private static void callingSingletonLazyInit() {
        final SingletonClassLazyInitialization singletonClassLazyInitialization = SingletonClassLazyInitialization.getInstance();
        singletonClassLazyInitialization.method();
    }

    private static void callingSingletonEnum() {
        SingletonEnum.INSTANCE.method();
    }

    private static void callingDoubleCheckLockSingleton() {
        DoubleCheckLockSingleton.getInstance().method();
    }

}
