package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung238;
    private double thuong238;
    private double phat238;
    private double luongThucLinh238;

    public CBGV() {
    }

    public void nhapThongTin(Scanner sc238) {
        super.nhapThongTin(sc238);

        System.out.print("\tNhap luong cung: ");
        luongCung238 = sc238.nextDouble();
        sc238.nextLine();

        System.out.print("\tNhap thuong: ");
        thuong238 = sc238.nextDouble();
        sc238.nextLine();

        System.out.print("\tNhap phat: ");
        phat238 = sc238.nextDouble();
        sc238.nextLine();

        luongThucLinh238 = luongCung238 + thuong238 - phat238;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tLuong cung: " + luongCung238);
        System.out.println("\tThuong: " + thuong238);
        System.out.println("\tPhat: " + phat238);
        System.out.println("\tLuong thuc linh: " + luongThucLinh238);
    }

    public double getLuongThucLinh() {
        return luongThucLinh238;
    }
}
