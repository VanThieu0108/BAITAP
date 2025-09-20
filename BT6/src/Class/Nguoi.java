package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen238;
    protected Date ngaySinh238;
    protected int CMND238;

    public Nguoi() {
    }

    public Nguoi(String hoTen238, Date ngaySinh238, int CMND238) {
        this.hoTen238 = hoTen238;
        this.ngaySinh238 = ngaySinh238;
        this.CMND238 = CMND238;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        this.hoTen238 = sc.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        String strDate = sc.nextLine();
        this.ngaySinh238 = this.strToDate(strDate);
        System.out.print("\tNhap CMND: ");
        this.CMND238 = sc.nextInt();
    }

    private Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = sdf.parse(strDate);
        } catch (ParseException var5) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + this.hoTen238);
        System.out.println("\tNgay sinh: " + this.ngaySinh238);
        System.out.println("\tCMND: " + this.CMND238);
    }

    public int getCMND() {
        return this.CMND238;
    }

    public Date getNgaySinh() {
        return this.ngaySinh238;
    }
}
