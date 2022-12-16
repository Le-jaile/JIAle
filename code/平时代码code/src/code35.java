public class code35 {
    public static void main(String[] args) {
        int[] [] arr= new int[3][4];

        arr[0][0] = 0 ;
        arr[1][0] = 1 ;
        arr[1][1] = 2 ;

        arr[2][0] = 3 ;
        arr[2][1] = 4 ;
        arr[2][3] = 5 ;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(" arr [i][j] = " + arr[i][j]);
            }
        }
    }
}
