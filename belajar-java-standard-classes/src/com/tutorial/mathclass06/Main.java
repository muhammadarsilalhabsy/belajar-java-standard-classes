package com.tutorial.mathclass06;

import com.tutorial.Util;

public class Main {
  public static void main(String[] args) {

    // Math kelas berisi utiliti atau function static untuk matematika

    int a = 9;
    int b = 5;

    int palingBesar = Math.max(a,b);
    System.out.println(palingBesar);

    int palingKecil = Math.min(a,b);
    System.out.println(palingKecil);

    System.out.println(Math.floor(7.7)); // 7
    System.out.println(Math.ceil(7.7)); // 8

    System.out.println(Math.pow(3,3)); // 27

    System.out.println(Util.pow(3,3));

  }
}
