class Oto {
    private String bienSo;
    private String hangXe;
    private String mauXe;
    private int namSanXuat;
    private String soKhung;
    private String soMay;

    public Oto(String bienSo, String hangXe, String mauXe) {
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

public class B3 {
    public static void main(String[] args) {
        Oto oto1 = new Oto("51F-12345", "Honda Civic", "Trắng");
        Oto oto2 = new Oto("51K-67890", "Toyota Camry", "Đen");

        System.out.println("Xe 1: " + oto1.layThongTinXe());
        System.out.println("Xe 2: " + oto2.layThongTinXe());
    }
}