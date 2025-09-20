package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc238 = new Scanner(System.in);
        KhuPho khuPho238 = new KhuPho();

        // Nhập danh sách hộ dân
        khuPho238.nhapDanhSach(sc238);

        System.out.println("\n--- Danh sach cac ho dan co nguoi 80 tuoi ---");
        // Hiển thị thông tin những hộ có người mừng thượng thọ
        khuPho238.timKiemThongTin();

        sc238.close();
    }
}
