package Bo_Tuc_Sinh_Vien_T5;

import java.util.Scanner;

public class Bai_Tap_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = {1, 2, 4, 5, 6, 11, 33, 24, 55, 66};
        System.out.println("Nhập vào số nguyên tố muốn kiểm tra trong mảng: ");
        int inputnumber = scanner.nextInt();
        boolean result = checkIsNumberExistInArray(numbers, inputnumber);
        if(result){
            System.out.println(inputnumber + "Có tồn tại trong mảng");
        } else {
            System.out.println(inputnumber + "Ko tồn tại trong mảng");
        }
    }
    private static boolean checkIsNumberExistInArray(int[] inputArray, int inputnumber){
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == inputnumber){
                return true;
            }
        }
        return false;
    }
}
