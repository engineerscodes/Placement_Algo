package Thread;

/**
 * @author NAVEEN ,
 * 29 Jun, 2022
 */
class Test implements Runnable {
  public void run() {
    System.out.println("Child Thread");
  }
}
public class Main {
  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(new Test());
    t.start();
    t.join();
    System.out.println("Main Thread");
  }
}