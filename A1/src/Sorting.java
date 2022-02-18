import java.util.*;

/**
 * Sorting.java
 *
 * Min Gu Kim  t00668295
 * COMP 2231 Assignment 1 Quesiton 1,2,3
 * Sorting class contain shellsort, bubblesort and bubblesort2
 */



public class Sorting {

    static void shellSort(int num[]) {

        //implement the shellsort program

        //initialize the time
        long startTime = System.currentTimeMillis();

        int gap = num.length/2;
        int size = num.length;
        int i;
        int j = 0;
        //int k record the number of swap occur
        int k = 1;
        int number_of_compare = 1;
        boolean swapflag;
        do{


            do{
                swapflag = false;
                for(int s=0; s < size - gap; s++){
                    number_of_compare++;

                    if(num[s] > num[s+gap]){
                        i = num[s];
                        num[s]=num[s+gap];
                        num[s+gap] = i;
                        swapflag = true;
                        k++;

                        //end-if
                    }
                    /*
                    comment out while loop for q3.
                     */
//                    while(j < num.length){
//
//                        System.out.print(num[j]);
//                        System.out.print(" ");
//                        j += 1;
//
//                    }
//                    System.out.println();


                    j=0;
                    //end-for
                }

            }
            while(swapflag == true);


            gap = gap/2;
        }
        while(gap > 0);
        long stopTime = System.currentTimeMillis();
        System.out.println("number of comparison occur is "+number_of_compare);
        System.out.println("number of swap occur is " + k);
        System.out.println("The time is " +  stopTime + "ns");

    }

    public static <T extends Comparable<T>>
    void bubbleSort(Comparable<Object>[] data)
    {

        //implement the bubblesort program

        //initialize the time
        long startTime = System.currentTimeMillis();
        int position, scan,j = 0, count=0;
        T temp;
        //int k record the number of swap occur
        int k = 1;
        int number_of_compare = 1;
        int test = data.length;
        Comparable<Object>[] array = Arrays.copyOf(data,test);

        for (position =  test - 1; position >= 0; position--)
        {
            for (scan = 0; scan <= position - 1; scan++)
            {
                number_of_compare++;
                if (data[scan].compareTo(data[scan+1]) >= 0) {
                    swap(data, scan, scan + 1);
                    k++;
                }
            }
            /*
                    comment out while loop for q3.
                     */
//            toStrting(test,data);

        }
        long stopTime = System.currentTimeMillis();
        System.out.println("number of comparison occur is "+number_of_compare);
        System.out.println("number of swap occur is " + k);
        System.out.println("The time is " +  stopTime + "ns");
    }

    public static <T extends Comparable<T>>
    void bubbleSort2(Comparable<Object>[] data)
    {
        //implement the bubblesort2 program

        //initialize the time
        long startTime = System.currentTimeMillis();
        int position, scan,j = 0, count=0;
        T temp;
        int test = data.length;
        int number_of_compare = 1;
        //int k record the number of swap occur
        int k = 1;

        Comparable<Object>[] array1 = Arrays.copyOf(data,test);


        boolean swapflag = false;
        while(!swapflag){
            swapflag = true;
            /*
                    comment out while loop for q3.
                     */
//            toStrting(test, array1);

            for (scan = 0; scan < test - 1; scan++) {
                number_of_compare++;
                if (array1[scan].compareTo(array1[scan + 1]) > 0) {
                    swap(array1, scan,scan + 1);
                    swapflag = false;
                    k++;
                }
            }

        }
        long stopTime = System.currentTimeMillis();
        System.out.println("number of comparison occur is "+number_of_compare);
        System.out.println("number of swap occur is " + k);
        System.out.println("The time is " +  stopTime + "ns");

    }




    public static void toStrting(int test, Comparable<Object>[] data) {
        //toString method to print
        int j =0;
        while(j < test){
            System.out.print(data[j]);
            System.out.print(" ");
            j += 1;
        }
        System.out.println();
        j=0;

    }




    private static <T extends Comparable<T>>
    void swap(Comparable<Object>[] data, int index1, int index2)
    {
        //swap method
        Comparable<Object> temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

}