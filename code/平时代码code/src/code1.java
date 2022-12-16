public class code1 {
    public static void main(String[] args) {
        //同时满足条件，结果进行相加
        double a = 15.0;
        double b = 15.0;
        if (a >10.0 & b < 20.0){
            System.out.println(a + b);
        }else {
            System.out.println(a * b);
        }
        //同时不满足条件，结果进行相乘
        double i = 5.0;
        double j = 25.0;
        if (i >10.0 & j < 20.0){
            System.out.println(i + j);
        }else {
            System.out.println(i * j);
        }
        //一个不满足结果，结果进行相乘
         double k = 5.0;
        double l = 15.0;
        if (k >10.0 & l < 20.0){
            System.out.println(k + l);
        }else {
            System.out.println(k * l);
        }

    }
}
