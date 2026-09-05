package com.smartcalculator.thread;

public class Demo {
  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new NotificationDispatcher("ACC001", "Your transfer was successful"), "NotificationWorker-1");
    Thread t2 = new Thread(new NotificationDispatcher("ACC002", "Your account has been credited"), "NotificationWorker-2");
    Thread t3 = new Thread(new NotificationDispatcher("ACC003", "Your payment was successful"), "NotificationWorker-3");
    t1.start();
    t2.start();
    t3.start();
    t1.join();
    t2.join();
    t3.join();
    System.out.println("All notifications dispatched.");
  }
}
