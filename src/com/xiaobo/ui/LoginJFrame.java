package com.xiaobo.ui;

import javax.swing.*;
import java.awt.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("登录 界面");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //打开设置
        this.setVisible(true);
    }
}
