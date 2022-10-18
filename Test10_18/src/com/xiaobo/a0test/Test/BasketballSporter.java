package com.xiaobo.a0test.Test;

import javax.swing.plaf.PanelUI;

public class BasketballSporter extends Sporter{

    //篮球运动员
    public BasketballSporter(){}
    public BasketballSporter(String name,int age){
        super(name,age);
    }
    @Override
    public void study() {
        System.out.println("蓝球运动员在练习如何打篮球");
    }
}
