import javax.swing.*;
import java.util.Scanner;

public class code34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入人数:");
        int a = sc.nextInt();

        int[] scores = new int[a];

        System.out.println("输入学生的成绩,每个成绩占一行");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();


        }
        int max = 0;
        for (int score : scores) {
            if (score > max) {
                max = score;
            }

            System.out.println("max = " + max);
        }
        for (int score : scores) {
            if (score >= max - 10) {
                System.out.println(score + "对应的等级是:A");
            } else {
                if (score >= max - 20) {
                    System.out.println(score + "对应的等级是:B");
                } else {
                    if (score >= max - 30) {
                        System.out.println(score + "对应的等级是:C");
                    } else {
                        System.out.println(score + "对应的等级是:D");
                    }
                }
            }
        }
    }
}
