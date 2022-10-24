package com.xiaobo.lian;
import java.math.BigInteger;
import java.util.Scanner;
public class BigIntegerDmeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String str = Integer.toString(a);
        char ss[] = str.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] % 2 == 1) {
                ss[i] = '1';
            } else {
                ss[i] = '0';
            }
        }
        int sum=0;
        for (int i = 0; i < ss.length; i++) {
            sum=sum*10 +(ss[i]-'0');
        }
        System.out.println(sum);
    }
}
