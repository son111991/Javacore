package Baitap;

import java.util.Scanner;

public class Bai8 {
  public static void main(String[] args) {
    String str1 = input("Nhập chuỗi 1: ");
    String str2 = input("Nhập chuỗi 2: ");
    System.out.println("vi tri: " + search(str1, str2));
  }

  public static String input(String cm) {
    System.out.print(cm);
    String str = new Scanner(System.in).nextLine();
    return str;
  }

  private static int search(String str1, String str2) {
    if(str1.length() > str2.length()){
      return -1;
    }
    return str2.indexOf(str1);
  }
}
