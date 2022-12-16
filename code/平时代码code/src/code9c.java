public class code9c {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %-2d " ,j ,i ,j * i);
            }
            System.out.printf("%c" ,'\n');
        }
    }
}
