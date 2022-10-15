package com.String1.StudentSystem;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCode());
    }
    private static String getCode(){
        //创建集合
        ArrayList<Character> list=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        //System.out.println(list);
        //随机索引
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(list.size());
            char c=list.get(index);
            sb.append(c);
        }
        int num=r.nextInt(10);
        sb.append(num);

        //
        char[] arr=sb.toString().toCharArray();
        int rand=r.nextInt(arr.length);
        char tmp=arr[rand];
        arr[rand]=arr[arr.length-1];
        arr[arr.length-1]=tmp;

        return new String(arr);
    }
}
