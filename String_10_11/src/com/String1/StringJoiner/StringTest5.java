package com.String1.StringJoiner;

import java.util.StringJoiner;

public class StringTest5 {
    public static void main(String[] args) {
        //创建StringJoiner对象指定中间间隔符号
        StringJoiner sj=new StringJoiner(",","[","]");
        String str=sj.add("aaa").add("bbb").add("ccc").add("ddd").toString();

        //打印
        System.out.println(str);
    }
}
