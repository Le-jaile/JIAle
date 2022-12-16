import java.util.Scanner;

public class code22 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入日期");
        int day = scanner.nextInt();

        boolean leapYear = false;
        if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            leapYear = true;
        }

        int days = 0;

        switch (month) {
            case 1:
                days = days + 0;
        }

        days = days + day;
        System.out.println(year + "年" + month + "月" + day + "是第" + days + "天");
    }

}
