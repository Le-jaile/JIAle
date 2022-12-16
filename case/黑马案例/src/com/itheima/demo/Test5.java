package com.itheima.demo;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        // 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        int[] scores = new int[6];
        //录入6个哦ing为分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入"+ (i+1)+"个评委的打分");
            int scors = sc.nextInt();
            //把这个数存入到数组中
            scores[i] = scors;


        }
        //统计分数,遍历数据,目的,找到每个数组的值
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >max){
                //替换最大值变量储存的数据
                max = scores[i];
                }
            if (scores[i]  < min){
                //替换最大值变量储存的数据
                min = scores[i];
                }
           //统计总分
            sum += scores[i];

        }
        System.out.println("最高峰是" + max);
        System.out.println("最低分是" + min);
        //统计平均分
        double result = (sum - max - min ) / (scores.length - 2);
        System.out.println("选手最终的得分是" + result);

    }
}
