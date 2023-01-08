package com.tutorial.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
  public static void main(String[] args) {

    String name = "Muhammad Arsil Alhabsy Programmer Zaman Now Eko Uki Iba";

    String cari = "now";
    Pattern pattern = Pattern.compile("[//Arsil//]");
    Matcher matcher = pattern.matcher(name);

    while(matcher.find()){
      System.out.print(matcher.group());
    }
  }
}
