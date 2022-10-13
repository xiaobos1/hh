package com.String1.Test;

public class Test2 {
    public static void main(String[] args) {
        //定义俩个字符
        String sA="abcde";
        String sB="deab";

        int count=0;
        for (int i = 0; i < sA.length(); i++) {
            sA=bl(sA);
            if(sA.equals(sB)){
                count++;
            }
        }
        if(count==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    public static String bl(String str){
        char c=str.charAt(0);//获取第一个字符

        String end=str.substring(1);//获取第二个到最后一个字符串

        String t=new StringBuilder().append(end).append(c).toString();//将第一个字符进行旋转

        return t;//传回一个字符串
    }
}
