package com.tutorial.stringclass01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringClass {
  public static void main(String[] args) {

    String name = "Muhammad Arsil Alhabsy";

    String toLower = name.toLowerCase(); // membuat string baru

    // tidak merubah dari value string name
    System.out.println(name);
    System.out.println(toLower);

    // perbandingan

    boolean isSame = "muhammad arsil alhabsy" == name.toLowerCase(); // false
    System.out.println(isSame);

    boolean equalsContent01 = name.toLowerCase().contentEquals("MuhaMMaD ArSil AlhaBSY".toLowerCase()); // true
    boolean equalsContent02 = name.toLowerCase().contentEquals("MuhaMMaD ArSil AlhaBSY"); // false
    boolean equalsIgnoreCase = name.equalsIgnoreCase("MuhaMMaD ArSil AlhaBSY"); // true

    System.out.println(equalsContent01);
    System.out.println(equalsContent02);
    System.out.println(equalsIgnoreCase);

    // contains
    System.out.println(name.contains("sil")); // true

    // isEmpty and isBlank
    System.out.println("".isEmpty()); // true
    System.out.println(" ".isEmpty()); // false
    System.out.println(" ".isBlank()); // ture
    System.out.println("".isBlank()); // ture

    // concat
    System.out.println("A ".concat("ku"));
    System.out.println("A ".concat("ku"));

    // char
    System.out.println(name.charAt(name.length() - 1)); // mengambil char terakhir
    System.out.println((char) name.codePointAt(2)); // mengembalikan charachter unique code
    System.out.println(name.chars());
    System.out.println(Arrays.toString(name.toCharArray())); // ['m','u','h' ... ]

    // split
    String[] s = name.split(" ");
    System.out.println(s[0]); // muhammad
    System.out.println(s[1]); // arsil
    System.out.println(s[2]); // alhabsy


  }
}
