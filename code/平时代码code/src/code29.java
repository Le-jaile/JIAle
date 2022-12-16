public class code29 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println("i =" + i);
                break;//break   :  跳出并结束当前所在循环的执行。

            }
        }
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                continue;//continue:  用于跳出当前循环的当次执行，进入下一次循环。
            }
            System.out.println("i = " + i);
        }
    }
}
