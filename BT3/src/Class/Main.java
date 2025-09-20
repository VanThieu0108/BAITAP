package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach qls = new QuanLySach();

        // 1. Nhập danh sách tài liệu
        System.out.println("=== NHAP DANH SACH TAI LIEU ===");
        qls.nhapDanhSachTL(sc);

        int choice;
        do {
            System.out.println("\n===== MENU TIM KIEM =====");
            System.out.println("1. Tim tai lieu theo ma");
            System.out.println("2. Tim tai lieu theo loai");
            System.out.println("3. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma tai lieu can tim: ");
                    String ma = sc.nextLine();
                    qls.timMaTL(ma);
                    break;
                case 2:
                    System.out.print("Nhap loai (Sach/TapChi/Bao): ");
                    String loai = sc.nextLine();
                    qls.timLoaiTL(loai);
                    break;
                case 3:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 3);

        sc.close();
    }
}
