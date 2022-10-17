package com.itheima.Lian1;

public class Test {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setName("毛毛");
        d.setAge(3);
        System.out.print("我"+ d.getAge()+"岁的"+ d.getName()+"在");
        d.eat();
    }
}
