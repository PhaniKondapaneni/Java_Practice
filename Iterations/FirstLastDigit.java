//importing the Scanner class
import java.util.Scanner;
//Positive class
class FirstLastDigit {
  //main method
  public static void main(String[] args) {
    //Associating Scanner class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variables
    int n = sc.nextInt();
    int lastDigit = n%10;
    int firstDigit = 0;
    while(n != 0) {
      firstDigit = n % 10;
      n /= 10;
    }
    System.out.println(firstDigit);
    System.out.println(lastDigit);
  }
}