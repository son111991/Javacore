package Enum;

public enum ChuyenNganhSach {
  KHTN ("Khoa học tự nhiên"),
  VH_NT ("Văn học nghệ thuật"),
  DT_VT ("Điện tử viễn thông"),
  CN_TT ("Công nghệ thông tin");
  public String vluae;

  ChuyenNganhSach(String vluae) {
    this.vluae = vluae;
  }

  public String getVluae() {
    return vluae;
  }

  public void setVluae(String vluae) {
    this.vluae = vluae;
  }
}
