package Class;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao238;

    public KySu() {
    }

    public KySu(String hoTen238, String ngaySinh238, String gioiTinh238, String diaChi238, String nganhDaoTao238) {
        super(hoTen238, ngaySinh238, gioiTinh238, diaChi238);
        this.nganhDaoTao238 = nganhDaoTao238;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap nganh dao tao: ");
        nganhDaoTao238 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: " + nganhDaoTao238);
    }
}
