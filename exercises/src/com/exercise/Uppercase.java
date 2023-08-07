package com.exercise;

public class Uppercase {
  public static void main(String[] args) {
    String someString = "lower case string";
    String uppercaseString = someString.toUpperCase();
    String firstCharacter = someString.substring(0, 1).toUpperCase();
    String capitalizeString = firstCharacter + someString.substring(1); 
    System.out.println("UPPERCASE: " + uppercaseString);
    System.out.println("Capitalize: "+ capitalizeString);

  }
}
