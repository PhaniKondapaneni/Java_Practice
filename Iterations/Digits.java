//importing the Scanner class
import java.util.Scanner;
//Positive class
class Digits {
  //main method
  public static void main(String[] args) {
    //Associating Scanner class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variables
    int n = sc.nextInt();
    int count = 0;
    while(n != 0) {
      n /= 10;
      count ++;
    }
    System.out.println(count);
  }
}