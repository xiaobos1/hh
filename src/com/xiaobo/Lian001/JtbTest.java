package com.xiaobo.Lian001;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JtbTest {
    public static void main(String[] args) {
        JFrame jframe=new JFrame();
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

        //创建一个按键对象
        JButton jtb=new JButton("点我呀");
        //设置位置和高低
        jtb.setBounds(0,0,100,50);
        //给按键添加监听
        //jtb组件对象，表示你要给那个组件添加事件(动作监听鼠标左键点击，空格）
        //点击这个按键后触发要执行的代码

       //jtb.addActionListener(new MyActionListener());

        jtb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("达咩~不要点我");
            }
        });



        //添加到整个界面
        jframe.getContentPane().add(jtb);



        jframe.setVisible(true);
    }
}
