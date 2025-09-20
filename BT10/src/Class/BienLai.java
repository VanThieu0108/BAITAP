package Class;

import java.util.Scanner;

public class BienLai extends KhachHang {
    private int chiSoMoi238;
    private int chiSoCu238;
    private double tien238;

    public BienLai() {

    }

    public BienLai(int chiSoMoi238, int chiSoCu238, double tien238) {
        this.chiSoMoi238 = chiSoMoi238;
        this.chiSoCu238 = chiSoCu238;
        this.tien238 = tien238;
    }

    public BienLai(String tenChuHo238, int chiSoMoi238, int chiSoCu238, double tien238) {
        this.tenChuHo238 = tenChuHo238;
        this.chiSoMoi238 = chiSoMoi238;
        this.chiSoCu238 = chiSoCu238;
        this.tien238 = tien238;
    }

    public void nhapThongTin(Scanner sc238) {
        super.nhapThongTin(sc238);
        System.out.print("\tNhap chi so moi: ");
        chiSoMoi238 = sc238.nextInt();
        sc238.nextLine();
        System.out.print("\tNhap chi so cu: ");
        chiSoCu238 = sc238.nextInt();
        sc238.nextLine();
        tien238 = (chiSoMoi238 - chiSoCu238) * 750;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tChi so moi: " + chiSoMoi238);
        System.out.println("\tChi so cu: " + chiSoCu238);
        System.out.println("\tTien: " + tien238);
    }
}
