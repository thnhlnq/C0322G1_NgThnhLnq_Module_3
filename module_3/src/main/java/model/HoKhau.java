package model;

public class HoKhau {
    private String maHoKhau;
    private String tenChuHo;
    private int soThanhVien;
    private String ngayLapHoKhau;
    private String diaChi;

    public HoKhau() {
    }

    public HoKhau(String maHoKhau, String tenChuHo, int soThanhVien, String ngayLapHoKhau, String diaChi) {
        this.maHoKhau = maHoKhau;
        this.tenChuHo = tenChuHo;
        this.soThanhVien = soThanhVien;
        this.ngayLapHoKhau = ngayLapHoKhau;
        this.diaChi = diaChi;
    }

    public String getMaHoKhau() {
        return maHoKhau;
    }

    public void setMaHoKhau(String maHoKhau) {
        this.maHoKhau = maHoKhau;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getNgayLapHoKhau() {
        return ngayLapHoKhau;
    }

    public void setNgayLapHoKhau(String ngayLapHoKhau) {
        this.ngayLapHoKhau = ngayLapHoKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
