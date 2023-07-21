/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.idioms.javabeans.model;


/**
 * @author Veljko
 */
public class Laptop {

    private String graphicCard;
    private String ram;
    private String os;
    private String processor;
    private double screenDiagonal;

    public void setGraphicCard(final String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setRam(final String ram) {
        this.ram = ram;
    }

    public void setOs(final String os) {
        this.os = os;
    }

    public void setProcessor(final String processor) {
        this.processor = processor;
    }

    public void setScreenDiagonal(final double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }


    @Override
    public String toString() {
        return "Laptop: {" + "graphicCard=" + graphicCard + ", ram=" + ram + ", OS=" + os + ", processor=" + processor + ", screenDiagonal=" + screenDiagonal + '}';
    }

}
