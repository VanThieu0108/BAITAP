package Class;

import java.util.Scanner;

public class CanBo {
    // thuoc tinh
    private String hoTen238;
    private String ngaySinh238;
    private String gioiTinh238;
    private String diaChi238;

    // phuong thuc
    // ham khoi tao khong doi so
    public CanBo() {

    }

    // ham khoi tao co doi so
    public CanBo(String hoTen238, String ngaySinh238, String gioiTinh238, String diaChi238) {
        this.hoTen238 = hoTen238;
        this.ngaySinh238 = ngaySinh238;
        this.gioiTinh238 = gioiTinh238;
        this.diaChi238 = diaChi238;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen238 = sc.nextLine();
        System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
        ngaySinh238 = sc.nextLine();
        System.out.print("\tNhap gioi tinh: ");
        gioiTinh238 = sc.nextLine();
        System.out.print("\tNhap dia chi: ");
        diaChi238 = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen238);
        System.out.println("\tNgay sinh: " + ngaySinh238);
        System.out.println("\tGioi tinh: " + gioiTinh238);
        System.out.println("\tDia chi: " + diaChi238);
    }

    // ham lay thong tin ho ten
    public String getHoTen238() {
        return this.hoTen238;
    }
}
