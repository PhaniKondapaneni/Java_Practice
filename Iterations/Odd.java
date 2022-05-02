//importing the Scanner class
import java.util.Scanner;
//Positive class
class Odd {
  //main method
  public static void main(String[] args) {
    //Associating Scanner class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variables
    int n = sc.nextInt();
    int i = 1;
    while(i <= n) {
      if(i % 2 != 0)
        System.out.println(i);
      i++;
    }
  }
}