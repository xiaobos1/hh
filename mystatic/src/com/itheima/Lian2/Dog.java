package com.itheima.Lian2;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗子在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨式");
    }
}
