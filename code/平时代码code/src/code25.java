public class code25 {
    public static void main(String[] args) {
        int day = 10;
        int peach = 1;
        System.out.println("第" + day + "天早上的桃子数量是：" + peach);
        while (day > 1) {
            peach = (peach + 1) * 2;
            --day;
            System.out.println("第" + day + "天早上的桃子数量是：" + peach);
        }
    }
}
