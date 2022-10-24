package com.xiaobo.lian;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int passed=0,fail=0;
        float results;
        for(int i=1;i<=10;i++)
        {
            results=sc.nextFloat();
            if(results<0 || results>100){
                System.out.println("错误");
                break;
            }
            if(results>=90){
                System.out.println("No."+i+"期末成绩："+results+",考核成绩： A");
            }else if(results>=80){
                System.out.println("No."+i+"期末成绩："+results+",考核成绩： B");
            } else if(results>=60.0){
                System.out.println("No."+i+"期末成绩："+results+",考核成绩： C");
                passed++;
            }else{
                fail++;
                System.out.println("No."+i+"期末成绩："+results+",考核成绩： D");
            }
        }
        System.out.println("及格人数："+passed+",不及格人数"+fail);
    }
}
