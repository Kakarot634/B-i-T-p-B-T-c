package Bo_Tuc_Sinh_Vien_T5;

public class Bai_Tap_3 {
    public static void main(String[] args) {
        int [] numbers =  {1, 2, 4, 5, 6, 11, 22, 24, 55, 66};
        int minNumberInArray = findMinInArray(numbers);
        System.out.println("Min: " + minNumberInArray);
    }
    private static int findMinInArray(int[] inputArray){
        int min = inputArray[0];
        for (int i = 1; i < inputArray.length ; i++) {
            if (min > inputArray[i]){
                min = inputArray[i];
            }
        }
        return min;
    }
}
