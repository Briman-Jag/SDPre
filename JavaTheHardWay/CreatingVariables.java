public class CreatingVariables {
  public static void main ( String[] args ) {
    int x, y, age, z;
    double seconds, e, checking, randomNumber;
    String firstName, lastName, title, middleInitial, nickName;

    x = 10;
    y = 400;
    z = 25;
    age = 28;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    randomNumber = 2213.2313;

    firstName = "Brian";
    lastName = "S";
    title = "Mr.";
    middleInitial = "D.";
    nickName = "Jaguar";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y.");
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefull you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + " " + middleInitial + " " + lastName + " aka " + nickName );
    System.out.println( "The variable z contains " + z + " and here is another random number " + randomNumber );
  }
}
