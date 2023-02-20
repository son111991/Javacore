package Enum;

public enum LoaiBanDoc {
  Sinh_Vien("Sinh viên"),
    HocVienCaoHoc ("Học viên cao học"),
      Giao_Vien("Giáo viên");
  public String value;

  LoaiBanDoc(String value) {
    this.value = value;
  }
}
