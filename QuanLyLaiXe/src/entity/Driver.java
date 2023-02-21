package entity;

import constant.DriverLevel;

import java.util.Scanner;

public class Driver extends Person {
  private int id;
  private DriverLevel driverLevel;
  private static int AUTO_ID= 10000;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public DriverLevel getDriverLevel() {
    return driverLevel;
  }

  public void setDriverLevel(DriverLevel driverLevel) {
    this.driverLevel = driverLevel;
  }

  public static int getAutoId() {
    return AUTO_ID;
  }

  public static void setAutoId(int autoId) {
    AUTO_ID = autoId;
  }

  @Override
  public String toString() {
    return "Driver{" +
            "id=" + id +
            ", driverLevel=" + driverLevel +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", phone='" + phone + '\'' +
            '}';
  }

  @Override
  public void inputinfor() {
    super.inputinfor();
    this.id = AUTO_ID;
    AUTO_ID ++;
    System.out.println("Nhập trình độ lái xe ");
    System.out.println("1. Loại A");
    System.out.println("2. Loại B");
    System.out.println("3. Loại C");
    System.out.println("4. Loại D");
    System.out.println("5. Loại E");
    System.out.println("6. Loại F");
    System.out.println("Xin mới chọn ");
    int temp;
    do {
      temp = new Scanner(System.in).nextInt();
      if (temp >=1 && temp <= 6){
        break;
      }
      System.out.println("Lựa chọn không hợp lệ mới nhập lại !");
    }
    while (true);
    switch (temp){
      case 1:
        this.driverLevel = DriverLevel.A;
        break;
      case 2:
        this.driverLevel = DriverLevel.B;
        break;
      case 3:
        this.driverLevel = DriverLevel.C;
        break;
      case 4:
        this.driverLevel = DriverLevel.D;
        break;
      case 5:
        this.driverLevel = DriverLevel.E;
        break;
      case 6:
        this.driverLevel = DriverLevel.F;
        break;

    }

  }
}
