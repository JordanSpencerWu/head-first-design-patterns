package design.pattern.state;

/**
 * Created by Jordan on 9/30/2017.
 */
public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    public void refill();
}