import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int number1, number2, result;
    Scanner input = new Scanner(System.in);

    // Initialise to true to start loop
    boolean correct = true;

    // if the answer was correct, keep going, otherwise stop.
    while (correct) {
      // Generate two random numbers [0, 10)
      number1 = (int) (Math.random() * 10);
      number2 = (int) (Math.random() * 10);

      // Ask user to solve equation
      System.out.printf("What is %d - %d?\n", number1, number2);
      result = input.nextInt();

      // Check if user input was correct
      if (result == number1 - number2) {
        // keep track of if the answer was correct or not
        correct = true;
        System.out.println("That's correct!");
      }
      else {
        correct = false;
        System.out.println("Eh, no");
      }
    }
  }
}


