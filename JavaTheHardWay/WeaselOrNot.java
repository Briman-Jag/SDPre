import java.util.Scanner;

public class WeaselOrNot{
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String weasel;
    boolean yep, nope;

    System.out.println( "Type \"weasel\", please." );
    weasel = keyboard.next();
    yep = weasel.equals("weasel");
    nope = ! weasel.equals("weasel");

    System.out.println( "You typed what was requested: " + yep);
    System.out.println( "You ignored polite instructions: " + nope);
  }
}
