package com.xiaobo.heihei;

public class Main {
    public static void main(String[] args) {
        //原始数组
        int[][] arr=new int[11][11];
        //赋值
        arr[1][2]=1;
        arr[2][3]=2;

        //遍历二维数组，并获取其中不为零的个数
        int sum=0;
        for (int i = 0; i <11; i++) {
            for(int j=0;j<11;j++) {
                if (arr[i][j] != 0) {
                    sum++;
                }
            }
        }
        //创建稀疏数组
        int[][] sparseArr=new int[sum+1][3];

        //第一行的数据为 x y sum
        sparseArr[0][0]=11;
        sparseArr[0][1]=11;
        sparseArr[0][2]=sum;

        //遍历原始数组，获取为零值得坐标
        int count=0;
        for (int i = 0; i <11; i++) {
            for(int j=0;j<11;j++) {
                if (arr[i][j] != 0) {
                    count++;
                   sparseArr[count][0]=i;
                   sparseArr[count][1]=j;
                   sparseArr[count][2]=arr[i][j];
                }
            }
        }
        //遍历稀疏数组
        for (int i=0;i<sparseArr.length;i++){
            for(int j=0;j<3;j++){
                System.out.print(sparseArr[i][j]+" ");
            }
            System.out.println();
        }


        //还原原始数组
        int reventArr[][]=new int[sparseArr[0][0]][sparseArr[0][1]];

        for(int i=1;i<sparseArr.length;i++){
            reventArr[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(reventArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}