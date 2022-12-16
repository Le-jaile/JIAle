public class code9 {
    public static void main(String[] args) {
        //99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int k = 0; k <= i - 2; k++) {
                System.out.print("        ");
            }
            for (int j = i; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }

            System.out.println();
        }
    }
}
//***
// **
//  *
