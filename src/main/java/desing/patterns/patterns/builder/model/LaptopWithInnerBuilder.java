/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.builder.model;

/**
 * @author Veljko
 */
public class LaptopWithInnerBuilder {

    private String graphicCard;
    private String ram;
    private String os;
    private String processor;
    private double screenDiagonal;

    private LaptopWithInnerBuilder(final LaptopBuilder laptopBuilder) {
        this.graphicCard = laptopBuilder.graphicCard;
        this.ram = laptopBuilder.ram;
        this.os = laptopBuilder.os;
        this.processor = laptopBuilder.processor;
        this.screenDiagonal = laptopBuilder.screenDiagonal;
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

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(final double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return "LaptopWithInnerBuilder{" + "graphicCard=" + graphicCard + ", ram=" + ram + ", OS=" + os + ", processor=" + processor + ", screenDiagonal=" + screenDiagonal + '}';
    }

    public static class LaptopBuilder {

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

        public LaptopWithInnerBuilder buildLaptop() {
            return new LaptopWithInnerBuilder(this);
        }
    }
}
