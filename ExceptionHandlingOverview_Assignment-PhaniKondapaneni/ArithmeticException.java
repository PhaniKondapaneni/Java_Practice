/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers.
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
//declare main class
public class ArithmeticException
  {
    //intializing any variable
    int x;
    //creating a parameterized method
    ArithmeticException(int y,int z)
    {
      //division of two numbers
      x=y/z;
    }
    //main method
    public static void main(String args[]){
      //calling method
      ArithmeticException Ae=new ArithmeticException(10,0);
      //ArithematicException will occur
      //printing output
      System.out.println(Ae.x);
    }
  }