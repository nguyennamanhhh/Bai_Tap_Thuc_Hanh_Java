public class B4 {
    public static void main(String[] args) {
        XeDien xeDien = new XeDien("29A-88888", "VinFast VF8", "Xanh", 82);
        System.out.println("Khoi tao thanh cong xe dien: " + xeDien.layThongTinXe());
    }
}

class XeDien extends Oto {
    private int dungLuongPin;
    private String loaiCongSac;

    public XeDien(String bienSo, String hangXe, String mauXe, int dungLuongPin) {
        super(bienSo, hangXe, mauXe);
        this.dungLuongPin = dungLuongPin;
    }

    public int getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(int dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    public String getLoaiCongSac() {
        return loaiCongSac;
    }

    public void setLoaiCongSac(String loaiCongSac) {
        this.loaiCongSac = loaiCongSac;
    }
}

class XeXang extends Oto {
    private double dungTichBinhXang;
    private double dungTichXilanh;

    public XeXang(String bienSo, String hangXe, String mauXe, double dungTichXilanh) {
        super(bienSo, hangXe, mauXe);
        this.dungTichXilanh = dungTichXilanh;
    }

    public double getDungTichBinhXang() {
        return dungTichBinhXang;
    }

    public void setDungTichBinhXang(double dungTichBinhXang) {
        this.dungTichBinhXang = dungTichBinhXang;
    }

    public double getDungTichXilanh() {
        return dungTichXilanh;
    }

    public void setDungTichXilanh(double dungTichXilanh) {
        this.dungTichXilanh = dungTichXilanh;
    }
}