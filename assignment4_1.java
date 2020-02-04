import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // initialise grade to 0 so we can start the while loop.
    int grade = 0;

    // Keeps looping while the input is not equal to -1.
    while (grade != -1) {
      // Ask for initial input to start the loop.
      System.out.println("Please enter a grade (0-100) or -1 to end execution.");
      grade = input.nextInt();

      // if Exit
      if (grade == -1) {
        System.out.println("Stopping.");
      }
      // If pass
      else if (grade >= 55) {
        System.out.println("You pass");
      }
      // If fail
      else if (grade < 55) {
        System.out.println("You fail");
      }
      // Could use some extra checks to see if input is actually between 0 and 100.
    }
  }
}



