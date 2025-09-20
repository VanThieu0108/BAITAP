package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    // thuoc tinh
    private ArrayList<CBGV> ds238;

    // phuong thuc
    // ham khoi tao
    public QuanLy() {
        ds238 = new ArrayList<CBGV>(10);
    }

    // ham them can bo vao danh sach
    public void themCBGV(CBGV canBo238) {
        ds238.add(canBo238);
    }

    // ham nhap vao danh sach
    public void nhapDanhSach(Scanner sc) {
        CBGV canBo238;

        System.out.print("Nhap vao so luong can bo: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i = 0; i < n; i++) {
            System.out.println("Can bo thu " + (i + 1) + " la:");
            canBo238 = new CBGV();
            canBo238.nhapThongTin(sc);
            themCBGV(canBo238);
        }
    }

    // ham hien thi danh sach
    public void hienThiDanhSach() {
        for (CBGV cb238 : ds238) {
            cb238.hienThiThongTin();
        }
    }

    // ham tim kiem
    public void timKiem(double luong) {
        for (CBGV cb238 : ds238) {
            if (cb238.getLuongThucLinh() >= luong) {
                cb238.hienThiThongTin();
            }
        }
    }
}
