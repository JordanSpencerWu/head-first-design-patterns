package design.pattern.strategy;

/**
 * Created by Jordan on 7/1/2017.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
