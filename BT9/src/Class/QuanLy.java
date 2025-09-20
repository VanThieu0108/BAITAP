package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TheMuon> ds238;

    public QuanLy() {
        ds238 = new ArrayList<TheMuon>(10);
    }

    public void themTheMuon(TheMuon theMuon238) {
        ds238.add(theMuon238);
    }

    public void nhapDanhSach(Scanner sc) {
        TheMuon theMuon238;

        System.out.print("Nhap vao so luong the muon: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i = 0; i < n; i++) {
            System.out.println("The muon thu " + (i + 1) + " la:");
            theMuon238 = new TheMuon();
            theMuon238.nhapThongTin(sc);
            themTheMuon(theMuon238);
        }
    }

    public void hienThiDanhSachTraCuoiThang() {
        for (TheMuon the238 : ds238) {
            if (the238.getHanTra().getDate() == 31 || the238.getHanTra().getDate() == 30) {
                the238.hienThiThongTin();
            }
        }
    }
}
