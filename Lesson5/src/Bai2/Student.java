package Bai2;

import java.util.Scanner;

public class Student {
  int iD;
  String name;
  String lop;
  String khoa;
  public void nhapThongTin(){
    System.out.println("Nhập ID sinh viên : ");
    this.iD = new Scanner(System.in).nextInt();

    System.out.println(" Nhập tên sinh viên : ");
    this.name = new Scanner(System.in).nextLine();

    System.out.println(" Nhập lớp sinh viên : ");
    this.lop = new Scanner(System.in).nextLine();

    System.out.println(" Nhập khoa sinh viên : ");
    this.khoa = new Scanner(System.in).nextLine();
  }


  @Override
  public String toString() {
    return "SinhvienB1{" +
            "iD=" + iD +
            ", tenSinhVien='" + name + '\'' +
            ", lop='" + lop + '\'' +
            ", khoa='" + khoa + '\'' +
            '}';
  }

}
