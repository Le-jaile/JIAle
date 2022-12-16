public class code2 {
    public static void main(String[] args) {
       number(1456);
        System.out.print("\r\n");
        number(4316);
        System.out.print("\r\n");
        number(12345);
    }
    public static int number(int a){
        System.out.println("万位是" + a/10000);
        System.out.println("千位是" + a/1000%10);
        System.out.println("百位是" + a / 100 % 10);
        System.out.println("十位是" + a/10%10);
        System.out.println("个位是" +a%10);
        return a;
    }
}
