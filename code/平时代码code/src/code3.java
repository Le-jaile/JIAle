public class code3 {
    public static void main(String[] args) {
        int num = 1000;
        int a[] = new int[3];
        System.out.print("3位的水仙花数有：\t");
        while (num <= 1000) {
            int sum = 0;
            a[0] = num / 100 % 10;
            a[1] = num / 10 % 10;
            a[2] = num % 10;
            for (int i = 0; i < 3; i++) {
                sum = sum + (int) Math.pow(a[i], 3);
            }
            if (num == sum) {
                System.out.print(num + "\t");
            }
            num++;
        }
    }

}


