/**
 * Q3.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 3 Question 3
 *
 */




package Q3;


public class Q3 {
    public static void main(String[] args){
        Queue_LinkedList queue = new Queue_LinkedList();

        System.out.println("push a number 3");
        queue.enqueue(3);
        System.out.println(queue);

        System.out.println("Now pop it!");
        queue.dequeue();
        System.out.println(queue);
        System.out.println("Is empty?: "+queue.isEmpty());
        System.out.println("Size:  "+queue.size());
        System.out.println("first element:  "+queue.first());


        System.out.println("push a number 4");
        queue.enqueue(4);
        System.out.println(queue);
        System.out.println("Is empty?: "+queue.isEmpty());
        System.out.println("Size:  "+queue.size());
        System.out.println("first element:  "+queue.first());

        System.out.println("Now pop it!");
        queue.dequeue();
        System.out.println(queue);
        System.out.println("Is empty?: "+queue.isEmpty());
        System.out.println("Size:  "+queue.size());
        System.out.println("first element:  "+queue.first());
        System.out.println("push a number 5,6,7,8,9");
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println(queue);
        System.out.println("Is empty?: "+queue.isEmpty());
        System.out.println("Size:  "+queue.size());
        System.out.println("first element:  "+queue.first());
        System.out.println("Now pop it!");
        queue.dequeue();
        System.out.println(queue);


    }
}
