//importinng scanner class
import java.util.Scanner;
//palindrome class
class Palindrome {
  //main method
  public static void main(String[] args) {
    //Associating scanner class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the number
    int number = sc.nextInt();
    int temp = number;
    int sum = 0, rem;
    //while loop to check whether the number is a palindrome or not
    while(number > 0) {
      rem = number%10;
      sum = (sum*10) + rem;
      number = number/10;
    }
    if(temp == sum) {
      System.out.println("The given number is a palindrome");
    }
    else {
      System.out.println("The given number is not a palindrome");
    }
  }
}