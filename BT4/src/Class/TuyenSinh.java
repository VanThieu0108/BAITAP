package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<ThiSinh> dsts;

    public TuyenSinh() {
        dsts = new ArrayList<ThiSinh>(10);
    }

    public void themThiSinh(ThiSinh ts238) {
        dsts.add(ts238);
    }

    public void nhapDanhSach(Scanner sc) {
        ThiSinh ts238;
        int chon238;

        System.out.print("Nhap vao so luong thi sinh: ");
        int n238 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n238; i++) {
            System.out.print("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
            chon238 = sc.nextInt();

            switch (chon238) {
                case 1:
                    ts238 = new KhoiA("Toan", "Ly", "Hoa");
                    break;
                case 2:
                    ts238 = new KhoiB("Toan", "Hoa", "Sinh");
                    break;
                case 3:
                    ts238 = new KhoiC("Van", "Su", "Dia");
                    break;
                default:
                    ts238 = new KhoiA("Toan", "Ly", "Hoa");
                    break;
            }

            ts238.nhapThongTin(sc);
            themThiSinh(ts238);
        }
    }

    public void hienThiDanhSach() {
        int n238 = dsts.size();
        for (int i = 0; i < n238; i++) {
            System.out.println("Thi sinh thu " + (i + 1) + " la:");
            dsts.get(i).hienThiThongTin();
        }
    }

    public void timKiemThiSinh(int soBaoDanh238) {
        for (ThiSinh ts238 : dsts) {
            if (ts238.getSoBD() == soBaoDanh238) {
                ts238.hienThiThongTin();
            }
        }
    }
}
