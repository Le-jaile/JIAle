public class code9a {
    public static void main(String[] args) {
        //99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.printf("%d * %d = %-2d " ,j ,i ,j * i);
            }
            System.out.println();
        }
    }
}
//***
//**
//*