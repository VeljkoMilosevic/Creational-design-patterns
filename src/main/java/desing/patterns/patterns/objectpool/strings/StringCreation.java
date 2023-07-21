/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.objectpool.strings;

import java.util.Date;

/**
 * @author Veljko
 */
public class StringCreation {

    private static final int BILLION = 1_000_000_000;

    public static void main(final String[] args) {

        Date date = new Date();
        for (int i = 0; i < BILLION; i++) {
            new String("String_value");
        }
        System.out.println("Time needed to create new Strings from without string pool (millis):" + (new Date().getTime() - date.getTime()));

        date = new Date();
        for (int i = 0; i < BILLION; i++) {
            final String s = "String";
        }
        System.out.println("Time needed to create new Strings from string pool (millis):" + (new Date().getTime() - date.getTime()));

    }
}
