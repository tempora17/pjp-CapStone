package com.smartcalculator.exceptions;

/**
 * Exception thrown when an unsupported mathematical operation is requested.
 */
public class InvalidOperationException extends RuntimeException {

  /**
   * Creates an exception with the specified message.
   *
   * @param message the error message
   */
  public InvalidOperationException(String message) {
    super(message);
  }

}
