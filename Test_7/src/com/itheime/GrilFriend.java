package com.itheime;

public class GrilFriend {
    //女朋友的名字
    private String name;
    //给name变量赋值
    public void setName(String name){
        this.name=name;
    }
    //name变量的调用方法
    public String getName(){
        return name;
    }

    //女朋友的年龄
    private int age;
    public void setAge(int a){
        if(a>=18 && a<=40){
            age=a;
        }else{
            System.out.println("你俩不合适，你把握不住");
        }
    }
    public int getAge(){
        return age;
    }

    //性别
    private String sex;
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
}
