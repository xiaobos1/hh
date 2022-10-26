package com.xiaobo.lian;

public class Test005 {
    public static void main(String[] args) {
        int[] arr={3,56,43,23,45,7,8,97,345,67,2,10};

        //找到无序是哪一组是哪个索引开始的
        int startIndex=-1;
        for(int i=0;i<arr.length ;i++){
            if(arr[i]>arr[i+1]){
                startIndex=i+1;
                break;
            }
        }
        //从无序开始遍历
        for (int i = startIndex; i < arr.length; i++) {

            //记录当前索引
            int j=i;

            //插入排序
            while(j>0&& arr[j]<arr[j-1]){
                int tmp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
                j--;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
