package Class;

import java.util.Scanner;

public class ThiSinh {
    private int soBD;
    private String hoTen;
    private String diaChi;
    private String dienUuTien;

    public ThiSinh() {
    }

    public ThiSinh(int soBD238, String hoTen238, String diaChi238, String dienUuTien238) {
        this.soBD = soBD238;
        this.hoTen = hoTen238;
        this.diaChi = diaChi238;
        this.dienUuTien = dienUuTien238;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap so bao danh: ");
        soBD = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("\tNhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("\tNhap dien uu tien: ");
        dienUuTien = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tSo bao danh: " + soBD);
        System.out.println("\tHo ten: " + hoTen);
        System.out.println("\tDia chi: " + diaChi);
        System.out.println("\tDien uu tien: " + dienUuTien);
    }

    public int getSoBD() {
        return soBD;
    }
}
