package com.tutorial.bignumberclass07;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
  public static void main(String[] args) {

    long dataLong = 999999999;
    Long objLong = 999999999999999999L;
    BigInteger bigInteger = new BigInteger("999999999999999999");
    BigDecimal bigDecimal = new BigDecimal("999999999999999999.999999999");
    System.out.println(dataLong);
    System.out.println(objLong);
    System.out.println(bigInteger);

    Long bigConvertion = bigInteger.divide(BigInteger.valueOf(999999999)).longValue();
    System.out.println(bigConvertion);

    System.out.println(bigInteger.add(bigDecimal.toBigInteger()));



  }
}
