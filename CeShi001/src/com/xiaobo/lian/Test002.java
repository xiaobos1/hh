package com.xiaobo.lian;


import java.util.ArrayList;

public class Test002 {
    public static void main(String[] args)  {
        String str=toBinary(6);
        System.out.println(str);
    }
    public static String toBinary(int num){
        StringBuilder sb=new StringBuilder();
        String str="";
        //利用循环初二
        while(true){
            if(num==0){
                break;
            }
            int r=num%2;
            sb.insert(0,r);
            num /=2;
        }
        return sb.toString();
    }
}
