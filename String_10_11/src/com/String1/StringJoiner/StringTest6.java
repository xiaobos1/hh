package com.String1.StringJoiner;

public class StringTest6 {
    public static void main(String[] args) {
        //创建
        StringBuilder sb=new StringBuilder();
        //添加值
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
//        sb.append("bbb");
//        sb.append("ccc");
//        sb.append("ddd");
        //打印
        System.out.println(sb);

        //转化为字符串
        String str=sb.toString();
        System.out.println(str);
    }
}
