class Main {
  public static void main(String[] args) {
    int base = 2;
    int exponent = 1;
   
    // Keep looping while 2^x is smaller than 8000.
    while (Math.pow(base, exponent) < 8000) {
      exponent += 1;
    }

    // reduce exponent again, because the loop only stops when
    // we've gone too far.
    exponent -= 1;

    System.out.printf("x = %d, 2^x = %.2f\n", exponent,
        Math.pow(base, exponent));
  }
}


