import java.util.Scanner;

public class BMICategories {
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double bmi, height, weight;

    System.out.print( "Enter your height in inches: ");
    height = keyboard.nextDouble();

    System.out.print( "Enter your weight in pounds: ");
    weight = keyboard.nextDouble();

    bmi = ((weight * 703)/ (height*height));

    System.out.print( "BMI category: ");
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight");
    }
    else if ( bmi <= 16.0) {
      System.out.println( "severly underweight");
    }
    else if ( bmi < 18.5) {
      System.out.println( "underwight");
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight");
    }
    else if (bmi < 35.0) {
      System.out.println( "moderately obese");
    }
  }
}
