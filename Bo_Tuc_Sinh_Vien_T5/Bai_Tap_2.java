package Bo_Tuc_Sinh_Vien_T5;

public class Bai_Tap_2 {
    public static void main(String[] args) {
        int [] numbers =  {1, 2, 4, 5, 6, 11, 22, 24, 55, 66};
        revertArray(numbers);
    }
    private static void revertArray(int[] inputArray){
        for (int i = inputArray.length - 1; i > 0 ; i--) {
            System.out.println(inputArray[i]);
        }
    }
}
