import java.util.Scanner;

public class code19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int i = 0;
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                break;
            }
        }
        if (i == a) {
            System.out.println(a + "是素数");
        } else {
            System.out.println(a + "不是素数");
        }
    }
}
