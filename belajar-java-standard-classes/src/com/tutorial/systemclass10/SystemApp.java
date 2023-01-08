package com.tutorial.systemclass10;

public class SystemApp {
  public static void main(String[] args) {

    System.out.println(System.currentTimeMillis());
    System.out.println(System.nanoTime());
    System.out.println(System.getenv("PWD"));



    System.exit(1);
    System.out.println("tidak akan dieksekusi!");

  }
}
