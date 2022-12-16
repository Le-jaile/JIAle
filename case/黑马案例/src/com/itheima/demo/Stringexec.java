package com.itheima.demo;

import java.util.Random;

public class Stringexec {
    public static void main(String[] args) {

        //1.定义可能出现的字符信息
        String datas = "dfadhsfuhaoihbcixhciowuhegroiu13987416yfqwhef871rg987qwdfsg1987ftwd9fg17";

        //2.循环5次,每次生成一个随机的索引.提取对应的字符链接起来即可
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int i1 = r.nextInt(datas.length());
            char c = datas.charAt(i1);
            code += c ;
        }
        //3.输出字符串变量
        System.out.println(code);
    }
}
