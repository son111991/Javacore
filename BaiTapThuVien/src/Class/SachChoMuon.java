package Class;

public class SachChoMuon {
  private Sach sach;
  private int soLuong;

  public SachChoMuon(Sach sach, int soLuong) {
    this.sach = sach;
    this.soLuong = soLuong;
  }

  public int getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(int soLuong) {
    this.soLuong = soLuong;
  }
}
