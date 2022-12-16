package com.itheima.demo;

import java.util.Scanner;

public class StringExec2 {
    public static void main(String[] args) {
        //定义正确的登录名
        String okname = "admin";
        String okpassword = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.println("请输入登录名称");
            String name = sc.next();
            System.out.println("清理输入登录密码");
            String password = sc.next();


            //3.判断登录是否成功
            if (okname.equals(name)) {
                if (okpassword.equals(password)){
                    System.out.println("登录成功");
                    break;
                }else {
                    System.out.println("您的密码不正确 您害剩余" + (3 - i) + "次机会登录");
                }
            }else{
                System.out.println("您的登录名不正确 您害剩余" + (3 - i) + "次机会登录");

            }
        }
    }
}
