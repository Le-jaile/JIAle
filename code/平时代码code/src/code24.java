
import java.util.Scanner;

public class code24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入日期");
        int day = scanner.nextInt();

        boolean leapYear = true;
        if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            leapYear = false;
        }

        int days = 0;

        switch (month - 1) {
            case 12:
                days += 31;
            case 11:
                days += 30;
            case 10:
                days += 31;
            case 9:
                days += 30;
            case 8:
                days += 31;
            case 7:
                days += 31;
            case 6:
                days += 30;
            case 5:
                days += 31;
            case 4:
                days += 30;
            case 3:
                days = days + 31;
            case 2:
                if (leapYear) {
                    days = days + 28;
                } else {
                    days = days + 29;
                }
            case 1:
                days = days + 31;
            case 0:
                days = days + 0;
        }

        days = days + day;
        System.out.println(year + "年" + month + "月" + day + "是第" + days + "天");

        while (days > 5) {
            days -= 5;
        }
        System.out.println(days);
        if (1 <= days && days <= 3) {
            System.out.println("渔夫在打渔");
        } else {
            System.out.println("渔夫在晒网");
        }

    }
}
