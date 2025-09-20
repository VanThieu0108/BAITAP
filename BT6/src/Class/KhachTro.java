package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
    private int soNgayTro238;
    private String loaiPhong238;
    private double giaPhong238;

    public KhachTro() {
    }

    public KhachTro(String hoTen238, int CMND238, int soNgayTro238, String loaiPhong238, double giaPhong238) {
        this.hoTen238 = hoTen238;
        this.CMND238 = CMND238;
        this.soNgayTro238 = soNgayTro238;
        this.loaiPhong238 = loaiPhong238;
        this.giaPhong238 = giaPhong238;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap so ngay tro: ");
        this.soNgayTro238 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap loai phong: ");
        this.loaiPhong238 = sc.nextLine();
        System.out.print("\tNhap gia phong: ");
        this.giaPhong238 = sc.nextDouble();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo ngay tro: " + this.soNgayTro238);
        System.out.println("\tLoai phong: " + this.loaiPhong238);
        System.out.println("\tGia phong: " + this.giaPhong238);
    }

    public int getSoNgayTro() {
        return this.soNgayTro238;
    }

    public double getGiaPhong() {
        return this.giaPhong238;
    }
}
