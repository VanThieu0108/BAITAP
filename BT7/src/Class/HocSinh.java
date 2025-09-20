package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
    private String lop238;
    private String khoHoc238;
    private String kyHoc238;

    public HocSinh() {
    }

    public HocSinh(String hoTen238, String lop238, String khoHoc238, String kyHoc238) {
        this.hoTen238 = hoTen238;
        this.lop238 = lop238;
        this.khoHoc238 = khoHoc238;
        this.kyHoc238 = kyHoc238;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap lop: ");
        lop238 = sc.nextLine();

        System.out.print("\tNhap khoa hoc: ");
        khoHoc238 = sc.nextLine();

        System.out.print("\tNhap ky hoc: ");
        kyHoc238 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tLop: " + lop238);
        System.out.println("\tKhoa hoc: " + khoHoc238);
        System.out.println("\tKy hoc: " + kyHoc238);
    }

    public String getLop() {
        return lop238;
    }
}
