package design.pattern.strategy;

/**
 * Created by Jordan on 7/1/2017.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
