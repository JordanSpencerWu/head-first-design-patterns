package design.pattern.decorator;

/**
 * Created by Jordan on 9/2/2017.
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
