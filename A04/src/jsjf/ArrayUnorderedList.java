/**
 * ArrayUnorderedList.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 4 Question 1
 *
 */


package jsjf;


import java.util.Arrays;
import jsjf.exceptions.*;
/**
 * ArrayUnorderedList represents an array implementation of an unordered list.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class ArrayUnorderedList<T> extends ArrayList<T>
        implements ListADT<T> {
    int i = 0;

    public ArrayUnorderedList() {
        super();
    }


    public ArrayUnorderedList(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void addToFront(T element) {
        int curr = rear;

        if(list.length == size()){
            expandCapacity();
        }
        while(0<curr){
            list[curr] = list[curr-1];
            curr--;
        }
        list[0]=element;
        modCount++;
    }

    @Override
    public void addToRear(T element) {
        int curr = 0;

        if (list.length == size())
            expandCapacity();

        while(curr < size()){

            curr++;
        }
        list[curr] = element;
        rear++;
        modCount++;

    }
    /**
     * addAfter(T element, T target)
     *
     * @author Java Foundations
     * @version 4.0
     */

    @Override
    public void addAfter(T element, T target) {

        /**
         * Adds the specified element after the specified target element.
         * Throws an ElementNotFoundException if the target is not found.
         *
         * @param element the element to be added after the target element
         * @param target  the target that the element is to be added after
         */
        if (size() == list.length)
            expandCapacity();

        int scan = 0;

        // find the insertion point
        while (scan < rear && !target.equals(list[scan]))
            scan++;

        if (scan == rear)
            throw new ElementNotFoundException("UnorderedList");

        scan++;

        // shift elements up one
        for (int shift=rear; shift > scan; shift--)
            list[shift] = list[shift-1];

        // insert element
        list[scan] = element;
        rear++;
        modCount++;

    }


    public void expandCapacity() {
        list = Arrays.copyOf(list, list.length * 2);
    }
}