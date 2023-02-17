package Bai1;

import java.util.Scanner;

public class SinhvienB1 {
  public int iD;
  public String lop;
  public String khoa;
  public String name;
  public void nhapThongTin (){
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
            ", name ='" + name + '\'' +
            ", lop='" + lop + '\'' +
            ", khoa='" + khoa + '\'' +
            '}';
  }
}

