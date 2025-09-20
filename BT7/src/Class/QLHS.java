package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    private ArrayList<HocSinh> dshs238;

    public QLHS() {
        dshs238 = new ArrayList<HocSinh>(10);
    }

    public void themHS(HocSinh hs238) {
        dshs238.add(hs238);
    }

    public void nhapDanhSachHS(Scanner sc238) {
        HocSinh hs238;

        System.out.print("Nhap vao so luong hoc sinh: ");
        int n238 = sc238.nextInt();
        sc238.nextLine();

        System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
        for (int i238 = 0; i238 < n238; i238++) {
            System.out.println("\tHoc sinh thu " + (i238 + 1) + " la:");

            hs238 = new HocSinh();
            hs238.nhapThongTin(sc238);

            themHS(hs238);
        }
    }

    public void hienThiDanhSach() {
        int n238 = dshs238.size();
        for (int i238 = 0; i238 < n238; i238++) {
            System.out.println("\tHoc sinh thu " + (i238 + 1) + " la:");
            dshs238.get(i238).hienThiThongTin();
        }
    }

    public void timKiemThongTin(int nam238, String que238) {
        for (HocSinh hs238 : dshs238) {
            if ((hs238.getNgaySinh().getYear() + 1900 == nam238) && (que238.equals(hs238.getQueQuan()))) {
                hs238.hienThiThongTin();
            }
        }
    }

    public void timKiemThongTin(String lop238) {
        for (HocSinh hs238 : dshs238) {
            if (lop238.equals(hs238.getLop())) {
                hs238.hienThiThongTin();
            }
        }
    }
}
