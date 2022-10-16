package com.itheima.mystatic02;

public class ArrayUtil {
    private ArrayUtil(){}

    public static String printArray(int[] arr){
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                str +=new StringBuilder().append(arr[i]).append("]").toString();
            }else{
                str +=new StringBuilder().append(arr[i]).append(",").toString();
            }
        }
        return str;
    }

    //
    public static double getAvg(double[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum/arr.length;
    }
}
