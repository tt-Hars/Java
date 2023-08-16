package com.exercise.gettingstarted;

public class Compare_Numbers {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 20;
    String result = "";

    if (number1 > number2) {
      result = number1 + " is greater than " + number2;
    } else if (number2 > number1) {
      result = number2 + " is greater than " + number1;
    } else {
      result = number1 + " is equal to " + number2;
    }
    System.out.println(result);

  }
}
