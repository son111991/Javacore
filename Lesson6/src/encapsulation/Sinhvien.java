package encapsulation;

public class Sinhvien {
  private  int maSinhVien;
  private String hoVaTen;
  private  String gioiTinh;

  public void setMaSinhVien(int maSinhVien){
    this.maSinhVien =maSinhVien;
  }
  public int getMaSinhVien(){
    return this.maSinhVien;
  }

  public String getHoVaTen() {
    return hoVaTen;
  }

  public void setHoVaTen(String hoVaTen) {
    this.hoVaTen = hoVaTen;
  }

  public String getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
  }
}
