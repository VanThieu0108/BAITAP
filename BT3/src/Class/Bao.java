package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh238;

    public Bao() {
    }

    public Bao(String maTaiLieu238, String tenNXB238, int soBanPhatHanh238, String ngayPhatHanh238) {
        super(maTaiLieu238, tenNXB238, soBanPhatHanh238);
        this.ngayPhatHanh238 = ngayPhatHanh238;
    }

    public void nhapThongTin(Scanner sc238) {
        super.nhapThongTin(sc238);
        System.out.print("\tNhap ngay phat hanh: ");
        this.ngayPhatHanh238 = sc238.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNgay phat hanh: " + this.ngayPhatHanh238);
    }
}
