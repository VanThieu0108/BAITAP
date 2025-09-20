package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> ds238 = new ArrayList<>(10);

    public KhachSan() {
    }

    public void themKhachTro238(KhachTro kt238) {
        this.ds238.add(kt238);
    }

    public void nhapDanhSach238(Scanner sc238) {
        System.out.print("Nhap vao so luong khach: ");
        int n238 = sc238.nextInt();
        sc238.nextLine();
        System.out.println("Nhap vao thong tin khach tro:");

        for (int i238 = 0; i238 < n238; ++i238) {
            System.out.println("Khach tro thu " + (i238 + 1) + " la:");
            KhachTro khach238 = new KhachTro();
            khach238.nhapThongTin(sc238);
            this.themKhachTro238(khach238);
        }
    }

    public void hienThiDanhSach238() {
        for (KhachTro khach238 : this.ds238) {
            khach238.hienThiThongTin();
        }
    }

    public double tinhTien238(int CMND238) {
        double tien238 = 0.0;

        for (KhachTro khach238 : this.ds238) {
            if (khach238.getCMND() == CMND238) {
                tien238 = khach238.getSoNgayTro() * khach238.getGiaPhong();
            }
        }

        return tien238;
    }
}
