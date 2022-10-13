package com.String1.ArrayListDemo;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer>  list=new ArrayList<>();

        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        String s="[";
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                s +=new StringBuilder().append(list.get(i)).append("]").toString();
            }else{
                s +=new StringBuilder().append(list.get(i)).append(",").toString();
            }
        }
        System.out.println(s);
    }
}
