/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.idioms.telescoping.model;


/**
 * @author Veljko
 */
public class Laptop {

    private final String graphicCard;
    private final String ram;
    private final String os;
    private final String processor;
    private final double screenDiagonal;

    public Laptop(final double screenDiagonal) {
        this(screenDiagonal, null);
    }

    public Laptop(final double screenDiagonal, final String processor) {
        this(screenDiagonal, processor, null);
    }

    public Laptop(final double screenDiagonal, final String processor, final String ram) {
        this(screenDiagonal, processor, ram, null);
    }

    public Laptop(final double screenDiagonal, final String processor, final String ram, final String graphicCard) {
        this(screenDiagonal, processor, ram, graphicCard, null);
    }

    public Laptop(final double screenDiagonal, final String processor, final String ram, final String graphicCard, final String os) {
        this.graphicCard = graphicCard;
        this.ram = ram;
        this.os = os;
        this.processor = processor;
        this.screenDiagonal = screenDiagonal;
    }


    @Override
    public String toString() {
        return "Laptop: {" + "graphicCard=" + graphicCard + ", ram=" + ram + ", OS=" + os + ", processor=" + processor + ", screenDiagonal=" + screenDiagonal + '}';
    }

}
