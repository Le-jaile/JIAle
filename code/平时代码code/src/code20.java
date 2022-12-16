import java.util.Scanner;


public class code20 {
    public static void main(String[] args) {
//        判断一个数是否为素数
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数");
        int b = scanner.nextInt();


        boolean isPrime = false;
        for (int a = 2; a < b; a++) {
            if (b % a == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }
    }
}