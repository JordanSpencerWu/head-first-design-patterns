package design.pattern.decorator;

/**
 * Created by Jordan on 9/2/2017.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
