package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> dshd238;

    public KhuPho() {
        dshd238 = new ArrayList<HoDan>(10);
    }

    public void themHoDan(HoDan hoDan238) {
        dshd238.add(hoDan238);
    }

    public void nhapDanhSach(Scanner sc238) {
        HoDan hoDan238;

        System.out.print("Nhap vao so ho dan: ");
        int soHoDan238 = sc238.nextInt();
        sc238.nextLine();

        System.out.println("Nhap vao thong tin cho tung ho dan:");
        for (int i238 = 0; i238 < soHoDan238; i238++) {
            System.out.println("Ho dan thu " + (i238 + 1) + " la:");
            hoDan238 = new HoDan();
            hoDan238.nhapThongTin(sc238);
            themHoDan(hoDan238);
        }
    }

    public void hienThiDanhSach() {
        int n238 = dshd238.size();

        for (int i238 = 0; i238 < n238; i238++) {
            System.out.println("Ho dan thu " + (i238 + 1) + " la:");
            dshd238.get(i238).hienThiThongTin();
        }
    }

    public void timKiemThongTin() {
        Date now238 = new Date();
        int namHienTai238 = now238.getYear() + 1900;

        Nguoi[] dstv238 = null;

        for (HoDan hoDan238 : dshd238) {
            dstv238 = hoDan238.getList238();
            for (int i238 = 0; i238 < hoDan238.getSoNguoi238(); i238++) {
                if (namHienTai238 - (dstv238[i238].getNgaySinh().getYear() + 1900) == 80) {
                    hoDan238.hienThiThongTin();
                }
            }
        }
    }
}
