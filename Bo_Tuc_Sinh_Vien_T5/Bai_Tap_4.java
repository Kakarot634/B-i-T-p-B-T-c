package Bo_Tuc_Sinh_Vien_T5;
public class Bai_Tap_4 {
        public static void main(String[] args) {
            int number [] = {1,2,3,4,5,6,7,8,9};
            Duyetsonguyento(number);

        }
        public static boolean  Duyetsonguyento (int number []){
            for (int i = 2; i <number.length    ; i++) {
                if (number[i] % i == 0){

                    return false;

                }
            }
            return true;

        }
    }