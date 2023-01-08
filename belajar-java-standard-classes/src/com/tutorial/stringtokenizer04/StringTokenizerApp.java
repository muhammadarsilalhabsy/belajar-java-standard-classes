package com.tutorial.stringtokenizer04;

import com.tutorial.Util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerApp {
  public static void main(String[] args) {


    String name = "Muhammad Arsil Alhabsy";

    System.out.println("\nTokenizer========");
    StringTokenizer tokenizer = new StringTokenizer(name," ");

    while(tokenizer.hasMoreTokens()){
      String token = tokenizer.nextToken();
      Util.CheckMemoryLocation(token);
      System.out.println(token);
    }

    // perbedaan tokenizer sama split adalah token itu lazy

    System.out.println("\nSplit========");
    String[] s = name.split(" ");

    for(String data : s){
      Util.CheckMemoryLocation(data);
      System.out.println(data);
    }
    System.out.println(Arrays.toString(s));
  }
}
