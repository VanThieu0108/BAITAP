package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc238 = new Scanner(System.in);
        QuanLy ql238 = new QuanLy();

        System.out.print("Nhap so luong ho su dung dien: ");
        int n238 = sc238.nextInt();
        sc238.nextLine();

        for (int i238 = 0; i238 < n238; i238++) {
            System.out.println("\nNhap thong tin cho ho thu " + (i238 + 1) + ":");
            BienLai bienLai238 = new BienLai();
            bienLai238.nhapThongTin(sc238);
            ql238.themBienLai(bienLai238);
        }

        System.out.println("\n--- Thong tin tat ca cac bien lai da nhap ---");
        ql238.hienThiDanhSach();
    }
}
