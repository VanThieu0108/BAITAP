package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen238;
    private Date ngaySinh238;
    private String ngheNghiep238;

    public Nguoi() {

    }

    public Nguoi(String hoTen238, Date ngaySinh238, String ngheNghiep238) {
        this.hoTen238 = hoTen238;
        this.ngaySinh238 = ngaySinh238;
        this.ngheNghiep238 = ngheNghiep238;
    }

    public void nhapThongTin(Scanner sc238) {
        System.out.print("\tNhap ho ten: ");
        hoTen238 = sc238.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        String strDate238 = sc238.nextLine();
        ngaySinh238 = strToDate238(strDate238);
        System.out.print("\tNhap nghe nghiep: ");
        ngheNghiep238 = sc238.nextLine();
    }

    private Date strToDate238(String strDate238) {
        Date date238 = null;

        SimpleDateFormat sdf238 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date238 = sdf238.parse(strDate238);
        } catch (ParseException e238) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date238;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen238);
        System.out.println("\tNgay sinh: " + dateToString238(ngaySinh238));
        System.out.println("\tNghe nghiep: " + ngheNghiep238);
    }

    private String dateToString238(Date date238) {
        SimpleDateFormat sdf238 = new SimpleDateFormat("dd-MM-yyyy");
        String strDate238 = sdf238.format(date238);
        return strDate238;
    }

    public Date getNgaySinh() {
        return ngaySinh238;
    }
}
