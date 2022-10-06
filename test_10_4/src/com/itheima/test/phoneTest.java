package com.itheima.test;

public class phoneTest {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="小米";
        p.price=1999.91;

        p.call();
        p.game();

        System.out.println(p.brand);
        System.out.println(p.price);

        Phone p1=new Phone();
        p.brand="苹果";
        p.price=5888.88;


        System.out.println(p.brand);
        System.out.println(p.price);
    }
}
