//importing the scanner class
import java.util.Scanner;
//Factorial class
class Factors {
  //maqin method
  public static void main(String[] args) {
    //associating the Scanner Class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variables
    int n = sc.nextInt();
    //for loop for the factorial of a number
    for(int i = 1; i <= n; i++) {
      //checking whether the number has factors or not
      if(n%i == 0) {
        //printing the factors of a number
        System.out.println(i);
      }
    }
  }
}