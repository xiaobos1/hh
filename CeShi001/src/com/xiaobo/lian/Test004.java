package com.xiaobo.lian;

public class Test004 {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,3,6,7,8,9};
        int n=arr.length-1;
        while(true) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            n--;
            if(n==0){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
