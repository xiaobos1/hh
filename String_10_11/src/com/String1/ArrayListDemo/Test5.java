package com.String1.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<User> list=new ArrayList<>();

        User u1=new User(4,"静下来","123456");
        User u2=new User(3,"学下去","12345678");
        User u3=new User(2,"莫冲动","123456@");
        User u4=new User(1,"多学习","123456abc");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);

//        String s="[";
//        for (int i = 0; i < list.size(); i++) {
//            if(i==list.size()-1){
//                s +=new StringBuilder().append(list.get(i)).append("]").toString();
//            }else{
//                s +=new StringBuilder().append(list.get(i)).append(",").toString();
//            }
//        }
//        System.out.println(s);
        System.out.println("输入一个数字");
        int n=sc.nextInt();
        boolean flge=select(n,list);

        if (flge){
            System.out.println("找到了");
        }else{
            System.out.println("找不到");
        }
    }




    public static boolean select(int id,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            int uid=u.getId();
            if(uid==id){
                return true;
            }
        }
        return false;
    }
}
