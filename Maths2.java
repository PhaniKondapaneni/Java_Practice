//Import Scanner Class
import java.util.Scanner;

//Maximum class
class Maths2{

  //main method
public static void main(String args[]){
  //Assosiating scanner class
  Scanner sc = new Scanner(System.in);
  //Declaring and Intializing the variables
  int a = sc.nextInt();
  int b = sc.nextInt();

  //printing the maximum value
  if(a>b)
    System.out.println(a+" is greater");
  else
    System.out.println(b+" is greater");
 }
}