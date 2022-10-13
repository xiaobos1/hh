package com.String1.ArrayListDemo;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> al=new ArrayList<>();

        //添加元素
        al.add("aaa");
        al.add("aaa");
        al.add("bbb");
        al.add("sss");
        System.out.println(al);


        System.out.println("===================");
        //删
        String remove = al.remove(2);
        System.out.println(remove);
        System.out.println(al);
        System.out.println();

        System.out.println("====================");
        //改
        String bbb = al.set(1, "bbb");
        System.out.println(bbb);
        System.out.println(al);

        System.out.println("====================");
        //查
        String id= al.get(2);
        System.out.println(id);
        System.out.println(al);
    }
}
