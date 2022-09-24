package model;

public class ThanhVien {
    private int cmnd;
    private String hoTen;
    private String ngaySinh;
    private String maHoKhau;

    public ThanhVien() {
    }

    public ThanhVien(int cmnd, String hoTen, String ngaySinh, String maHoKhau) {
        this.cmnd = cmnd;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.maHoKhau = maHoKhau;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaHoKhau() {
        return maHoKhau;
    }

    public void setMaHoKhau(String maHoKhau) {
        this.maHoKhau = maHoKhau;
    }
}
