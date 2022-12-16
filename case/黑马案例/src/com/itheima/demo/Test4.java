package com.itheima.demo;

public class Test4 {
    public static void main(String[] args) {
        //数组元素的复制
        int[] arr1 = {11,12,24,54};
        int[] arr2 = new int[arr1.length];

        copy(arr1,arr2);

        arry(arr1);
        arry(arr2);

    }
    public static void arry(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
    public static void copy(int[] arr1 , int[]arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
