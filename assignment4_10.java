import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b;
    int greatestDenom = 0;

    // input
    System.out.println("Please enter two integers: ");
    a = input.nextInt();
    b = input.nextInt();
   
    // Looping down from min(a,b). The first common
    // denominator we find is the largest one.
    for (int i = Math.min(a, b); i > 0; i--) {
      if (a % i == 0 && b % i == 0) {
        greatestDenom = i;
        break;
      }
    }
  
    System.out.println("The greatest common denominator is " + greatestDenom);
  }
}


