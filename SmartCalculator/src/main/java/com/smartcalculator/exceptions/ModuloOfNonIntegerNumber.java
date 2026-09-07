package com.smartcalculator.exceptions;

public class ModuloOfNonIntegerNumber extends RuntimeException {

  public ModuloOfNonIntegerNumber() {
    super("Cannot calculate modulo of non integer number");
  }
}
