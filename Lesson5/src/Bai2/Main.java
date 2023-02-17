package Bai2;

import Bai1.SinhvienB1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Nhập vào số lượng sinh viên : ");
    int n = new Scanner(System.in).nextInt();
    Student[] students = new Student[n];

    for (int i = 0; i < students.length ; i++) {
      students [i] =new Student ();
      students[i].nhapThongTin();

    }
    System.out.println(Arrays.toString(students));
  }
}
