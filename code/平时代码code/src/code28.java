import java.util.Scanner;

public class code28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();

        int i = 1;
        int step = 1;
        do {
            step *= i;
            ++i;
        }while (i <= sc);
        System.out.println(step);
    }
}
