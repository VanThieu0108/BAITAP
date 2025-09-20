package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb238;

    public QLCB() {
        dscb238 = new ArrayList<CanBo>(10);
    }

    public void themCanBo(CanBo cb238) {
        dscb238.add(cb238);
    }

    public void nhapDanhSach(Scanner sc238) {
        CanBo cb238;
        System.out.print("Nhap vao so luong can bo: ");
        int n238 = sc238.nextInt();
        sc238.nextLine();

        System.out.println("Nhap thong tin chi tiet:");
        for (int i238 = 0; i238 < n238; i238++) {
            System.out.println("Lan nhap thu " + (i238 + 1) + ":");
            System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
            int chon238 = sc238.nextInt();
            sc238.nextLine();

            cb238 = new CanBo();

            switch (chon238) {
                case 1:
                    cb238 = new KySu();
                    break;
                case 2:
                    cb238 = new NhanVien();
                    break;
                case 3:
                    cb238 = new CongNhan();
                    break;
                default:
                    cb238 = new KySu();
                    break;
            }

            cb238.nhapThongTin(sc238);
            themCanBo(cb238);
        }
    }

    public void timKiemCanBo(String hoTen238) {
        for (CanBo cb238 : dscb238) {
            if (hoTen238.equals(cb238.getHoTen238())) {
                cb238.hienThiThongTin();
            }
        }
    }
}
