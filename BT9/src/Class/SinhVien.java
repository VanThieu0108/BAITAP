package Class;

import java.util.Scanner;

public class SinhVien {
    protected String hoTen238;
    protected String maSV238;
    protected String ngaySinh238;
    protected String lop238;

    public SinhVien() {

    }

    public SinhVien(String hoTen238, String maSV238, String ngaySinh238, String lop238) {
        this.hoTen238 = hoTen238;
        this.maSV238 = maSV238;
        this.ngaySinh238 = ngaySinh238;
        this.lop238 = lop238;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen238 = sc.nextLine();

        System.out.print("\tNhap ma sinh vien: ");
        maSV238 = sc.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        ngaySinh238 = sc.nextLine();

        System.out.print("\tNhap lop: ");
        lop238 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen238);
        System.out.println("\tNgay sinh: " + ngaySinh238);
        System.out.println("\tMa sinh vien: " + maSV238);
        System.out.println("\tLop: " + lop238);
    }
}
