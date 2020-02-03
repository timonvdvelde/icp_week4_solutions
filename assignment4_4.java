class Main {
  public static void main(String[] args) {
    double kilometers, miles;

    // km to miles
    System.out.println("Kilometers  Miles");
    kilometers = 1;

    // Do 10 times
    for (int i = 0; i < 10; i++) {
      miles = kilometers * 0.621;
      System.out.printf("%5.2f       %5.2f\n", kilometers, miles);

      // increase kilometers by one.
      kilometers = kilometers + 1;
    }
  }
}

