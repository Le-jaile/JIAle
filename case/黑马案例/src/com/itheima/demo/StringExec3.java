package com.itheima.demo;

import java.util.Scanner;

//手机号的屏蔽
public class StringExec3 {
    public static void main(String[] args) {
        //1.键盘录入一个手机号码
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入手机号码");
        String tel = sc.next();

        String before = tel.substring(0,3); // 0  1  2
        String after =  tel.substring(7);
        String s = before + "****" + after;
        System.out.println(s);
    }
}
