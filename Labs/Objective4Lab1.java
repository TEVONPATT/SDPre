import java.util.Scanner;
public class Objective4Lab1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your first name?");
    String fname = "John";
    System.out.println("What is your last name?");
    String lname = "Doe";
    System.out.println("What is your favorite animal?");
    String favoriteAnimal = "Lemur";
    System.out.println("What is your favorite food?");
    String favoriteFood = "Tacos";
    System.out.println("What is your favorite song?");
    String favoriteSong = "Twinkle Twinkle Little Star";
    System.out.println("My name is" + " " + fname + " "+ lname + ".");
    System.out.println("My favorite animal is the" + " " + favoriteAnimal + ".");
    System.out.println("My favorite food is" + " " + favoriteFood + ".");
    System.out.println("My favorite song is" + " " + favoriteSong + ".");
  }
}
