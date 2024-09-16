package org.learn.laptop;

import org.learn.laptop.composition.Processor;
import org.learn.laptop.composition.GraphicsCard;

public class Laptop {

    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String opticalDrive;
    private String Keyboard;

    public Laptop() {
        this.screen = 15.4f;
        this.processor = new Processor();
        this.ram = "16GB";
        this.hardDrive = "560GB";
        this.graphicsCard = new GraphicsCard();
        this.opticalDrive = "Multi layer";
        Keyboard = "Backlit";
    }

    public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard, String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        Keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", Keyboard='" + Keyboard + '\'' +
                '}';
    }
}
