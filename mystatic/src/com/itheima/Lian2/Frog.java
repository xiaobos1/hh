package com.itheima.Lian2;

import java.sql.SQLOutput;

public class Frog extends Animal implements Swim {
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
