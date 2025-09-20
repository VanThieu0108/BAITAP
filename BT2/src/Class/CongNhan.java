package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
    // thuoc tinh
    private String bac238;

    // phuong thuc
    // ham khoi tao khong doi so
    public CongNhan() {

    }

    // ham khoi tao co doi so
    public CongNhan(String hoTen238, String ngaySinh238, String gioiTinh238, String diaChi238, String bac238) {
        super(hoTen238, ngaySinh238, gioiTinh238, diaChi238);
        this.bac238 = bac238;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap bac: ");
        bac238 = sc.nextLine();
    }

    // ham hien thi thong tin
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tBac: " + bac238);
    }
}
