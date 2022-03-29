/**
 * Queue_ArrayList.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 3 Question 4
 *
 */




package Q4;
import java.util.ArrayList;



public class Queue_ArrayList<T> implements QueueADT<T>{
    private ArrayList<T> queue;
    int count=0;
    //initialize the queue

    public Queue_ArrayList() {

        queue= new ArrayList<T>();

    }
    //add element

    @Override
    public void enqueue(T element) {
        queue.add(0,element);
        count++;

    }
    //remove element

    @Override
    public T dequeue() {
        count--;
        return queue.remove(0);
    }
//access first element

    @Override
    public T first() {
        return queue.get(0);
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
        return "Queue_ArrayList{" +
                "queue=" + queue +
                ", count=" + count +
                '}';
    }
}
