public class code31 {
    public static void main(String[] args) {
        for (int x = 0; x <= 100; x++) {
            for (int y = 0;y <= 100; y++) {
                for (int z = 0; z <= 100; z++) {
                    if ((x + y + z == 100) && (5 * x + 3 * y + z / 3 == 100)) {
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        System.out.println("z = " + z);
                        System.out.println();
                    }
                }
            }
        }
    }
}