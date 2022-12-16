import com.sun.security.jgss.GSSUtil;

public class code27 {
    public static void main(String[] args) {
        int i = 1;
        int add = 0;
        int count = 0;
        do {
            if (i % 7 == 0) {
                add += i;
                ++count;
            }
            ++i;
        } while (i <= 100);
        System.out.println(add);
        System.out.println(count);
    }
}
