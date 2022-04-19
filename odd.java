//Import Scanner Class
import java.util.Scanner;

//Maximum class
class Odd {

  //main method
public static void main(String args[]){
  //Assosiating scanner class
  Scanner sc = new Scanner(System.in);
  //Declaring and Intializing the variables
  int n = sc.nextInt();
  int i = 1;
  while(i<=n){
    if(i%2!=0)
   System.out.println(i);
  i++;
  }
 }
}