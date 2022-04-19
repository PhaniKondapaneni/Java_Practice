//Import Scanner Class
import java.util.Scanner;

//Maximum class
class Alphabet{

  //main method
public static void main(String args[]){
  //Assosiating scanner class
  Scanner sc = new Scanner(System.in);
  //Declaring and Intializing the variables
char a =sc.next().charAt(0);
  char ch = a;
  while(ch<='Z'){
    System.out.println(ch);
    ch++;
    }
 }
}