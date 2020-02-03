class Main {
  public static void main(String[] args) {
    double money = 10000;

    // For 10 years, reduce by 2% every year.
    for (int i = 0; i < 10; i++) {
      money = money * 0.98;
    }

    System.out.printf("You only have %.2f euros left!\n", money);
  }
}


