package Class;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc238 = new Scanner(System.in);
        QLCB qlcb238 = new QLCB();

        // Nhập danh sách cán bộ
        qlcb238.nhapDanhSach(sc238);

        // Tìm kiếm theo tên
        System.out.print("\nNhap ten can tim: ");
        String ten238 = sc238.nextLine();

        System.out.println("\nKet qua tim kiem:");
        qlcb238.timKiemCanBo(ten238);

        sc238.close();
    }
}
