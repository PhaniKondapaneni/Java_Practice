//importing scanner class
import java.util.Scanner;
//Reverse class
class ReverseOfNum {
  //main method
  
  public static void main(String[] args) {
    //associating scanner class
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
    int num = sc.nextInt();
    int sum = 0;
    //while loop for reverse of a number
    while(num > 0) {
      int rem = num%10;
      sum = (sum*10) + rem;
      num /= 10;
    }
    System.out.println(sum);
  }
}