package com.xiaobo.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {
    int[][] data=new int[4][4];
    int x=0;
    int y=0;

    String path="image//girl//girl5//";
    public GameJFrame(){
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();
        //初始化数据打乱
        initData();
        //初始化图片
        initImage();




        //显示出来写到最后面
        this.setVisible(true);
    }
//初始化数组
    private void initData(){
        int[] arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //随机
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int index=r.nextInt(arr.length);
            int tmp=arr[i];
            arr[i]=arr[index];
            arr[index]=tmp;
        }
//        //遍历
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        //创建二维数组和赋值
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                x=i/4;
                y=i%4;
            }else{
                data[i/4][i%4]=arr[i];
            }
        }

//        //遍历二维数组
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(data[i][j]+" ");
//            }
//            System.out.println();
//        }
    }

//图片初始化
    private void initImage() {

        this.getContentPane().removeAll();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //内循环每行添加四个图片

                //获取加载的图片
                int num=data[i][j];
                //创建一个图片ImageIcon对象
                //创建一个JLabel的对象（管理容器）+
                JLabel jLabel=new JLabel(new ImageIcon("F:\\java代码\\Game_pingtu\\image\\girl\\girl5\\"+num+".jpg"));
                //图片位置
                jLabel.setBounds(105 * i+83,105*j+134,105,105);
                //图片添加边框、
                jLabel.setBorder(new BevelBorder(1));
                //添加
                this.getContentPane().add(jLabel);
//                //添加一次number+1
//                number++;
            }
        }
        //添加背景图片
        JLabel bg=new JLabel(new ImageIcon("F:\\java代码\\Game_pingtu\\image\\background.png"));
        bg.setBounds(40,40,508,560);
        this.getContentPane().add(bg);

        //刷新一下界面
        this.getContentPane().repaint();
//        for (int i = 0; i < 4; i++) {
//
//            //创建一个图片ImageIcon对象
//            //创建一个JLabel的对象（管理容器）
//            JLabel jLabel=new JLabel(new ImageIcon("F:\\java代码\\Game_pingtu\\image\\girl\\girl2\\1.jpg"));
//            //图片位置
//            jLabel.setBounds(105 * i,0,105,105);
//            //添加
//            this.getContentPane().add(jLabel);
//
//        }
//        //创建一个图片ImageIcon对象
//        ImageIcon icon=new ImageIcon("F:\\java代码\\Game_pingtu\\image\\girl\\girl2\\3.jpg");
//        //创建一个JLabel的对象（管理容器）
//        JLabel jLabel=new JLabel(icon);
//        //图片位置
//        jLabel.setBounds(0,0,105,105);
//        //添加
//        this.getContentPane().add(jLabel);
//
//        //创建一个图片ImageIcon对象
//        ImageIcon icon1=new ImageIcon("F:\\java代码\\Game_pingtu\\image\\girl\\girl2\\1.jpg");
//        //创建一个JLabel的对象（管理容器）
//        JLabel jLabel1=new JLabel(icon1);
//        //图片位置
//        jLabel1.setBounds(0,105,105,105);
//        //添加
//        this.getContentPane().add(jLabel1);

//        //把管理容器添加到界面中
//        this.getContentPane().add(jLabel);
//        ////创建一个JLabel1的对象（管理容器）
//        JLabel jLabel1=new JLabel(new ImageIcon("F:\\java代码\\Game_pingtu\\image\\girl\\girl2\\1.jpg"));
//        //图片位置
//        jLabel.setBounds(0,105,105,105);
//        //添加到界面
//        this.getContentPane().add(jLabel1);







    }

    private void initJMenuBar() {
        //初始化菜单
        //创建菜单对象
        JMenuBar jMenuBar=new JMenuBar();

        //创建菜单的俩个选项(功能，关于我们)
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem replayItem=new JMenuItem("重新游戏");
        JMenuItem reLoginItem=new JMenuItem("重新登录");
        JMenuItem closeItem=new JMenuItem("关闭游戏");

        JMenuItem accountItem=new JMenuItem("公众号");

        //将每个选项条目对象加入选项中
        //功能
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        //关于我们
        aboutJMenu.add(accountItem);

        //将菜单里面的俩个选项加入菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        //给界面设置菜单
        this.setJMenuBar(jMenuBar);

    }

    //界面初始化
    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图小游戏 V1.0");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //取消界面居中显示
        this.setLayout(null);

        //给图片添加一个键盘监听
        this.addKeyListener(this);
    }

    //按下不松会调用
    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            //加载一张完整图片
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            //加载
            //添加背景图片
            JLabel bg = new JLabel(new ImageIcon("F:\\java代码\\Game_pingtu\\image\\background.png"));
            bg.setBounds(40, 40, 508, 560);
            this.getContentPane().add(bg);

            //刷新
            this.getContentPane().repaint();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        //对上下左右进行判断
        int  code = e.getKeyCode();
        if(code==40){
            if(y==3){
                return ;
            }
            System.out.println("向下移动");
            data[x][y]=data[x][y+1];
            data[x][y+1]=0;
            y++;
            initImage();
        }else if(code == 39){
            //空白方块数字向右移动
            if(x==3){
                return ;
            }
            System.out.println("向右移动");

            data[x][y]=data[x+1][y];
            data[x+1][y]=0;
            x++;
            initImage();
        }else if(code==38){
            if(y==0){
                return ;
            }
            System.out.println("向上移动");
            data[x][y]=data[x][y-1];
            data[x][y-1]=0;
            y--;
            initImage();
        }else if(code==37){
            if(x==0){
                return ;
            }
            System.out.println("向左移动");
            data[x][y]=data[x-1][y];
            data[x-1][y]=0;
            x--;
            initImage();
        }else if(code==65){
            initImage();
        }else if(code==87){
            data=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,8,11,12},
                    {13,14,15,0}
            };
           initImage();
            x=3;
            y=3;

        }
    }
}
