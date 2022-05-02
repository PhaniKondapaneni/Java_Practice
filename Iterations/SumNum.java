//importing the Scanner class
import java.util.Scanner;
//Positive class
class SumNum {
  //main method
  public static void main(String[] args) {
    //Associating Scanner class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variables
    int n = sc.nextInt();
    int i = 1;
    int sum = 0;
    while(i <= n) {
        sum += i;
    i++;
    }
    System.out.println(sum);
  }
}