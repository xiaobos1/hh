package com.itheima.test;

public class My {
    public static void main(String[] args) {
        MyGirl g=new MyGirl();
        g.name="狗娃";
        g.age=18;
        g.gender="萌妹子";

        System.out.println(g.name);
        System.out.println(g.age);
        System.out.println(g.gender);
        System.out.println("她喜欢干什么");
        g.eat();
        g.sleep();

        System.out.println("==================");
        System.out.println("第二个女朋友");
        MyGirl g2=new MyGirl();
        g.name="雨桐";
        g.age=24;
        g.gender="御姐";
        System.out.println(g.name);
        System.out.println(g.age);
        System.out.println(g.gender);
    }
}
