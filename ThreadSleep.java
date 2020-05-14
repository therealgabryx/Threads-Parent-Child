public class ThreadSleep extends Thread {
  private Thread parent;

  public ThreadSleep() {
    parent = Thread.currentThread();
  }

  @Override 
  public void run() {
    for (int i = 0; i < Main.num; i++) {
      System.out.println("RUN child thread" + getName());
      printName();
      try { Thread.sleep(Main.wait); }
      catch (InterruptedException e) {return;}
    }
    System.err.println("\n" + getName() + " ended");
  }

  public void printName() {
    Thread name = Thread.currentThread();

    if (name == parent) {
      System.out.println("PRINT parent thread" + getName());
    }
    else if (name == this) {
      System.out.println("PRINT child thread" + getName());
    }
    else {
      System.out.println("PRINT unknown thread");
    }
  }
}