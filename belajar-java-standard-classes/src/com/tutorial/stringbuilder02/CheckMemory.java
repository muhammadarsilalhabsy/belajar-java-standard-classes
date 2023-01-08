package com.tutorial.stringbuilder02;

import com.tutorial.Util;

import java.rmi.server.UID;

public class CheckMemory {
  public static void main(String[] args) {


    String name = "Mail";
    Util.CheckMemoryLocation(name);

    name = name + " " + "Bin";
    Util.CheckMemoryLocation(name);

    name = name + " " + "Mail";
    Util.CheckMemoryLocation(name);

    StringBuilder builder = new StringBuilder();
    builder.append("Otong");
    Util.CheckMemoryLocation(builder);
    builder.append(" ");
    builder.append("bin");
    Util.CheckMemoryLocation(builder);
    builder.append(" ");
    builder.append("Surotong");
    Util.CheckMemoryLocation(builder);
    Util.CheckMemoryLocation(builder.toString());



  }

}
