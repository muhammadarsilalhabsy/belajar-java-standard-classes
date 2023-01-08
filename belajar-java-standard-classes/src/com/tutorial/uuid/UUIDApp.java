package com.tutorial.uuid;

import java.util.UUID;

public class UUIDApp {
  public static void main(String[] args) {


    for (int i = 0; i < 100; i++) {
      UUID uuid = UUID.randomUUID();
      System.out.println(Integer.toHexString(System.identityHashCode(uuid)));
      String getStrUuid = uuid.toString();
      System.out.println(getStrUuid);

    }

  }
}
