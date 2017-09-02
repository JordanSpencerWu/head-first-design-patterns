package design.pattern.decorator;

/**
 * Created by Jordan on 9/2/2017.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
