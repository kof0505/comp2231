/**
 * Queue_LinkedList.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 3 Question 3
 *
 */


package Q3;
import java.util.LinkedList;

public class Queue_LinkedList<T> implements QueueADT<T> {

    private LinkedList<T> queue;
    int count;
    //initialize the queue

    public Queue_LinkedList() {

        queue= new LinkedList<T>();

    }
    //add element
    @Override
    public void enqueue(T element) {
        queue.push(element);
        count++;

    }
    //remove element

    @Override
    public T dequeue() {
        count--;
        return queue.pop();
    }
//access first element
    @Override
    public T first() {
        return queue.get(0);
    }
//check if it is empty
    @Override
    public boolean isEmpty() {
        return count ==0;
    }
//size
    @Override
    public int size() {
        return count;
    }
//string
    @Override
    public String toString() {
        return "Queue_LinkedList{" +
                "queue=" + queue +
                ", count=" + count +
                '}';
    }
}
