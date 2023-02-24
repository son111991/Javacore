package entity;

import constant.Reportertype;

import java.util.Scanner;

public class Reporter extends person {
  private int id;
  private Reportertype reportertype;
  private static int AUTO_ID = 10000;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Reportertype getReportertype() {
    return reportertype;
  }

  public void setReportertype(Reportertype reportertype) {
    this.reportertype = reportertype;
  }

  @Override
  public String toString() {
    return "Reporter{" +
            "id=" + id +
            ", reportertype=" + reportertype +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", phone='" + phone + '\'' +
            '}';
  }

  @Override
  public void inputinfor() {
    super.inputinfor();
    this.id = AUTO_ID;
    AUTO_ID++;
    System.out.println(" Nhập trình độ phóng viên ");
    System.out.println("1 .Chuyên nghiệp");
    System.out.println("2 .Nghiệp dư");
    System.out.println("3 .Cộng tác viên");
    int temp;
    do {
      temp = new Scanner(System.in).nextInt();
      if (temp >= 1 && temp <= 3) {
        break;
      }
      System.out.println("Lựa chọn không hợp lệ mới nhập lại !");
    }
    while (true) ;
      switch (temp) {
        case 1:
          this.reportertype = Reportertype.Chuyen_Ngiep;
          break;
        case 2:
          this.reportertype = Reportertype.Nghiep_Du;
          break;
        case 3:
          this.reportertype = Reportertype.Cong_Tac_Vien;
          break;
      }
    }
  }

