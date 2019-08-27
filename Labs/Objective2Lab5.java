public class Objective2Lab5 {
  public static void main(String[] args){
    double side1, side2, hypotenuse;

    side1 = 3;
    side2 = 9;

    double num1 = (side1 * side1);
    double num2 = (side2 * side2);

    double result = num1 + num2;
    hypotenuse = Math.sqrt(result);

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse );
  }
}
