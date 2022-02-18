/**
 * Q2.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 3 Question 2
 *
 */



package Q2;



public class Q2 {
    public static void main(String[] args){
        Stack_ArrayList stack = new Stack_ArrayList();

        System.out.println("push a number 3");
        stack.push(3);
        System.out.println(stack);
        System.out.println("push a number 3");
        stack.push(4);
        System.out.println(stack);
        System.out.println("Peek:  "+stack.peek());
        System.out.println("Is empty?: "+stack.isEmpty());
        System.out.println("Size:  "+stack.size());

        System.out.println("Now pop it!");
        stack.pop();
        System.out.println(stack);
        System.out.println("Peek:  "+stack.peek());
        System.out.println("Is empty?: "+stack.isEmpty());
        System.out.println("Size:  "+stack.size());


        System.out.println("Push many number!");
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack);
        System.out.println("Peek:  "+stack.peek());
        System.out.println("Is empty?: "+stack.isEmpty());
        System.out.println("Size:  "+stack.size());

        System.out.println("Now pop it!");
        stack.pop();
        System.out.println(stack);
        System.out.println("Peek:  "+stack.peek());
        System.out.println("Is empty?: "+stack.isEmpty());
        System.out.println("Size:  "+stack.size());

    }


}
