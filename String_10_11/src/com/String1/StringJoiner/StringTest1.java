package com.String1.StringJoiner;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入你的数字");
        int n=sc.nextInt();
        int x=n;
        String kk="";
        if(n>=0 && n<=9999999){
            while(n != 0){
                int bs=n%10;
                String st1=turn(bs);
                kk=st1+kk;
                n /=10;
            }
        }else{
            System.out.println("输入值错误");
        }

        //
        int count=7-kk.length();
        for (int i = 0; i < count; i++) {
            kk="零"+kk;
        }
        //
        String[] money={"佰","拾","万","仟","佰","拾","元"};
        String end="";
        for (int i = 0; i < money.length; i++) {
            char k=kk.charAt(i);
            end=end+k+money[i];
        }
        System.out.println(end);

    }

    public static String  turn(int str){
        String[] s={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

        return s[str];
    }
}
