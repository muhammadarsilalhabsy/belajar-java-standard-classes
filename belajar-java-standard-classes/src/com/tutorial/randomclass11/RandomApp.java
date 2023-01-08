package com.tutorial.randomclass11;

import java.util.Random;

public class RandomApp {
  public static void main(String[] args) {

    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      int data = random.nextInt(10);
      System.out.println(data);
    }
  }
}
