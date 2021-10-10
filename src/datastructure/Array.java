package datastructure;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //data - non-primitive
        //declare and initialize array = inline
        int myNumbers[] = {5, 3, 8, 6, 6, 8};
        System.out.println(myNumbers);
        //for loop
        for (int i = 0; i < 6; i++) {
            System.out.println(myNumbers[i]);
        }
        System.out.println("-------------------------------------------");
        // declare array of 5 number (size of the array)
        int[] myNumbers2 = new int[5];

        // assign array values
        myNumbers2[0] = 2;
        myNumbers2[1] = 6;
        myNumbers2[2] = 4;
        myNumbers2[3] = 1;
        myNumbers2[4] = 2;
        //System.out.println(myNumbers2[2]);

        // for loop
        for (int i = 0; i < myNumbers2.length; i++) {
            System.out.println(myNumbers2[i]);
        }
        System.out.println("----------------------------------------------------");


        int list[] = new int[5];
        System.out.println("please enter some number");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();

        }
        System.out.println("---------------------------------");

        int list1[] = new int[10];
        System.out.println("please enter some number");
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(10);
            System.out.println((list1[i]));

        }
    }
}