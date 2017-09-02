package design.pattern.decorator;

/**
 * Created by Jordan on 9/2/2017.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
