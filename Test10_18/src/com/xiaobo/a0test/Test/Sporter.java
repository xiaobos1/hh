package com.xiaobo.a0test.Test;

public abstract class Sporter extends Person {
    //运动员
    public Sporter(){}
    public Sporter(String name, int age) {
        super(name,age);
    }//运动员
    public abstract void study();
}
