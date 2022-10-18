package com.xiaobo.a0test.Test;

public abstract class Conch extends Person {
    //教练
    public Conch(){}

    public Conch(String name,int age){
        super(name,age);
    }
    public abstract void teach();
}
