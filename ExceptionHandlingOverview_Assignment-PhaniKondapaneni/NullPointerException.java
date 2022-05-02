/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
import java.util.*;
//create class NumberFormatException//
class NumberFormatException 
{ 
//initializing variables//
//method test is created//
  int test(int a,int b)
  {
     return (a+b);
  }
//main method//
public static void main(String args[])
  {
//input from user//
    Scanner sc=new Scanner(System.in);
//object created//
    NumberFormatException n=new NumberFormatException ();
    System.out.println("enter a value");
//reading values //
    String y=sc.next();
    System.out.println("enter b value");
    String z=sc.next();
//converting into numericals where NumberFormatException may occur//
    int c=Integer.parseInt(z);
    int m=Integer.parseInt(y);
//printing output//
    System.out.println("addition is:"+n.test(c,m));
  }
    
}