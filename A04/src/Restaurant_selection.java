/**
 * Restaurant_selection.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 4 Question 1
 *
 */
import java.io.*;


/**
 * Restaurant_selection demonstrates the use of a binary decision tree to
 * select the place to eat
 */
public class Restaurant_selection
{
    /**
     *  Asks questions of the user to select the place to eat
     */
    public static void main (String[] args) throws FileNotFoundException
    {
        System.out.println ("I want to choose nice restaurant to visit");

        DecisionTree expert = new DecisionTree("src/Restaurant_selection.txt");
        expert.evaluate();
    }
}