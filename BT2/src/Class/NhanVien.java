package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec238;

    public NhanVien() {
    }

    public NhanVien(String hoTen238, String ngaySinh238, String gioiTinh238, String diaChi238, String congViec238) {
        super(hoTen238, ngaySinh238, gioiTinh238, diaChi238);
        this.congViec238 = congViec238;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap cong viec: ");
        congViec238 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCong viec: " + congViec238);
    }
}
