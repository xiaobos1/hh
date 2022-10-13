package com.String1.Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //将字符中的数字换成罗马数字
        //I-1 II-2 III-3 IV-4 V-5 VI-6 VII-7 VIII-8 IX-9

        //String str="12345a";
        //键盘输入
        Scanner sc=new Scanner(System.in);
        String str;
        while(true) {
            System.out.println("输入一个字符");
            str=sc.next();
            //拆分
          boolean flag=chekStr(str);
          if(flag){
              break;
          }else{
              System.out.println("输入错误重新输入 >");
              continue;
          }

        }
        //转化罗马字符
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int number=ch-48;
            String s=change(number);
            sb.append(s);
        }
        String s1=sb.toString();
        System.out.println(s1);
    }

    public static String change(int num){
        String[] arr={"","I ","II ","III ","IV " ,"V ","VI ","VII ","VIII ","IX "};
        return arr[num];
    }


    public static boolean chekStr(String str){
        if(str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);//0~9
            if(c<'0' && c>'9'){
                return false;
            }
        }
        //所有字符判断完毕才进行判断
        return true;
    }
}
