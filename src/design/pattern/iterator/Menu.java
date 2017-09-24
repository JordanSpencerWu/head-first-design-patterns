package design.pattern.iterator;

import java.util.Iterator;

/**
 * Created by Jordan on 9/24/2017.
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}