package com.itheima.test;

public class Student {
    private String name;
    private int age;
    //空参构造
    public Student(){
        System.out.println("看看我执行了吗");
    }
    //
    public Student(String name,int age){
        this.name=name;
        this.age =age;
    }
    public void setName(String name){
        this.name=name;
    }
    //name变量的调用方法
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age>=6){
            this.age=age;
        }else{
            System.out.println("年龄不符");
        }
    }
    public int getAge(){
        return age;
    }

}
