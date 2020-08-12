import java.util.Scanner;
public class Objective4Lab2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the first whole number you would like to add.");
    int num1 = 1;
    System.out.println(num1);
    System.out.println("Please enter the second whole number you would like to add.");
    int num2 = 7;
    System.out.println(num2);
    System.out.println("Please enter the third whole number you would like to add.");
    int num3 = 5;
    System.out.println(num3);
    System.out.println("Please enter the first decimal number you would like to add.");
    double dub1 = 1.1;
    System.out.println(dub1);
    System.out.println("Please enter the second decimal number you would like to add.");
    double dub2 = 2.2;
    System.out.println(dub2);
    System.out.println("Please eneter the third decimal number you would like to add.");
    double dub3 = 3.3;
    System.out.println(dub3);
    int intSum = num1 + num2 + num3;
    double dubSum = dub1 + dub2 + dub3;
    System.out.println("The sum of" + " " + num1 + " " + "+" + " " + num2 + " " + "+" + " " + num3 + " " + "=" + " " + intSum);
    System.out.println("The sum of" + " " + dub1 + " " + "+" + " " + dub2 + " " + "+" + " " + dub3 + " " + "=" + " " + dubSum);


  }
}
