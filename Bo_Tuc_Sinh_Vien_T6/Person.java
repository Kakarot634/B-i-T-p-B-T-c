package Bo_Tuc_Sinh_Vien_T6;

public class Person {
    private String Ten;

    private String Gioitinh;

    private int Tuoi;

    private String Lop;

    public Person(String Ten, String GioiTinh, int Tuoi, String Lop) {
        this.Ten = Ten;
        this.Gioitinh = GioiTinh;
        this.Tuoi = Tuoi;
        this.Lop = Lop;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getTen() {
        return Ten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public String getLop() {
        return Lop;
    }

    public void showInformationUser() {
        System.out.println("Ten la: " + Ten + " - Gioi tinh: " + Gioitinh + " - Tuoi: " + Tuoi + " - Lop: " + Lop);
    }
}
class Information{
    public static void main(String[] args) {
        Person p1 = new Person("NguyenQuocTrung", "Nam",18, "IBSK1D2");
        Person p2 = new Person("Kakarot","Nam",30,"Saiyan");
        p1.showInformationUser();
        p2.showInformationUser();
    }
}

