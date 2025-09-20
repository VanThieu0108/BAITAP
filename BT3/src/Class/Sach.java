package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tacGia238;
    private int soTrang238;

    public Sach() {
    }

    public Sach(String maTaiLieu238, String tenNXB238, int soBanPhatHanh238, String tacGia238, int soTrang238) {
        super(maTaiLieu238, tenNXB238, soBanPhatHanh238);
        this.tacGia238 = tacGia238;
        this.soTrang238 = soTrang238;
    }

    public void nhapThongTin(Scanner sc238) {
        super.nhapThongTin(sc238);
        System.out.print("\tNhap tac gia: ");
        this.tacGia238 = sc238.nextLine();
        System.out.print("\tNhap so trang: ");
        this.soTrang238 = sc238.nextInt();
        sc238.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\ttac gia: " + this.tacGia238);
        System.out.println("\tSo trang: " + this.soTrang238);
    }
}
