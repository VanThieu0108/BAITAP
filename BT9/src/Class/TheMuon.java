package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon238;
    private Date ngayMuon238;
    private Date hanTra238;
    private String soHieu238;

    public TheMuon() {

    }

    public TheMuon(int soMuon238, Date ngayMuon238, String soHieu238) {
        this.soMuon238 = soMuon238;
        this.ngayMuon238 = ngayMuon238;
        this.soHieu238 = soHieu238;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap so muon: ");
        soMuon238 = sc.nextInt();
        sc.nextLine();

        System.out.print("\tNhap ngay muon: ");
        String strNgayMuon238 = sc.nextLine();
        ngayMuon238 = strToDate(strNgayMuon238);

        String strNgayTra238 = "31-12-2020";
        hanTra238 = strToDate(strNgayTra238);

        System.out.println("\tNhap so hieu: ");
        soHieu238 = sc.nextLine();
    }

    private Date strToDate(String strNgayMuon238) {
        Date date238 = null;
        SimpleDateFormat sdf238 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date238 = sdf238.parse(strNgayMuon238);
        } catch (ParseException e238) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date238;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tSo phieu muon: " + soMuon238);
        System.out.println("\tNgay muon: " + ngayMuon238);
        System.out.println("\tHan tra: " + hanTra238);
        System.out.println("\tSo hieu: " + soHieu238);
    }

    public Date getHanTra() {
        return hanTra238;
    }
}
