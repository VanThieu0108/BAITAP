package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen238;
    protected Date ngaySinh238;
    protected String queQuan238;

    public Nguoi() {
    }

    public Nguoi(String hoTen238, Date ngaySinh238, String queQuan238) {
        this.hoTen238 = hoTen238;
        this.ngaySinh238 = ngaySinh238;
        this.queQuan238 = queQuan238;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen238 = sc.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        String strDate238 = sc.nextLine();
        ngaySinh238 = strToDate(strDate238);

        System.out.print("\tNhap que quan: ");
        queQuan238 = sc.nextLine();
    }

    private Date strToDate(String strDate238) {
        Date date238 = null;
        SimpleDateFormat sdf238 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date238 = sdf238.parse(strDate238);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date238;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen238);
        System.out.println("\tNgay sinh: " + ngaySinh238);
        System.out.println("\tQue quan: " + queQuan238);
    }

    public String getQueQuan() {
        return queQuan238;
    }

    public Date getNgaySinh() {
        return ngaySinh238;
    }
}
