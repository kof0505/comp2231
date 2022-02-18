
import java.util.Random;
/**
 * A1Driver.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 1 Quesiton 1,2,3
 * Sorting class contain shellsort, bubblesort and bubblesort2
 * A1Driver.java is a driver file contain print the output
 */

public class A1Driver {
    public static void main(String[] args) {
        Random rd_generator = new Random();
        int size_10 = 10;
        int size_20 = 20;
        int size_100 = 100;
        int size_1000 = 1000;
        int[] array_10 = new int[10];
        int[] array_20 = new int[20];
        int[] array_100 = new int[100];
        int[] array_1000 = new int[1000];


        System.out.println("This is shellsort");
        System.out.print("[");

        for(int i=0; i<size_10;i++){

            array_10[i] = rd_generator.nextInt();

            System.out.print(  " " + array_10[i] + "," );
        }
        System.out.print("]");
        System.out.println();
        Sorting.shellSort(array_10);


        System.out.print("[");
        for(int j=0; j<size_20;j++){
            array_20[j] = rd_generator.nextInt();

            System.out.print(  " " + array_20[j] + "," );
        }
        System.out.print("]");
        System.out.println();

        Sorting.shellSort(array_20);



        Comparable[] test = new Comparable[9];
        System.out.println("This is normal bubble sort that given from textbook");
        System.out.print("[");
        for(int j=0; j<9;j++){
            test[j] = rd_generator.nextInt();

            System.out.print(  " " + test[j] + "," );
        }
        System.out.print("]");
        System.out.println();
        Sorting.bubbleSort(test);

        System.out.println();

        Comparable[] test2 = new Comparable[9];
        System.out.println("This is normal bubble sort2 ");
        System.out.print("[");
        for(int j=0; j<9;j++){
            test2[j] = rd_generator.nextInt();

            System.out.print(  " " + test2[j] + "," );
        }
        System.out.print("]");
        System.out.println();
        Sorting.bubbleSort2(test2);

        /*
        Now, go back to the Sorting.java, and do the commnet out of sorting output value
         */

        System.out.println();
        System.out.println();
        System.out.println();

        //this is compare 3 different sorting with size 10
        System.out.println("Test array size 10");
        System.out.println("This is shellsort");
//        System.out.print("[");

        for(int i=0; i<size_10;i++){

            array_10[i] = rd_generator.nextInt();

//            System.out.print(  " " + array_10[i] + "," );
        }
//        System.out.print("]");
        System.out.println();
        Sorting.shellSort(array_10);


        Comparable[] test10 = new Comparable[9];
        System.out.println("This is normal bubble sort that given from textbook");
//        System.out.print("[");
        for(int j=0; j<9;j++){
            test10[j] = rd_generator.nextInt();

//            System.out.print(  " " + test10[j] + "," );
        }
//        System.out.print("]");
        System.out.println();
        Sorting.bubbleSort(test10);

        System.out.println();

        Comparable[] test20 = new Comparable[9];
        System.out.println("This is normal bubble sort2 ");
//        System.out.print("[");
        for(int j=0; j<9;j++){
            test20[j] = rd_generator.nextInt();

//            System.out.print(  " " + test20[j] + "," );
        }
//        System.out.print("]");
        System.out.println();
        Sorting.bubbleSort2(test20);

        //this is compare 3 different sorting with size 100

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("test array size 100");


        System.out.println("This is shellsort");
//        System.out.print("[");

        for(int i=0; i<size_100;i++){

            array_100[i] = rd_generator.nextInt();

//            System.out.print(  " " + array_100[i] + "," );
        }
//        System.out.print("]");
        System.out.println();
        Sorting.shellSort(array_100);


        Comparable[] test100 = new Comparable[99];
        System.out.println("This is normal bubble sort that given from textbook");
//        System.out.print("[");
        for(int j=0; j<99;j++){
            test100[j] = rd_generator.nextInt();

//            System.out.print(  " " + test100[j] + "," );
        }
//        System.out.print("]");
        System.out.println();
        Sorting.bubbleSort(test100);

        System.out.println();

        Comparable[] test200 = new Comparable[99];
        System.out.println("This is normal bubble sort2 ");
//        System.out.print("[");
        for(int j=0; j<99;j++){
            test200[j] = rd_generator.nextInt();

//            System.out.print(  " " + test200[j] + "," );
        }
//        System.out.print("]");
        System.out.println();
        Sorting.bubbleSort2(test200);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("test array size 100");


        System.out.println("This is shellsort");
//        System.out.print("[");

        for(int i=0; i<size_1000;i++){

            array_1000[i] = rd_generator.nextInt();

//            System.out.print(  " " + array_100[i] + "," );
        }
//        System.out.print("]");
        System.out.println();
        Sorting.shellSort(array_1000);


        Comparable[] test1000 = new Comparable[999];
        System.out.println("This is normal bubble sort that given from textbook");
//        System.out.print("[");
        for(int j=0; j<999;j++){
            test1000[j] = rd_generator.nextInt();

//            System.out.print(  " " + test1000[j] + "," );
        }
//        System.out.print("]");
        System.out.println();
        Sorting.bubbleSort(test1000);

        System.out.println();

        Comparable[] test2000 = new Comparable[999];
        System.out.println("This is normal bubble sort2 ");
//        System.out.print("[");
        for(int j=0; j<999;j++){
            test2000[j] = rd_generator.nextInt();

//            System.out.print(  " " + test2000[j] + "," );
        }
//        System.out.print("]");
        System.out.println();
        Sorting.bubbleSort2(test2000);
    }
}
