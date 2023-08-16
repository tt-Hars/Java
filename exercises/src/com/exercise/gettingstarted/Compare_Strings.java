package com.exercise.gettingstarted;

public class Compare_Strings {
  public static void main(String[] args) {
    String a = "string 1";
    String b = "string 2";
    String result = "";

    if (a == b) {
      result = "strings are same";
    } else {
      result = "strings are different";
    }
    System.out.println(result);
  }
}
