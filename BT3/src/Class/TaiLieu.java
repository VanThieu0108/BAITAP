package Class;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu238;
    private String tenNXB238;
    private int soBanPhatHanh238;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu238, String tenNXB238, int soBanPhatHanh238) {
        this.maTaiLieu238 = maTaiLieu238;
        this.tenNXB238 = tenNXB238;
        this.soBanPhatHanh238 = soBanPhatHanh238;
    }

    public void nhapThongTin(Scanner sc238) {
        System.out.print("\tNhap ma tai lieu: ");
        this.maTaiLieu238 = sc238.nextLine();
        System.out.print("\tNhap ten nha xuat ban: ");
        this.tenNXB238 = sc238.nextLine();
        System.out.print("\tNhap so ban phat hanh: ");
        this.soBanPhatHanh238 = sc238.nextInt();
        sc238.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tMa tai lieu: " + this.maTaiLieu238);
        System.out.println("\tTen nha xuat ban: " + this.tenNXB238);
        System.out.println("\tSo ban phat hanh: " + this.soBanPhatHanh238);
    }

    public String getMaTaiLieu238() {
        return this.maTaiLieu238;
    }
}
