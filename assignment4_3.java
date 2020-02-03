import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int number1, number2, result;
    int correct = 0;
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      // Generate two random numbers [0, 10)
      number1 = (int) (Math.random() * 10);
      number2 = (int) (Math.random() * 10);

      // Ask user to solve equation
      System.out.printf("What is %d - %d?\n", number1, number2);
      result = input.nextInt();

      // Check if user input was correct
      if (result == number1 - number2) {
        // keep track of how many answers were correct
        correct = correct + 1;
        System.out.println("That's correct!");
      }
      else {
        System.out.println("Eh, no");
      }
    }

    // Show results
    System.out.printf("You got %d out of 5 questions correct.\n", correct);
  }
}


