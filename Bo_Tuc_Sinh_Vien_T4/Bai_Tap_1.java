package Bo_Tuc_Sinh_Vien_T4;

import java.util.Scanner;

public class Bai_Tap_1 {
//Bài 1
 public static void main(String[] args) {
        int [] numbers;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng ");
        size = sc.nextInt();
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nhập từng giá trị:" + i);
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        duyetmangforeach(numbers);
        timgiatrilonnhat(numbers);
//Bài 2
        int result = sum(numbers);
        System.out.println("Tổng các phần tử trong mảng: ");
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
//Bài 3
    public static void duyetmangforeach(int numbers[]) {
    for (int a: numbers
         ) {
        System.out.println("Phần tử trong mảng là" +a);
    }
 }
//Bài 4
     public static void timgiatrilonnhat(int numbers [] ) {
     int max = 0;
         for (int num: numbers
              ) {
             if (num > max) {
                 max = num;
             }
         }
         System.out.println("Giá trị lớn nhất là: " + max);
}
}
