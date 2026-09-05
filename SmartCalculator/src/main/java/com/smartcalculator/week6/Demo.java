package com.smartcalculator.week6;

public class Demo {

  public static void main(String[] args) {
    PaymentService service = new PaymentService(50000);

    try {
      service.processPayment(15000);
    } catch (PaymentException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Attempt complete.");
    }

    try {
      service.processPayment(-500);
    } catch (PaymentException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Attempt complete.");
    }

    try {
      service.processPayment(250000);
    } catch (PaymentException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Attempt complete.");
    }

    try {
      service.processPayment(40000);
    } catch (PaymentException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Attempt complete.");
    }

    try {
      service.processPayment(10000);
    } catch (PaymentException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Attempt complete.");
    }
  }
}
