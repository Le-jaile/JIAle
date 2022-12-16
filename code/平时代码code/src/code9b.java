public class code9b {
    public static void main(String[] args) {
        //99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%d * %d = %-2d " ,j ,i ,j * i);
            }
            System.out.println();
        }
    }
}
//*
//**
//***