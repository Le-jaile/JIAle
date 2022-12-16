public class code4 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1000000; i < 10000000; i++) {
            int bai = i / 100;
            int shi = i / 10 % 10;
            int ge = i % 10;
            //每位数的三次幂=它本身
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println("水仙花数为:" + i);
                n++;
            }
        }
        System.out.println("找到的水仙花数有" + n + "个");
    }
}
