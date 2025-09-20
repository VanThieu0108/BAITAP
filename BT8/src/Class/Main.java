package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();

        // Nhập danh sách cán bộ
        ql.nhapDanhSach(sc);

        // In ra danh sách cán bộ có lương thực lĩnh >= 8 triệu
        System.out.println("\nDanh sach can bo co luong thuc linh >= 8 trieu:");
        ql.timKiem(8000000); // 8 triệu
    }
}
