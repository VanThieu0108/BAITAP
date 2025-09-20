package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    private String mon1238;
    private String mon2238;
    private String mon3238;

    public KhoiA() {
    }

    public KhoiA(String mon1238, String mon2238, String mon3238) {
        this.mon1238 = mon1238;
        this.mon2238 = mon2238;
        this.mon3238 = mon3238;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap mon 1: ");
        mon1238 = sc.nextLine();
        System.out.print("\tNhap mon 2: ");
        mon2238 = sc.nextLine();
        System.out.print("\tNhap mon 3: ");
        mon3238 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTo hop mon thi: " + mon1238 + " - " + mon2238 + " - " + mon3238);
    }
}
