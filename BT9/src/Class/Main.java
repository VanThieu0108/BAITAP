package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc238 = new Scanner(System.in);
        QuanLy ql238 = new QuanLy();

        // Nhập danh sách thẻ mượn
        ql238.nhapDanhSach(sc238);

        // In danh sách sinh viên và sách cần trả cuối tháng
        System.out.println("\nDanh sach sinh vien can tra sach vao cuoi thang:");
        ql238.hienThiDanhSachTraCuoiThang();
    }
}
