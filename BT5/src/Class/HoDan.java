package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    private int soNguoi238;
    private int soNha238;
    private Nguoi[] list238;

    public HoDan() {
        list238 = new Nguoi[10];
    }

    public HoDan(String hoTen238, Date ngaySinh238, String ngheNghiep238, int soNguoi238, int soNha238) {
        super(hoTen238, ngaySinh238, ngheNghiep238);
        this.soNguoi238 = soNguoi238;
        this.soNha238 = soNha238;
    }

    public void nhapThongTin(Scanner sc238) {
        System.out.print("\tNhap so nguoi: ");
        soNguoi238 = sc238.nextInt();
        sc238.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha238 = sc238.nextInt();
        sc238.nextLine();
        System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
        for (int i = 0; i < soNguoi238; i++) {
            System.out.println("Nguoi thu " + (i + 1) + " la:");
            list238[i] = new Nguoi();
            list238[i].nhapThongTin(sc238);
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tSo nguoi: " + soNguoi238);
        System.out.println("\tSo nha: " + soNha238);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
        for (int i = 0; i < soNguoi238; i++) {
            System.out.println("Nguoi thu " + (i + 1) + " la:");
            list238[i].hienThiThongTin();
        }
    }

    public Nguoi[] getList238() {
        return list238;
    }

    public int getSoNguoi238() {
        return soNguoi238;
    }
}
