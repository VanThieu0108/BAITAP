package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc238 = new Scanner(System.in);
        KhachSan ks238 = new KhachSan();

        // 1. Nhập danh sách khách trọ
        ks238.nhapDanhSach238(sc238);

        // 2. Hiển thị danh sách khách trọ
        System.out.println("\n=== DANH SÁCH KHÁCH TRỌ ===");
        ks238.hienThiDanhSach238();

        // 3. Tính tiền trả phòng theo CMND
        System.out.print("\nNhap CMND khach can tinh tien: ");
        int cmnd238 = sc238.nextInt();
        double tien238 = ks238.tinhTien238(cmnd238);

        if (tien238 > 0) {
            System.out.println("So tien phai tra: " + tien238);
        } else {
            System.out.println("Khong tim thay khach voi CMND nay!");
        }

        sc238.close();
    }
}
