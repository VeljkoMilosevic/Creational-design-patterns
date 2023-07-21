/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.builder.model;

/**
 * @author Veljko
 */
public class LaptopBuilder {

    private String graphicCard;
    private String ram;
    private String os;
    private String processor;
    private double screenDiagonal;

    public LaptopBuilder buildGraphicCard(final String graphicCard) {
        this.graphicCard = graphicCard;
        return this;
    }

    public LaptopBuilder buildRam(final String ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder buildOs(final String os) {
        this.os = os;
        return this;
    }

    public LaptopBuilder buildProcessor(final String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder buildScreenDiagonal(final double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
        return this;
    }

    public Laptop buildLaptop() {
        return new Laptop(this.graphicCard, this.ram, this.os, this.processor, this.screenDiagonal);
    }

}
