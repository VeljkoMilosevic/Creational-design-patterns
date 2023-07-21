/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.builder.main;


import desing.patterns.patterns.builder.model.Laptop;
import desing.patterns.patterns.builder.model.LaptopBuilder;
import desing.patterns.patterns.builder.model.LaptopWithInnerBuilder;

/**
 * @author Veljko
 */
public class Main {

    public static void main(final String[] args) {
        createLaptopOutsideBuilder();
        createLaptopInnerBuilder();
    }

    private static void createLaptopOutsideBuilder() {
        final Laptop laptop = new LaptopBuilder()
                .buildScreenDiagonal(15)
                .buildProcessor("Intel Core i7-13700K")
                .buildGraphicCard("AM")
                .buildOs("WINDOWS 10")
                .buildRam("8 GB")
                .buildLaptop();
        System.out.println(laptop);
    }

    private static void createLaptopInnerBuilder() {
        final LaptopWithInnerBuilder laptop = new LaptopWithInnerBuilder.LaptopBuilder()
                .buildScreenDiagonal(15)
                .buildProcessor("Intel Core i7-13700K")
                .buildGraphicCard("AM")
                .buildOs("WINDOWS 10")
                .buildRam("8 GB")
                .buildLaptop();
        System.out.println(laptop);
    }
}
