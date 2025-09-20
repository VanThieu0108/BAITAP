//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dstl = new ArrayList(10);

    public QuanLySach() {
    }

    public void themTaiLieu(TaiLieu tl) {
        this.dstl.add(tl);
    }

    public void nhapDanhSachTL(Scanner sc) {
        String stop;
        do {
            System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
            int chon = sc.nextInt();
            sc.nextLine();
            TaiLieu tl;
            switch (chon) {
                case 1:
                    tl = new Sach();
                    break;
                case 2:
                    tl = new TapChi();
                    break;
                case 3:
                    tl = new Bao();
                    break;
                default:
                    tl = new Sach();
            }

            tl.nhapThongTin(sc);
            this.themTaiLieu(tl);
            System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
            stop = sc.nextLine();
        } while(stop.equals("c"));

    }

    public void timMaTL(String maTL) {
        for(TaiLieu tl : this.dstl) {
            if (maTL.equals(tl.getMaTaiLieu238())) {
                tl.hienThiThongTin();
            }
        }

    }

    public void timLoaiTL(String loai) {
        for(TaiLieu tl : this.dstl) {
            if (loai.equals("Sach") && tl instanceof Sach) {
                tl.hienThiThongTin();
            } else if (loai.equals("TapChi") && tl instanceof TapChi) {
                tl.hienThiThongTin();
            } else if (loai.equals("Bao") && tl instanceof Bao) {
                tl.hienThiThongTin();
            }
        }

    }
}
