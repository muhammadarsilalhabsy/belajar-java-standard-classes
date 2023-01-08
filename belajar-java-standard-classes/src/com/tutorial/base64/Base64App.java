package com.tutorial.base64;

import java.util.Arrays;
import java.util.Base64;

public class Base64App {
  public static void main(String[] args) {

    String name = "Muhammad Arsil Alhabsy";

    byte[] data = name.getBytes();
    for (int i = 0; i < data.length; i++) {
      System.out.print((char) data[i]);
    }

    System.out.println("\n" + Arrays.toString(name.getBytes()));

    // endcode
    System.out.println("\nendcode");
    String s = Base64.getEncoder().encodeToString(name.getBytes());
    System.out.println(s);

    // decode
    System.out.println("\ndecode");
    byte[] decode = Base64.getDecoder().decode(s);
    String strDecode = new String(decode);
    System.out.println(strDecode);

  }
}
