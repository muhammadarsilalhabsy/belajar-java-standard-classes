package com.tutorial.array12;

import java.util.Arrays;

public class ArraysApp {
  public static void main(String[] args) {


    int[] data = {8,4,51,21,12,1,1,9,3,2,2,10,7};
    System.out.println(Arrays.toString(data));


    // sort array
    System.out.println("sort data array");
    Arrays.sort(data);
    System.out.println(Arrays.toString(data));

    // binary search
    System.out.println("binary search");
    int indexKe = Arrays.binarySearch(data,7);
    System.out.println(indexKe);

    // copy of
    int[] copyDataArray = Arrays.copyOf(data, 5);
    System.out.println(Arrays.toString(copyDataArray));

    // copy using range
    int[] copyDataArrayWithRange = Arrays.copyOfRange(data, data.length - 5, data.length);
    System.out.println(Arrays.toString(copyDataArrayWithRange));

    int[] test = Arrays.copyOfRange(data, 0, 4);
    System.out.println(Arrays.compare(copyDataArray, test));
    System.out.println(Arrays.toString(test));
    System.out.println(Arrays.toString(copyDataArray));





  }
}
