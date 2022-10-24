package com.xiaobo.heihei;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Myframe extends JFrame implements ActionListener {

    JButton yesBut=new JButton("帅爆了");
    JButton MidBut=new JButton("一般般");
    JButton noBut=new JButton("不帅，有点磕碜");

    JButton dadBut= new JButton("绕了我吧");
    //决定上方代码是否展示
    boolean flag=false;

    public Myframe(){
        initJframe();

        initView();

        this.setVisible(true);
    }

    private void initView() {
        this.getContentPane().removeAll();

        if(flag){
            //JButton dadBut= new JButton("绕了我吧");
            dadBut.setBounds(50,20,100,30);
            dadBut.addActionListener(this);
            this.getContentPane().add(dadBut);
        }


        JLabel text= new JLabel("你觉得自己帅吗？");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);

        yesBut.setBounds(200,200,100,30);
        MidBut.setBounds(200,250,100,30);
        noBut.setBounds(160,300,180,30);

        yesBut.addActionListener(this);
        MidBut.addActionListener(this);
        noBut.addActionListener(this);

        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(MidBut);
        this.getContentPane().add(noBut);
    }

    private void initJframe() {
        //设置宽高
        this.setSize(500,500);
        //设置标题
        this.setTitle("好兄弟");
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //取消默认布局
        this.setLayout(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj == yesBut){
            //System.out.println("你的好基友点击了帅爆了");
            showJDialog("xxx,你太自信了，电脑还有俩分钟关机");
            //惩罚
            try {
                Runtime.getRuntime().exec("shutdown -s -t 120");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag=true;
            initView();
        }else if(obj==MidBut){
            //System.out.println("你的好基友点击了一般");
            showJDialog("同学，你还是太自信了，四分钟后关机");
            //惩罚
            try {
                Runtime.getRuntime().exec("shutdown -s -t 240");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag=true;
            initView();
        }else if(obj==noBut){
            //System.out.println("你的好友点击了不帅");
            showJDialog("还算你有自知之明，半个小时后关机");
            //惩罚
            try {
                Runtime.getRuntime().exec("shutdown -s -t 1800");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag=true;
            initView();
        }else if(obj==dadBut){
            showJDialog("这次绕了你");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    public void showJDialog(String content){
        //创建弹窗对象
        JDialog jd=new JDialog();
        //设置弹窗大小
        jd.setSize(200,150);
        //让弹窗置顶
        jd.setAlwaysOnTop(true);
        //居中
        jd.setLocationRelativeTo(null);
        //弹窗不关闭永远无法执行下面的操作
        jd.setModal(true);
        //创建JLabel 对象管理文字并添加到弹框当中
        JLabel warning= new JLabel(content);
        warning.setBounds(10,0,200,100);
        jd.getContentPane().add(warning);

        //显示弹窗
        jd.setVisible(true);
    }
}
