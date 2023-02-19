package Inheritance;

import java.time.LocalDateTime;

public class ConNguoi {
  private int ID;
  private String ten;
  private LocalDateTime ngaySinh;
  private String gioiTinh;
  private String queQuan;
  private String tinhTrangHonNhan;

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public LocalDateTime getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(LocalDateTime ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public String getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

  public String getQueQuan() {
    return queQuan;
  }

  public void setQueQuan(String queQuan) {
    this.queQuan = queQuan;
  }

  public String getTinhTrangHonNhan() {
    return tinhTrangHonNhan;
  }

  public void setTinhTrangHonNhan(String tinhTrangHonNhan) {
    this.tinhTrangHonNhan = tinhTrangHonNhan;
  }

  @Override
  public String toString() {
    return "ConNguoi{" +
            "ID=" + ID +
            ", ten='" + ten + '\'' +
            ", ngaySinh=" + ngaySinh +
            ", gioiTinh='" + gioiTinh + '\'' +
            ", queQuan='" + queQuan + '\'' +
            ", tinhTrangHonNhan='" + tinhTrangHonNhan + '\'' +
            '}';
  }
}
