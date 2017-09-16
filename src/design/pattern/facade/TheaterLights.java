package design.pattern.facade;

/**
 * Created by Jordan on 9/16/2017.
 */
public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void dim(int level) {
        System.out.println(description + " dimming to " + level  + "%");
    }

    public String toString() {
        return description;
    }
}