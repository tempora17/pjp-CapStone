package com.smartcalculator;

public class ATMRuleViolationException extends RuntimeException {
  public ATMRuleViolationException(String message) {
    super(message);
  }
}