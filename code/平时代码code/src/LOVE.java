public class LOVE {
        public static void main(String[] args) throws InterruptedException  {
            int count = 0;
            for (float y = 2.5F; y > -2.0F; y -= .12F) {
                for (float x = -2.3f; x < 2.3f; x += 0.041f) {
                    float a = x * x + y * y - 4f;
                    if ((a * a * a - x * x * y * y * y) < -0.0f) {
                        String str = "LOVE LOVE !!!";

                        int num = count % str.length();
                        System.err.print(str.charAt(num));
                        count++;
                    } else {
                        System.err.print(" ");
                    }
                }
                System.err.println();
                Thread.sleep(100);
            }
        }
}
