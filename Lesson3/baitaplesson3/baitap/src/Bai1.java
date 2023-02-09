import javax.swing.*;
import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    // Viết chương trình nhập vào 4 số nguyên a, b, c và d. In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập.
    System.out.println("Nhập vào số a : ");
    float a = new Scanner(System.in).nextFloat();
    System.out.println("Nhập vào số b : ");
    float b = new Scanner(System.in).nextFloat();
    System.out.println("Nhập vào số c : ");
    float c = new Scanner(System.in).nextFloat();
    System.out.println("Nhập vào số d : ");
    float d = new Scanner(System.in).nextFloat();
    if (a >= b && a >= c && a >= d) {
      System.out.println(" " + a + " là số lớn nhất");
    } else if (b >= c && b >= d && b >= a) {
      System.out.println(" " + b + " là số lớn nhất");
    } else if (c >= b && c >= d && c >= a) {
      System.out.println(" " + c + " là số lớn nhất");
    } else {
      System.out.println(" " + d + " là số lớn nhất");
    }
  }}