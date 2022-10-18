package com.xiaobo.a0test.Test;

public class BasketballConch extends Conch{
    public BasketballConch(){}
    public BasketballConch(String name,int age){
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println("教篮球教练教如何打篮球");
    }
}
