package com.xiaobo.Lian001;

import java.util.Random;

public class ArrTest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        //随机
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int index=r.nextInt(arr.length);
            int tmp=arr[i];
            arr[i]=arr[index];
            arr[index]=tmp;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //创建二维数组和赋值
        int[][] data=new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            data[i/4][i%4]=arr[i];
        }

        //遍历二维数组
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
