//importing the Scanner class
import java.util.Scanner;
//Positive class
class SumDigits {
  //main method
  public static void main(String[] args) {
    //Associating Scanner class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variables
    int n = sc.nextInt();
    int sum = 0;
    while(n != 0) {
      sum += n%10;;
      n /= 10;
    }
    System.out.println(sum);
  }
}