
//Import Scanner Class
import java.util.Scanner;

//Maximum class
class Maths{

  //main method
public static void main(String args[]){
  //Assosiating scanner class
  Scanner sc = new Scanner(System.in);
  //Declaring and Intializing the variables
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();

  //printing the maximum value
  if(a>b && a>c)
    System.out.println(a+" is greater");
  else if(b>a && b>c)
    System.out.println(b+" is greater");
  else
    System.out.println(c+" is greater");
 }
}