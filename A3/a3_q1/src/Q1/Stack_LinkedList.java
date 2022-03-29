/**
 * Stack_LinkedList.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 3 Question 1
 *
 */


package Q1;

import java.util.LinkedList;


public class Stack_LinkedList<T> implements StackADT<T> {

    private LinkedList<T> stack;
    private int count=0;
//initialize the stack
    public Stack_LinkedList(){
        stack = new LinkedList<T>();
    }

//add element
    @Override
    public void push(Object element) {

        stack.add(0, (T) element);
        count++;
    }
//remove element
    @Override
    public void pop() throws EmptyCollectionException {

        if (isEmpty())
            throw new EmptyCollectionException("stack");
        stack.pop();
        count--;
    }
//access top of stack
    @Override
    public T peek() throws EmptyCollectionException{

        return stack.peek();
    }
//check if it is empty
    @Override
    public boolean isEmpty() {
        return (stack.size() == 0);
    }
//size
    @Override
    public int size() {
        return stack.size();
    }
//string
    @Override
    public String toString() {
        return "Stack_LinkedList{" +
                "stack=" + stack +
                ", count=" + count +
                '}';
    }
}
