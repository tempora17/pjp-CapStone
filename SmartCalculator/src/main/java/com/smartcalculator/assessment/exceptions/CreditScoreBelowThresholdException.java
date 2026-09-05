package com.smartcalculator.assessment.exceptions;

public class CreditScoreBelowThresholdException extends LoanException {

  public CreditScoreBelowThresholdException(String message) {
    super(message);
  }
}