//Import Scanner Class
import java.util.Scanner;

//Maximum class
class NaturalNumbers{

  //main method
public static void main(String args[]){
  //Assosiating scanner class
  Scanner sc = new Scanner(System.in);
  //Declaring and Intializing the variables
  int n=sc.nextInt();
  for(int i = 1; i<=n;i++){
   System.out.println(i); 
  }
 }
}