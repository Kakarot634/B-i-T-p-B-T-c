package Bo_Tuc_Sinh_Vien_T3;

public class Bai_Tap_9____B3 {
    public static void main(String[] args) {
        int numbers [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        duyetmangfor(numbers);
        duyetmangforeach(numbers);
    }

    public static void duyetmangfor(int numbers []){
        System.out.println("Duyệt mảng for");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    public static void duyetmangforeach(int numbers []){
        System.out.println("Duyệt mảng foreach");
        for (int a: numbers) {
            System.out.println(a);
        }
    }
}
