package constant;

public enum Reportertype {
  Chuyen_Ngiep("Chuyên nghiệp"),
  Nghiep_Du("Nghiệp dư"),
  Cong_Tac_Vien("Cộng tác viên");
  public String value;

  Reportertype(String value) {
    this.value = value;
  }
}

