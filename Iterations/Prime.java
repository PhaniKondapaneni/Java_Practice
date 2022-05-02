//importing scanner class
import java.util.Scanner;
//prime class
class Prime {
  //main method
  public static void main(String[] args) {
    //Associating scanner class
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    int count = 0;

    for(int i = 1; i <= n; i++) {
      if(n%i == 0) {
        count++;
      }
    }
    if(count == 2) {
      System.out.println("The given number is prime");
    }
    else {
      System.out.println("The given number is not a prime");
    }
  }
}