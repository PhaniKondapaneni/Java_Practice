//importing the Scanner class
import java.util.Scanner;
//Positive class
class Multiplication {
  //main method
  public static void main(String[] args) {
    //Associating Scanner class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variables
    int n = sc.nextInt();
    for(int i = 1; i <= 10; i++) {
      System.out.println(n+" * "+i+" = "+(n*i));
    }
  }
}