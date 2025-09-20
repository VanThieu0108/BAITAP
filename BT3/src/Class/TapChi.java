package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh238;
    private int thangPhatHanh238;

    public TapChi() {
    }

    public TapChi(String maTaiLieu238, String tenNXB238, int soBanPhatHanh238, int soPhatHanh238, int thangPhatHanh238) {
        super(maTaiLieu238, tenNXB238, soBanPhatHanh238);
        this.soPhatHanh238 = soPhatHanh238;
        this.thangPhatHanh238 = thangPhatHanh238;
    }

    public void nhapThongTin(Scanner sc238) {
        super.nhapThongTin(sc238);
        System.out.print("\tNhap so phat hanh: ");
        this.soPhatHanh238 = sc238.nextInt();
        System.out.print("\tNhap thang phat hanh: ");
        this.thangPhatHanh238 = sc238.nextInt();
        sc238.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phat hanh: " + this.soPhatHanh238);
        System.out.println("\tThang phat hanh: " + this.thangPhatHanh238);
    }
}
