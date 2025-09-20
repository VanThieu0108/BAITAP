package Class;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen238;
    protected String ngaySinh238;
    protected String queQuan238;

    public Nguoi() {
    }

    public Nguoi(String hoTen238, String ngaySinh238, String queQuan238) {
        this.hoTen238 = hoTen238;
        this.ngaySinh238 = ngaySinh238;
        this.queQuan238 = queQuan238;
    }

    public void nhapThongTin(Scanner sc238) {
        System.out.print("\tNhap ho ten: ");
        hoTen238 = sc238.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        ngaySinh238 = sc238.nextLine();
        System.out.print("\tNhap que quan: ");
        queQuan238 = sc238.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen238);
        System.out.println("\tNgay sinh: " + ngaySinh238);
        System.out.println("\tQue quan: " + queQuan238);
    }
}
