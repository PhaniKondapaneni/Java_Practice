//importing scanner class
import java.util.Scanner;
//First and last dgits class
class SumFirstLastDigit {
  //main method
  public static void main(String[] agrs) {
    //Associating the Scanner Class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing variable
    int n = sc.nextInt();
    int lastDigit = n % 10;
    int firstDigit = 0;
    //while loop for the first digit in a given number
    while(n != 0) {
      firstDigit = n%10;
      n = n/10;
    }
    firstDigit += lastDigit;
    System.out.println(firstDigit);
  }
}