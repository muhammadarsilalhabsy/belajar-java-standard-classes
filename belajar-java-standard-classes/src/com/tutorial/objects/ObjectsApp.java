package com.tutorial.objects;


import java.util.Objects;

public class ObjectsApp {
  public static void main(String[] args) {
    execute(new Data("We made it!"));
  }

  public static void execute(Object o) {

    // pengecekan biasa
    if(o != null){
      System.out.println("Dijalankan");
      System.out.println(o.toString());
      System.out.println(o.hashCode());
      System.out.println("==========\n");
    }

    // pengecekan menggunakan Objects
    System.out.println(Objects.toString(o));
    System.out.println(Objects.hashCode(o));


  }

  public static class Data {
    String data;

    public Data(String data) {
      this.data = data;
    }

    @Override
    public String toString() {
      return "Data{data='" + data + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Data data1 = (Data) o;

      return Objects.equals(data, data1.data);
    }

    @Override
    public int hashCode() {
      return data != null ? data.hashCode() : 0;
    }
  }
}
