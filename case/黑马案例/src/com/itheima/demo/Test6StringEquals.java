package com.itheima.demo;

import java.util.Scanner;

public class Test6StringEquals {
    public static void main(String[] args) {
        //1:正确登录名和密码
        String okName = "le123654";
        String okPassword = "123456";

        //2:请您输入登录名称和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("登录名称");
        String name = sc.next();
        System.out.println("登录密码");
        String password = sc.next();

        //3:判断用户输入的登录名称和密码与正确的内容是否相等.
        if (okName.equals(name) && okPassword.equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("用户名或者密码错误了");
        }
    }
}
