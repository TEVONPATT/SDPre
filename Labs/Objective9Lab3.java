import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;
    while(true){
      printMenu();
      selection = scanner.nextInt();
      if(selection == 1) {
        System.out.println("Hello People");
      }
      else if(selection == 2) {
        System.out.println("Pizza, California Burritos, Bananas");
      }
      else if(selection > 3 || selection < 1) {
        System.out.println("Invalid selection. Please try again.");
      }
      else if(selection == 3) {
        System.out.println("Goodbye");
        break;
      }
    }
    scanner.close();
  }
  public static void printMenu() {
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
