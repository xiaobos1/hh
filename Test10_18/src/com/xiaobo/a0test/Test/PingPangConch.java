package com.xiaobo.a0test.Test;

public class PingPangConch extends Conch implements English{

    public PingPangConch(){}

    public PingPangConch(String name,int age){
        super(name,age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球运动员如何打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("教乒乓球运动员说英语");
    }
}
