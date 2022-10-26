package com.xiaobo.lian;

public class Test006 {
    public static void main(String[] args) {
        int ret=getSum(6);
        System.out.println(ret);
    }

    public static int getSum(int num){
        if(num==1) {
            return 1;
        }
        //递归方法
        //6*5!
        //6*5*4
        //...
        //6*5*4*3*2*1 到1停止
        return num*getSum(num-1);
    }

}
