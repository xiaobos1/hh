package com.itheima.Lian1;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(){}
    protected Animal(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    public void drink(){
        System.out.println("喝水");
    }
}
