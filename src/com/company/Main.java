/*Beginner-friendly Simple Array Code Sample
*The code below outputs each index number from an array based on the user's input.
* Run the code to see what it does.*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int length = 0;
	    String thisString = " ";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of your array: ");
        length = scan.nextInt();
        scan.nextLine(); //Used to read the next line; exits out of the nextInt() method.

        int[] intArray = new int[length];

        for(int x = 0; x < intArray.length; x++){
            thisString = "Index Number: " + x;
            System.out.println(thisString);
        }
    }
}
