package Entity;

import Constant.NhomMatHang;
import Constant.NhomMatHang;

import java.util.Scanner;

public class MatHang implements Inputtable {
  private int id;
  private String tenHang;
  private String nhomHang;
  private String gia;
  private String soLuong;
  private static int AUTO_ID = 1000;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTenHang() {
    return tenHang;
  }

  public void setTenHang(String tenHang) {
    this.tenHang = tenHang;
  }

  public String getNhomHang() {
    return nhomHang;
  }

  public void setNhomHang(String nhomHang) {
    nhomHang = nhomHang;
  }

  public String getGia() {
    return gia;
  }

  public void setGia(String gia) {
    this.gia = gia;
  }

  public String getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(String soLuong) {
    this.soLuong = soLuong;
  }

  @Override
  public String toString() {
    return "MatHang{" +
            "id=" + id +
            ", tenHang='" + tenHang + '\'' +
            ", NhomHang='" + nhomHang + '\'' +
            ", gia='" + gia + '\'' +
            ", soLuong='" + soLuong + '\'' +
            '}';
  }

  @Override
  public void inputTable() {
  this.id =AUTO_ID;
  AUTO_ID ++;
    System.out.println("Nhập tên hàng !");
    this.tenHang = new Scanner(System.in).nextLine();
    System.out.println("Nhập giá !");
    this.gia =new Scanner(System.in).nextLine();
    System.out.println("Nhập số lượng");
    this.soLuong =new Scanner(System.in).nextLine();
    System.out.println(" Nhập nhóm hàng ");
    System.out.println("Nhập lựa chọn nhóm hàng :");
    System.out.println("1. Điện tử ");
    System.out.println("2. Điện Lạnh ");
    System.out.println("3. Máy tính ");
    System.out.println("4. Thiết bị văn phòng ");
    int temp;
    do {
      temp = new Scanner(System.in).nextInt();
      if (temp >= 1 && temp <= 4){
        break;
      }
      System.out.println("Nhập không đúng mới nhập lại");
    }
    while (true);
    switch (temp){
      case 1:
        this.nhomHang = NhomMatHang.Dien_Tu.value;
        break;
      case 2:
        this.nhomHang = NhomMatHang.Dien_Lanh.value;
        break;
      case 3:
        this.nhomHang = NhomMatHang.May_Tinh.value;
        break;
      case 4:
        this.nhomHang = NhomMatHang.Thietbi_Vanphong.value;
        break;
    }
  }
}
