package Baitap;

import java.util.Scanner;

public class Bai7 {
  public static void main(String[] args) {
    String str1 = input("Nhập chuỗi 1: ");
    String str2 = input("Nhập chuỗi 2: ");
    timKiemVaLoạiBo(str1, str2);
  }

  private static void timKiemVaLoạiBo(String str1, String str2) {
    String newStr = str1.replace(str2, "");
    if (newStr.length() == str1.length()) {
      System.out.println("Trong chuỗi 1 không có chuỗi 2");
      return;
    }
    System.out.println("Trong chuỗi 1 có chuỗi 2");
    System.out.println("sau khi xoa chuoi 2 ra khoi chuoi 1: " + newStr);
  }

  public static String input(String cm) {
    System.out.print(cm);
    String str = new Scanner(System.in).nextLine();
    return str;
  }
}
