package Class;

import java.util.Scanner;

public class KhachHang {
    protected String tenChuHo238;
    protected int soNha238;
    protected String maCongTo238;

    public KhachHang() {

    }

    public KhachHang(String tenChuHo238, int soNha238, String maCongTo238) {
        this.tenChuHo238 = tenChuHo238;
        this.soNha238 = soNha238;
        this.maCongTo238 = maCongTo238;
    }

    public void nhapThongTin(Scanner sc238) {
        System.out.print("\tNhap ten chu ho: ");
        tenChuHo238 = sc238.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha238 = sc238.nextInt();
        sc238.nextLine();
        System.out.print("\tNhap ma cong to: ");
        maCongTo238 = sc238.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tTen chu ho: " + tenChuHo238);
        System.out.println("\tSo nha: " + soNha238);
        System.out.println("\tMa cong to: " + maCongTo238);
    }
}
