package com.String1.StringJoiner;

public class StringTest4 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String str=IntString(arr);
        System.out.println(str);
    }

    public static String IntString(int[] arr){
        String s="[";
        for (int i=0;i<arr.length ; i++){
            if(i==arr.length-1)
            {
                s +=new StringBuilder().append(arr[i]).append("]").toString();
            }else{
                s +=new StringBuilder().append(arr[i]).append(",").toString();
            }
//            s =s+new StringBuilder().append(arr[i]).toString()+",";
        }
        return s;
    }

}
