class Main {
  public static void main(String[] args) {
    boolean isPrime;
    int counter = 0; 

    // Manually print prime 2 because it's hard to find in the loop.
    System.out.printf("%3d ", 2);
    counter += 1;

    // first loop. i will be prime candidates starting at 3
    // bonus: instead of i++, we can do i += 2 to skip even numbers
    for (int i = 3; i < 1000; i++) {

      // we start out by assuming i is prime.
      isPrime = true;

      // inside this loop, we loop from 2 to i
      // bonus: for (int j = 3; j < i/2; j += 2) reduces number of iterations
      for (int j = 2; j < i; j++) {

        // if i is divisible by j, the number is not prime
        if (i % j == 0) {
          isPrime = false;
          
          // not strictly necessary, but we can stop the inner
          // loop if we already know the number is not prime.
          break;
        }
      }

      // if we make it through the entire nested loop and
      // isPrime is still true, then we have found a prime number!
      if (isPrime) {
        
        // print it, then increase the counter we use to format printing.
        System.out.printf("%3d ", i);
        counter += 1;
      }

      // if we have printed 10 numbers, print new line, reset counter.
      if (counter == 10) {
        System.out.println();
        counter = 0;
      }
    }

    // final new line to end the program with.
    System.out.println();
  }
}


