package Sinhvien;

import java.util.Scanner;

public class Student {
  int id;
  String name;
  String gender;
  String hometown;
  String faculty;
  float gpa;

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", hometown='" + hometown + '\'' +
            ", facvlty='" + faculty + '\'' +
            ", gpa=" + gpa +
            '}';
  }
  static  int Auto_ID  =10000;

  public void khaiBaothongtin(){
    this.id = Auto_ID;
    Auto_ID++;
    System.out.println("Nhập tên : ");
    this.name = new Scanner(System.in).nextLine();

    System.out.println("Nhập quê quán : ");
    this.hometown = new Scanner(System.in).nextLine();

    System.out.println("Nhập giới tính : ");
    this.gender = new Scanner(System.in).nextLine();

    System.out.println("Nhập tên khoa : ");
    this.faculty = new Scanner(System.in).nextLine();

    System.out.println("Nhập điểm trung bình : ");
    this.gpa = new Scanner(System.in).nextFloat();
  }
}
