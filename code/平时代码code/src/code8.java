import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一段数字");
        int score = sc.nextInt();//输入一段数字

        for (int i = 2; i <= score/2; i++) {//从2开始寻找数字，找到score停止
            if (score % i == 0) {//找到能被除尽的数字
                System.out.print( i + "*");//输出这些数字
                score = score / i;
                i = 2;//重新定义循环
            }
        }
        System.out.println(score);
    }
}
