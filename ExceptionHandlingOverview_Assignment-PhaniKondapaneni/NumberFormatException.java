/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
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
    NumberFormatException n=new NumberFormatException();
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