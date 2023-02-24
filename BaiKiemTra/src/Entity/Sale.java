package Entity;

import java.util.Scanner;

public class Sale  extends  Person{
  private int id;
  private String ngayKyHD;
  private  static int AUTO_ID = 1000;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNgayKyHD() {
    return ngayKyHD;
  }

  public void setNgayKyHD(String ngayKyHD) {
    this.ngayKyHD = ngayKyHD;
  }

  @Override
  public String toString() {
    return "Sale{" +
            "id=" + id +
            ", ngayKyHD='" + ngayKyHD + '\'' +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", phone='" + phone + '\'' +
            '}';
  }

  @Override
  public void inputTable() {
    super.inputTable();
    this.id = AUTO_ID;
    AUTO_ID ++;
    System.out.println("Ngày ký hợp đồng");
    this.ngayKyHD = new Scanner(System.in).nextLine();
  }
}
