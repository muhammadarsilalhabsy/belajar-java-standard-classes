package com.tutorial.stringjoiner03;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerClassApp {
  public static void main(String[] args) {

    String[] names = {"Ucup","Otong","Abilal","Apon","Arsil"};

    StringJoiner joiner = new StringJoiner("<->","/","\\");

    for (String value : names){
      joiner.add(value);
    }

    System.out.println(joiner);

  }
}
