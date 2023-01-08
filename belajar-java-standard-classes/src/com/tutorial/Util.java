package com.tutorial;

public class Util {

  public static void CheckMemoryLocation(Object data){
    int address = System.identityHashCode(data);
    System.out.println("Address = " + Integer.toHexString(address));
  }


  public static int pow(int data, int pangkat){

    int hasil = 1;
    for(int i = 0; i < pangkat; i++){
      hasil *= data;
    }

    return hasil;
  }

  // data * data * data
}
