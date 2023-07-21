/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.idioms.telescoping.main;

import desing.patterns.idioms.telescoping.model.Laptop;

/**
 * @author Veljko
 */
public class Main {

    public static void main(final String[] args) {
        createMinimumLaptop();
        createLaptopWithRam();
        createLaptopWithProcessor();
        createFullLaptop();
    }

    private static void createMinimumLaptop() {
        final Laptop laptop = new Laptop(20);
        System.out.println(laptop);
    }

    private static void createLaptopWithRam() {
        final Laptop laptop = new Laptop(20, null, "8 GB");
        System.out.println(laptop);
    }

    private static void createLaptopWithProcessor() {
        final Laptop laptop = new Laptop(0, "Intel core");
        System.out.println(laptop);
    }

    private static void createFullLaptop() {
        final Laptop laptop = new Laptop(20, "Intel core", "8 GB", "GeForce", "WINDOWS 10");
        System.out.println(laptop);
    }
}
