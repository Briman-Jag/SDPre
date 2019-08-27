import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args) {
    String name, city;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? "); // Doesn't blow up with int or double because numbers can be in strings
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? "); //Blows up with numbers
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print( "How much do you weigh, " + name + "? ");  //Does not blow up with integer because int is included in doubles but not vice versa
    weight = keyboard.nextDouble();       //Blows up with String characters like letters and symbols

    System.out.println( weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();         //Blows up with String characters like letters and symbols

    System.out.print( "Hopefully that is " + income + " per hour");
    System.out.println( " and not per year!");

    System.out.print("What city do you live in? ");
    city = keyboard.next();
    System.out.println("Never heard of " + city + ". Must be lame.");

    System.out.println( "Well, thanks for answering my rude questions, ");
    System.out.println( name + ".");
  }
}
