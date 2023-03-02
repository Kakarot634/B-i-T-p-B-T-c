package Bo_Tuc_Sinh_Vien_T6;
import java.util.Scanner;
public class Bai_Tap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Nhập các phần từ trong mảng: \n");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử mảng: " + i + " = ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        sum1(array);
        sum2(array);
        tich(array);
    }
//Bài 2:
    public static void sum1(int[] array){
        int tong = 0;
        for (int i = 1; i < array.length; i+=2) {
            tong += array[i];
        }
        System.out.println("Tổng của hàm 1 3 5 7 9 là: " + tong);
    }
//Bài 3:
    public static void sum2(int[] array){
        int tong = 0;
        for (int i = 1; i < array.length; i+=2) {
            if (i == 5){
                continue;
            }
            tong += array[i];
        }
        System.out.println("Tổng của hàm 1 3 7 9 là: " + tong);
    }
//Bài 4:
    public static void tich(int[] array){
        int tich = 1;
        for (int i = 2; i < array.length ; i++) {
            tich = array[2] * array[4] * array[9];
        }
        System.out.println("Tích của hàm 2 4 9 là: " + tich);
    }
}
