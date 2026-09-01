package com.smartcalculator.exceptions;

/**
 * Exception thrown when a modulo by zero is attempted.
 */
public class ModuloByZeroException extends ArithmeticException{

  /**
   * Creates a modulo-by-zero exception.
   */
  public ModuloByZeroException(){
    super("Cannot Modulo by zero");
  }
}
