package com.tutorial.stringbuilder02;

public class StringBuilderApp {
  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    builder.append("Nama saya");
    builder.append("arsil");
    builder.append(",");
    builder.append("saya");
    builder.append("sedang");
    builder.append("belajar");

    String result = builder.toString();
    System.out.println(result);

  }
}
