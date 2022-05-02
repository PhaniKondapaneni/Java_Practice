import java.util.Scanner;
 abstract class Bank
  {
    long Accountnum;
    long Pannum;
    //abstract method
   abstract void rate_of_interest();
    //non abstract method
    void display()
    {
      System.out.println(Accountnum+" "+Pannum);
    }
  }
class SBI_Bank extends Bank
  {
  public void rate_of_interest()
    {
      System.out.println("SBI rate of interest is 8%");
    }
  }
class Axis_Bank extends Bank
  {
  public void rate_of_interest()
    {
      System.out.println("Axis rate of interest is 7%");
    }
  }
class Abstraction
  {
    public static void main (String args[])
    {
      Scanner sc=new Scanner (System.in);
      Bank Sbi=new SBI_Bank();
      Bank Axis=new Axis_Bank();
       System.out.println("enter Sbi Accountnum :");
      Sbi.Accountnum=sc.nextLong();
      System.out.println("enter Pannum :");
      Sbi.Pannum=sc.nextLong();
      Sbi.display();
      Sbi.rate_of_interest();
      System.out.println("enter Axis Accountnum :");
       Axis.Accountnum=sc.nextLong();
      System.out.println("enter Pannum :");
      Axis.Pannum=sc.nextLong();
      Axis.display();
      Axis.rate_of_interest();
      }
  }