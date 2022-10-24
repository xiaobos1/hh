package com.xiaobo.heihei;

import java.io.IOException;

public class Lian {
    public static void main(String[] args) throws IOException {
       int i= Math.abs(88);
        System.out.println(i);

        //System.out.println(Math.absExact(-2147483648));


        //进一法,想着正方向进一整数
        //Math.ceil()
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(-12.34));

        System.out.println("=================");
        //Math.floor()
        //向负无穷大方向进一整数
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(-12.34));

        System.out.println("====================="
        );
        //Math.round()四色五入
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.54));
        //System.out.println(Math.round(12.34));
        System.out.println("=================");
        //获取最大值
        System.out.println(Math.max(10,20));

        int i1 = 10 > 20 ? 10 : 20;
        System.out.println(i1);

        //指数
        System.out.println(Math.pow(2,3));

        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(4));

        //
     Runtime.getRuntime().exec("shutdown -a");
    }
}
