package jsjf;

import java.util.Iterator;
import jsjf.exceptions.*;
/**
 * ListADT defines the interface to a general list collection. Specific
 * types of lists will extend this interface to complete the
 * set of necessary operations.
 *
 * @author Java Foundations
 * @version 4.0
 */
public interface ListADT<T> extends Iterable<T> {
    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     */
    T removeFirst();


    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this list.
     *
     * @return the integer representation of number of elements in this list
     */
    int size();

    /**
     * Returns an iterator for the elements in this list.
     *
     * @return an iterator over the elements in this list
     */
    Iterator<T> iterator();

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of this list
     */
    String toString();
}