//importing scanner class
import java.util.Scanner;
//Frequency class
class FrequencyDigit {
  //main method
  public static void main(String[] args) {
    //associating scanner class
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    //declaring and initializing the number
    int num = sc.nextInt();
    int temp, digit, count;
    for(int i = 0; i <=9 ; i++) {
      count = 0;
      temp = num;
      while(temp > 0) {
        digit = temp%10;
        if(digit == i) {
          count++;
        }
        temp /= 10;
      }
      if(count > 0) {
        System.out.println(i+" :- "+count);
      }
    }
  }
}