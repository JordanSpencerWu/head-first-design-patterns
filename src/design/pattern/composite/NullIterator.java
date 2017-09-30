package design.pattern.composite;

import java.util.Iterator;

/**
 * Created by Jordan on 9/30/2017.
 */
public class NullIterator implements Iterator<MenuComponent> {

    public MenuComponent next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}