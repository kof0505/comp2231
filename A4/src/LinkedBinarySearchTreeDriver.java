/**
 * LinkedBinarySearchTreeDriver.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 4 Question 2
 *
 */
import jsjf.LinkedBinarySearchTree;


public class LinkedBinarySearchTreeDriver extends LinkedBinarySearchTree {
    public static void main(String[] args){
        System.out.println("First, Testing the edgecase of LinkedBinarySearchTree");
        LinkedBinarySearchTree tree = new LinkedBinarySearchTree();

        tree.addElement(1);
        tree.addElement(12);
        tree.addElement(3);
        tree.addElement(4);
        tree.addElement(5);
        tree.addElement(9);
        tree.addElement(7);
        tree.addElement(8);
        tree.addElement(6);
        tree.addElement(10);
        tree.addElement(11);
        tree.addElement(2);
        tree.addElement(0);
        System.out.println(tree);
        System.out.println("Find Max");
        System.out.println(tree.findMax());
        System.out.println("Find Min");
        System.out.println(tree.findMin());
        System.out.println("Remove Max");
        System.out.println(tree.removeMax());
        System.out.println("Get Left");
        System.out.println(tree.getLeft());
        System.out.println("Get Right");
        System.out.println(tree.getRight());
        System.out.println("Is array contain 9?");
        System.out.println(tree.contains(9));

        System.out.println("Remove the element 4");
        System.out.println(tree.removeElement(4));
        System.out.println(tree);


        System.out.println("Now create degenerateTree");

        System.out.println("This is first degenerateTree");


        LinkedBinarySearchTree degenerateTree1 = new LinkedBinarySearchTree();
        degenerateTree1.addElement(1);
        degenerateTree1.addElement(12);
        degenerateTree1.addElement(3);
        degenerateTree1.addElement(4);
        degenerateTree1.addElement(5);
        degenerateTree1.addElement(9);
        degenerateTree1.addElement(7);
        degenerateTree1.addElement(8);


        degenerateTree1.iteratorInOrder();

        System.out.println("hight is ");

        System.out.println(degenerateTree1.getHeight());


        System.out.println("This is second degenerateTree");

        LinkedBinarySearchTree degenerateTree2 = new LinkedBinarySearchTree();

        degenerateTree2.addElement(100);
        degenerateTree2.addElement(1200);
        degenerateTree2.addElement(300);
        degenerateTree2.addElement(400);
        degenerateTree2.addElement(500);
        degenerateTree2.addElement(900);

        System.out.println(degenerateTree2);

        System.out.println("hight is ");

        System.out.println(degenerateTree2.getHeight());

        System.out.println("Now, let's balance the first trees");
        degenerateTree1.ConvertType();
        System.out.println("Now, let's balance the second sample the trees");
        System.out.println("degenerateTree2's balanced height :");
        degenerateTree2.ConvertType();

    }
}
