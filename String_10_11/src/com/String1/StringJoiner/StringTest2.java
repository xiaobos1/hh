package com.String1.StringJoiner;

public class StringTest2 {
    public static void main(String[] args) {
        String str="13375824278";
        //截取前面三位
        String thereNumber=str.substring(0,3);

        //截取后四位
        String frueNumber=str.substring(7);

        //组合
        String arr=thereNumber+" **** "+frueNumber;

        System.out.println(arr);
    }
}
