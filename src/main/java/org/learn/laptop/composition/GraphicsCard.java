package org.learn.laptop.composition;

public class GraphicsCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicsCard() {
        this.brand = "Nvida";
        this.series = 2050;
        this.memory = "4GB";
    }

    public GraphicsCard(String brand, int series, String memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory='" + memory + '\'' +
                '}';
    }
}
