package com.tutorial.numberClass05;

public class Conversion {
  public static void main(String[] args) {


    // Object Number non primitf
    // conversion using method xxxValue();
    Integer intValue = 10;

    Long longValue = intValue.longValue();

    Short shortValue = longValue.shortValue();

    // conversion using method TypeData.parseXxx();
    // parse for primitive
    // valueOf for non primitive aka object

    String stringValueForInt = "1000";
    int intData = Integer.parseInt(stringValueForInt);
    Integer intData2 = Integer.valueOf(stringValueForInt);

    String stringValueForDouble = "10.00";
    double doubleData = Double.parseDouble(stringValueForDouble);
    Double doubleData2 = Double.valueOf(stringValueForDouble);
    // int intErrorConversion = Integer.parseInt(stringValueForDouble); // Error
  }
}
