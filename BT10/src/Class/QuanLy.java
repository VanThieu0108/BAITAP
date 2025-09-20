package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<BienLai> ds238;

    public QuanLy() {
        ds238 = new ArrayList<BienLai>(10);
    }

    public void themBienLai(BienLai bienLai238) {
        ds238.add(bienLai238);
    }

    public void nhapDanhSach(Scanner sc238) {
        BienLai bienLai238;
        System.out.print("Nhap vao so luong bien lai: ");
        int n238 = sc238.nextInt();
        sc238.nextLine();
        System.out.println("Nhap vao danh sach bien lai:");
        for (int i238 = 0; i238 < n238; i238++) {
            System.out.println("Bien lai thu " + (i238 + 1) + " la:");
            bienLai238 = new BienLai();
            bienLai238.nhapThongTin(sc238);
            themBienLai(bienLai238);
        }
    }

    public void hienThiDanhSach() {
        for (int i238 = 0; i238 < ds238.size(); i238++) {
            System.out.println("Bien lai thu " + (i238 + 1) + " la:");
            ds238.get(i238).hienThiThongTin();
            System.out.println();
        }
    }
}
