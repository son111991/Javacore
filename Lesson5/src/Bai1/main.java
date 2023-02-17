package Bai1;

import Bai2.Student;

import java.util.Arrays;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    System.out.println("Nhập vào số lượng sinh viên : ");
    int n = new Scanner(System.in).nextInt();
    SinhvienB1 [] sinhvienB1s = new SinhvienB1[n];

    for (int i = 0; i <sinhvienB1s.length ; i++) {
      sinhvienB1s [i] =new SinhvienB1 ();
      sinhvienB1s[i].nhapThongTin();


    System.out.println(Arrays.toString(sinhvienB1s));
  }
}
}
