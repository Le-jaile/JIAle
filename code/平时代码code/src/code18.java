import java.util.Scanner;

public class code18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数");
        int m = sc.nextInt();
        int n = sc.nextInt();


        int a = 0;
        for (int i = 2; i < m && i < n; i++) {
            if (((m % i) == 0) && ((n % i) == 0)) {
                a = i;
            }
        }
        System.out.println(m + "和" + n + "最大公约数是");
    }
}
