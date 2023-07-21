/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.builder.model;

/**
 * @author Veljko
 */
public class Laptop {

    private String graphicCard;
    private String ram;
    private String os;
    private String processor;
    private double screenDiagonal;

    public Laptop(final String graphicCard, final String ram, final String os, final String processor, final double screenDiagonal) {
        this.graphicCard = graphicCard;
        this.ram = ram;
        this.os = os;
        this.processor = processor;
        this.screenDiagonal = screenDiagonal;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(final double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(final String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(final String ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(final String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(final String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop {" + "graphicCard=" + graphicCard + ", ram=" + ram + ", OS=" + os + ", processor=" + processor + ", screenDiagonal=" + screenDiagonal + '}';
    }


}
