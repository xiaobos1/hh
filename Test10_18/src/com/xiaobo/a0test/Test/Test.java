package com.xiaobo.a0test.Test;

public class Test {
    public static void main(String[] args) {
        PingPangSporter man=new PingPangSporter("马龙",30);
        System.out.println(man.getName()+","+man.getAge());
        man.speakEnglish();
    }
}
