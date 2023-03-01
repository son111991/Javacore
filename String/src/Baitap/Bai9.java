package Baitap;

import java.util.Scanner;

public class Bai9 {
  public static void main(String[] args) {
    String str1 = input("Nhập chuỗi 1: ");
    String str2 = input("Nhập chuỗi 2: ");
    System.out.print("Nhập vị trí k: ");
    int k = new Scanner(System.in).nextInt();
    System.out.println("ket qua: "+ chenchuoi(str1,str2,k));
  }

  private static String chenchuoi(String str1, String str2, int k) {

    String newString = str2.substring(0,k) + str1 + str2.substring(k);
    return newString;
  }

  public static String input(String cm) {
    System.out.print(cm);
    String str = new Scanner(System.in).nextLine();
    return str;
  }
}
