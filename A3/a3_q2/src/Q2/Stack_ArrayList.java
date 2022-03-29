/**
 * Stack_ArrayList.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 3 Question 2
 *
 */


package Q2;

import java.util.ArrayList;

public class Stack_ArrayList<T> implements StackADT<T>
{
    private ArrayList<T> stack;
    int count;
    //initialize the stack
    public Stack_ArrayList()
    {
        stack = new ArrayList<T>();
        count=0;
    }

    //add element
    @Override
    public void push(T element) {
        stack.add(0,element);
        count++;

    }
    //remove element
    @Override
    public T pop() throws EmptyCollectionException{

        if (isEmpty())
            throw new EmptyCollectionException("stack");
        count--;

        return stack.remove(0);
    }
    //access top of stack
    @Override
    public T peek() {
        if(stack.isEmpty())
            throw new EmptyCollectionException("stack");

        return stack.get(0);



    }
    //check if it is empty
    @Override
    public boolean isEmpty() {
        return count==0;
    }
    //size
    @Override
    public int size() {
        return count;
    }
    //string
    @Override
    public String toString() {
        return "Stack_ArrayList{" +
                "stack=" + stack +
                ", count=" + count +
                '}';
    }
}