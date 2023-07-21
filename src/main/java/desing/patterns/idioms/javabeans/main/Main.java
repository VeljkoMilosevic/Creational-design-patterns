/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.idioms.javabeans.main;

import desing.patterns.idioms.javabeans.model.Laptop;

/**
 * @author Veljko
 */
public class Main {
    public static void main(final String[] args) {
        final Laptop laptop = new Laptop();
        laptop.setRam("16 GB");
        laptop.setOs("WINDOWS 10");
        laptop.setProcessor("Intel Core");
        laptop.setGraphicCard("GeForce");
        laptop.setScreenDiagonal(15);
        System.out.println(laptop);
    }
}
