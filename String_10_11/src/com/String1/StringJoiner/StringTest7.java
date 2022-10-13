package com.String1.StringJoiner;

import java.util.Scanner;

public class StringTest7 {
    public static void main(String[] args) {
        //键盘输入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字符串");
        String str=sc.next();

        //反转字符串
        String s=new StringBuilder().append(str).reverse().toString();

        //比较是否为对称字符串
        if(str.equals(s)){
            System.out.println("当前是对称字符串");
        }else{
            System.out.println("不是");
        }
    }
}
