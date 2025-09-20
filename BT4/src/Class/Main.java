package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc238 = new Scanner(System.in);
        TuyenSinh ts238 = new TuyenSinh();
        int chon238;

        do {
            System.out.println("\n===== CHUONG TRINH TUYEN SINH =====");
            System.out.println("1. Nhap danh sach thi sinh");
            System.out.println("2. Hien thi danh sach thi sinh");
            System.out.println("3. Tim kiem thi sinh theo so bao danh");
            System.out.println("4. Thoat");
            System.out.print("Moi ban chon: ");
            chon238 = sc238.nextInt();
            sc238.nextLine();

            switch (chon238) {
                case 1:
                    ts238.nhapDanhSach(sc238);
                    break;
                case 2:
                    ts238.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap so bao danh can tim: ");
                    int soBD238 = sc238.nextInt();
                    ts238.timKiemThiSinh(soBD238);
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon238 != 4);

        sc238.close();
    }
}
