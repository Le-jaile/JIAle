import java.util.Arrays;

public class code7 {
    public static void main(String[] args) {
        int o = 10;
        for (int i = 0; i < o; i++) {
            int number = 1;
            System.out.format("%" + (o - i) * 2 +"s","");
            System.out.println( "\t" );
            for (int x = 1; x <= 10-i ; x++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.format("%4d",number);
                number = number * (i - j ) / (j + 1);
            }
        }
        System.out.println();
    }
}
