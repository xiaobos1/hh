package com.String1.ArrayListDemo;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("点赞");
        list.add("收藏");
        list.add("快乐");
        list.add("洗脚");


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
