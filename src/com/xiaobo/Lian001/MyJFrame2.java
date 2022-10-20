package com.xiaobo.Lian001;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame2 extends JFrame implements KeyListener {
    public MyJFrame2() {

    JFrame jframe = new JFrame();
        //设置界面宽高
        jframe.setSize(603,680);
        //设置界面的标题
        jframe.setTitle("事件演习");
        //设置界面置顶
        jframe.setAlwaysOnTop(true);
         //设置界面居中
        jframe.setLocationRelativeTo(null);
        //设置关闭设置
        jframe.setDefaultCloseOperation(3);
        //取消默认居中设置
        jframe.setLayout(null);

        //键盘监听测试,实现快捷键
        this.addKeyListener(this);


        jframe.setVisible(true);
}


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        int code = e.getKeyCode();
        if (code==65) {
            System.out.println("现在按得是A");
        }else if(code==66){
            System.out.println("现在按得是B");
        }
        System.out.println(code);

    }
}
