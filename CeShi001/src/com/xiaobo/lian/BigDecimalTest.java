package com.xiaobo.lian;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b =new BigDecimal(0.1);
        BigDecimal b1=new BigDecimal("0.01");
        BigDecimal b2=new BigDecimal("0.09");
        BigDecimal b3=b1.add(b2);
        //System.out.println(b3);

        //BigDecimal
        BigDecimal b4=BigDecimal.valueOf(10);
        //System.out.println(b4);


        BigDecimal bd1=new BigDecimal(10.0);
        BigDecimal bd2=new BigDecimal(0.2);

        //BigDecimal 加法
        BigDecimal bd3 = bd1.add(bd2);

        //BigDecimal 减法
        BigDecimal bd4=bd1.subtract(bd2);

        //BigDecimal 乘法
        BigDecimal bd5=bd1.multiply(bd2);



        double a=0.9;
        double r=4.0;
        double s=a+r;
        System.out.println(s);
    }

}
