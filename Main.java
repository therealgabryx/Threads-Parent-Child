class Main {
  protected static int num = 2, wait = 200;
  public static void main(String[] args) {
  
    new ThreadSleep().start();
    for (int i = 0; i < num; i++) {
      System.out.println("Main Thread");
    }
  }
}