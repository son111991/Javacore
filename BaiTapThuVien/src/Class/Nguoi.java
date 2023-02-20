package Class;

import java.util.Scanner;

public class Nguoi {
  protected String hoTen;
  protected String soDienThoai;
  protected String diaChi;

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getSoDienThoai() {
    return soDienThoai;
  }

  public void setSoDienThoai(String soDienThoai) {
    this.soDienThoai = soDienThoai;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  @Override
  public String toString() {
    return "Nguoi{" +
            "hoTen='" + hoTen + '\'' +
            ", soDienThoai='" + soDienThoai + '\'' +
            ", diaChi='" + diaChi + '\'' +
            '}';
  }
  public void inputinfor (){
    System.out.println("Nhập họ và tên ");
    this.hoTen = new Scanner(System.in).nextLine();
    System.out.println("Nhập số điện thoại ");
    this.soDienThoai = new Scanner(System.in).nextLine();
    System.out.println("Nhập địa chỉ ");
    this.diaChi = new Scanner(System.in).nextLine();
  }
}
