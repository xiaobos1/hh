package com.itheima.looppexdome1;

public class Test {
    public static void main(String[] args) {
        //布偶猫
        Ragdoll rd=new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catMouse();
        System.out.println("************************");
        //哈士奇
        Husky hh=new Husky();
        hh.breakHome();
        hh.drink();
        hh.eat();
        hh.lookHome();
    }
}
