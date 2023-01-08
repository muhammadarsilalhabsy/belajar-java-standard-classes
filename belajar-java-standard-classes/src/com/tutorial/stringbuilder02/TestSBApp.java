package com.tutorial.stringbuilder02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestSBApp {
  public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    StringBuilder builder = new StringBuilder();

    System.out.println("for stop the program => exit();\n");
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {

      while (true) {
        System.out.print(": ");
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("exit();")) {
          break;
        }
        builder.append(userInput + "\n");
      }

      String result = builder.toString();
      writer.write(result);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }


  }
}
