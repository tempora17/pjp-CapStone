package com.smartcalculator;

import java.util.Scanner;

import com.smartcalculator.calculator.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Entry point for the Smart Calculator CLI application */
public class Main {
  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  /**
   * Starts the Smart Calculator application
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    Calculator.run();
  }
}
