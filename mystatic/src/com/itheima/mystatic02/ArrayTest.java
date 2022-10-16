package com.itheima.mystatic02;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String str=ArrayUtil.printArray(arr);
        System.out.println(str);

        double[] brr={1.2,1.2,1.2};
        double b=ArrayUtil.getAvg(brr);
        System.out.println(b);
    }
}
