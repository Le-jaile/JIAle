package com.itheima.demo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //要求：判断101-200之间有多少个素数，并输出所有素数。
        //说明：素数是除了1和它本身以外，不能被其他正整数整除，就叫素数
        //分析，101-200之间的胡数据可以采用循环一次拿到；每一个数，判断该数是不是素数
        for (int i = 101; i <= 200; i++) {

            //信号位,标记
            boolean flag = true;//开始认为当前数据是素数


            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                   flag = false;
                   break;
                }
            }
            if (flag ){
                System.out.println(i + "\t");
            }
        }
    }
}
