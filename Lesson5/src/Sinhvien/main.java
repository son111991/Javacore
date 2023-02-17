package Sinhvien;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    System.out.println("Nhập vào số lượng sv: ");
    int n = new Scanner(System.in).nextInt();
  Student [] students = new Student[n];
    for (int i = 0; i <students.length ; i++) {
      students[i] = new Student();
      System.out.println("-----------------");
      students[i].khaiBaothongtin();

    }
    System.out.println(Arrays.toString(students));
    System.out.println(" -------------------------");
    int random  =new Random().nextInt();
    students[random].name = " Nguyên Văn Bê ";
    System.out.println(Arrays.toString(students));

  }
}
