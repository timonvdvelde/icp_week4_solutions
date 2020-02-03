class Main {
  public static void main(String[] args) {
    int counter = 0;

    for (int i = 100; i <= 1000; i++) {
      // If we have printed 10 numbers, first print a newline, reset counter.
      if (counter == 10) {
        System.out.println();
        counter = 0;
      }

      // print number, increment counter
      if (i % 3 == 0 && i % 4 == 0) {
        System.out.print(i + " ");
        counter += 1;
      }
    }

    // End the program with a newline.
    System.out.println();
  }
}


