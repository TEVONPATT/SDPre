public class Objective5Lab4 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int num;
    System.out.println("Please enter a number:");
    num = scanner.nextInt();
    if(num % 2 == 0) {
      System.out.println("The number is even");
    }
    else if(num % 2 != 0){
      System.out.println("The number is odd");
    }
  }
}
