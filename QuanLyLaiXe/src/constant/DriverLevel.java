package constant;

public enum DriverLevel {
  A ("Trình độ loại A"),
  B ("Trình độ loại B"),
  C ("Trình độ loại C"),
  D ("Trình độ loại D"),
  E ("Trình độ loại E"),
  F ("Trình độ loại F");
  public String value ;

  DriverLevel(String value) {
    this.value = value;
  }
}
