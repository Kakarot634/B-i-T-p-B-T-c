package Bo_Tuc_Sinh_Vien_T3;
public class Bai_Tap_9___B5 {
    public static void main(String[] args) {
        String arrays [] = {"Vietel", "FPT", "VNPT", "Mobiphone", "Data"};
        duyetmangfor(arrays);
        duyetmangforeach(arrays);
    }


    public static void duyetmangfor(String arrays[]){
        System.out.println("Dùng vòng lặp for");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }


    public  static void duyetmangforeach(String arrays[]){
        System.out.println("Dùng vòng lặp foreach");
        for (String a: arrays) {
            System.out.println(a);
        }
    }
}
