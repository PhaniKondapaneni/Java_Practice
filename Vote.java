//Import Scanner Class
import java.util.Scanner;

//Maximum class
class Vote{

  //main method
public static void main(String args[]){
  //Assosiating scanner class
  Scanner sc = new Scanner(System.in);
  //initializing variable age
  int age=sc.nextInt();
  //checking wheather the person is eligible or not
  if(age<=0)
    System.out.println("Age of a person shouldn't be zero or negative");
 else if(age >= 18)
   System.out.println("The person is eligible for vote");
  else if(age<18)
    System.out.println("The person is Minor");
      else
    System.out.println("Enter the valid age");
 }
}