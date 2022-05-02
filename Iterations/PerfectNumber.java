//importing scanner class
import java.util.Scanner;
//Perfect class
class PerfectNumber {
  //main method
  public static void main(String[] args) {
    //Associating the scanner class
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= n/2; i++) {
      if(n%i == 0) {
        sum += i;
      }
    }
    if(n == sum) {
      System.out.println("Number is perfect");
    }
    else {
      System.out.println("Number is not perfect");
    }
  }
}