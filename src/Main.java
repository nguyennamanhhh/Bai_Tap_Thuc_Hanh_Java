import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Xe {
    private String bienSo;
    private String hangXe;
    private String mauXe;
    private int namSanXuat;
    private String soKhung;
    private String soMay;

    public Xe(String bienSo, String hangXe, String mauXe) {
        this.bienSo = bienSo;
        this.hangXe = hangXe;
        this.mauXe = mauXe;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getSoKhung() {
        return soKhung;
    }

    public void setSoKhung(String soKhung) {
        this.soKhung = soKhung;
    }

    public String getSoMay() {
        return soMay;
    }

    public void setSoMay(String soMay) {
        this.soMay = soMay;
    }

    public String layThongTinXe() {
        return hangXe + " - " + mauXe + " [Biển số: " + bienSo + "]";
    }
}

class KhachHang {
    private String maKH;
    private String tenKH;
    private String soDienThoai;
    private String email;
    private String diaChi;
    private Date ngayThamGia;

    private List<Xe> danhSachXe;

    public KhachHang(String maKH, String tenKH, String soDienThoai) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.ngayThamGia = new Date();
        this.danhSachXe = new ArrayList<>();
    }

    public String getMaKH() {
        return maKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String sdt) {
        this.soDienThoai = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgayThamGia() {
        return ngayThamGia;
    }

    public void setNgayThamGia(Date ngayThamGia) {
        this.ngayThamGia = ngayThamGia;
    }

    public void themXe(Xe xe) {
        this.danhSachXe.add(xe);
    }

    public List<Xe> layDanhSachXe() {
        return danhSachXe;
    }
}

public class Main {
    public static void main(String[] args) {
        KhachHang kh = new KhachHang("KH001", "Nguyen Van A", "0909123456");

        Xe xe1 = new Xe("51F-12345", "Honda Civic", "Trắng");
        Xe xe2 = new Xe("51K-67890", "Toyota Camry", "Đen");

        kh.themXe(xe1);
        kh.themXe(xe2);

        System.out.println("Khách hàng: " + kh.getMaKH() + " - " + kh.layDanhSachXe().size() + " chiếc xe.");
        for (Xe xe : kh.layDanhSachXe()) {
            System.out.println("  > " + xe.layThongTinXe());
        }
    }
}