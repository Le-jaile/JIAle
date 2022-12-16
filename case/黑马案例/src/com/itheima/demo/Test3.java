package com.itheima.demo;

import java.util.Random;

public class Test3 {
    //开发一个验证码
    //需求:定义一个方法实现随机产生一个5位数的验证码
    public static void main(String[] args) {
        //分析:定义一个方法生成验证码

        //调用获取验证码的方法得到一个随机
        String code = createCode(5);
        System.out.println("随机数验证码" +code);

    }
    public static String createCode (int n){
        String code = " ";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //生成一个随机字符
            int type = r.nextInt(3);
            switch (type){
                case  0:
                    //大写字母A65-Z 65+25)
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    char ch2 = (char) (r.nextInt(97) + 25);
                    code += ch2;
                    break;
                case 2:
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
