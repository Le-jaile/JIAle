public class code30 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= 2 * i - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int y = 0; y <= 8 - 2 * i; y++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

