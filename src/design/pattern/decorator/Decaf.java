package design.pattern.decorator;

/**
 * Created by Jordan on 9/2/2017.
 */
public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
