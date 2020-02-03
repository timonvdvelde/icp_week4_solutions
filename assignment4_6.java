class Main {
  public static void main(String[] args) {
    double salary = 12000;
    double sum = 12000;

    // loop 9 times, because the first year is already done.
    for (int i = 0; i < 9; i++) {
      salary = salary * 1.02;
      sum = sum + salary;
    }

    System.out.printf("After 10 years you earn %.2f and " +
        "have earned a total of %.2f\n", salary, sum);

  }
}


