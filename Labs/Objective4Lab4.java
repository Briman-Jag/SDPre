import java.util.Scanner;

public class Objective4Lab4{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int num;

    System.out.println("Please eneter a number: ");
    num = input.nextInt();

    if (num % 2 == 0)
      System.out.println("The number is even");

    else if ( num % 2 != 0)
      System.out.println("The number is odd");
  }
}
