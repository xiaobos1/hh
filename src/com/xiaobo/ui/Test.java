package com.xiaobo.ui;

import com.xiaobo.Lian001.MyActionListener;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //创建一个游戏界面
        //javabean类描述
        //属性（宽，高） //行为set
        JFrame gamejFrame = new JFrame();
        gamejFrame.setSize(603,680);
        gamejFrame.setVisible(true);

        //创建一个登录界面
        JFrame loginJframe=new JFrame();
        loginJframe.setSize(488,430);
        loginJframe.setVisible(true);

        //创建一个注册界面
        JFrame registerJFrame=new JFrame();
        registerJFrame.setSize(488,500);
        registerJFrame.setVisible(true);

        //创建一个按键对象
        JButton jtb=new JButton("点我呀");
        //设置位置和高低
        jtb.setBounds(0,0,100,50);
        //给按键添加监听
        //jtb组件对象，表示你要给那个组件添加事件(动作监听鼠标左键点击，空格）
        //点击这个按键后触发要执行的代码
        jtb.addActionListener(new MyActionListener());
        //添加到整个界面


    }
}
