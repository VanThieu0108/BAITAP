package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc238 = new Scanner(System.in);

        QLHS qlhs238 = new QLHS();

        // Nhập danh sách học sinh
        qlhs238.nhapDanhSachHS(sc238);

        System.out.println("\n=== Danh sach hoc sinh sinh nam 1985 va que o Thai Nguyen ===");
        qlhs238.timKiemThongTin(1985, "Thai Nguyen");

        System.out.println("\n=== Danh sach hoc sinh lop 10A1 ===");
        qlhs238.timKiemThongTin("10A1");

        sc238.close();
    }
}
