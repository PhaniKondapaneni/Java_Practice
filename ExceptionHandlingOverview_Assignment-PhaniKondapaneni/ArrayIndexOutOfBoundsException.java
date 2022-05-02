/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException.
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console.
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
//importing Scanner class
import java.util.Scanner;
//creating a class
public class ArrayIndexOutOfBoundsException {
    //main method
    public static void main(String args[]) {
      int i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter Array elements");
      for(i=0;i<n;i++)
        {
          a[n]=sc.nextInt();
          System.out.println(a[i]);
        }

    }
}