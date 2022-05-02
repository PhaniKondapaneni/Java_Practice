/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.*;
public class ArraySum {
    //main method
    public static void main(String[] args) {
        //prompting user to give the input from the console
        Scanner sc = new Scanner(System.in);
        //Declare the variables and initialize
        int arr[] = new int[10];
        int sum = 0;
        System.out.println("Enter the 10 Elements : ");
        //Take input from user
        for(int i = 0; i < arr.length; i++) {
            //initializing array
            arr[i] = sc.nextInt();
        }
        for(int var : arr) {
            //Check user input values using for loop and add all values
            sum += var;
        }
        //Print the result
        System.out.print("Sum of array elements : "+sum);
    }
}