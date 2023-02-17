package Bai1;

import java.util.Arrays;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    System.out.println("Nhập vào số lượng sinh viên : ");
    int n = new Scanner(System.in).nextInt();
    SinhvienB1 [] sinhvienB1s = new SinhvienB1[n];

    for (int i = 0; i <sinhvienB1s.length ; i++) {
      sinhvienB1s [i] =new SinhvienB1 ();
      System.out.println("Nhập ID sinh viên : ");
      sinhvienB1s[i].iD = new Scanner(System.in).nextInt();

      System.out.println(" Nhập tên sinh viên : ");
      sinhvienB1s[i].name = new Scanner(System.in).nextLine();

      System.out.println(" Nhập lớp sinh viên : ");
      sinhvienB1s[i].lop = new Scanner(System.in).nextLine();

      System.out.println(" Nhập khoa sinh viên : ");
      sinhvienB1s[i].khoa = new Scanner(System.in).nextLine();

    }
    System.out.println(Arrays.toString(sinhvienB1s));
  }
}
