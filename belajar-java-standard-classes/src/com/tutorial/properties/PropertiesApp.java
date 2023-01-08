package com.tutorial.properties;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
  public static void main(String[] args) {

    // membaca
    try {
      Properties properties = new Properties();
      properties.load(new FileReader("application.properties"));

      Object o = properties.get("database.host");
      System.out.println(o);

      String host = properties.getProperty("database.host");
      String port = properties.getProperty("database.port");
      String username = properties.getProperty("database.username");
      String password = properties.getProperty("database.password");

      System.out.println(host);
      System.out.println(port);
      System.out.println(username);
      System.out.println(password);

    } catch (FileNotFoundException e) {
      System.out.println("file tidak ketemu");
      throw new RuntimeException(e);
    } catch (IOException e) {
      System.out.println("tidak bisa di load");
      throw new RuntimeException(e);
    }


    // menulis
    try{

      Properties properties = new Properties();
      properties.put("name.first","Muhammad");
      properties.put("name.middle","Arsil");
      properties.put("name.last","Alhabsy");

      // menulis
      properties.store(new BufferedWriter(new FileWriter("profile.properties")), "Konfigurasi name");
    }catch (IOException e){
      System.out.println(e);
    }
  }


}
