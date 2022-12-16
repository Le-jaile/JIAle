public class code26 {
    public static void main(String[] args) {
        int i = 1;
        int addsumjishu = 0;
        int addsumoushu = 0;
        do {
//            System.out.println(i);
            if (i % 2 == 1) {
                addsumjishu += i;
//                System.out.println(i);
            } else
                addsumoushu += i;
//                System.err.println(i);
            i++;
        } while (i <= 100);
        System.out.println("所有奇数和为:" + addsumjishu);
        System.out.println("所有偶数和为:" + addsumoushu);
    }
}
