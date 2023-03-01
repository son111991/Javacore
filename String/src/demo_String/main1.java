package demo_String;

import java.util.Scanner;

public class main1 {
  public static void main(String[] args) {
    System.out.print("Nhập chuỗi: ");
    String str = new Scanner(System.in).nextLine();
    System.out.println("Nhập ký tự cần tìm: ");
    String temp = new Scanner(System.in).nextLine();

    char c = temp.charAt(0);
    for (int i = 0; i <str.length() ; i++) {
      if ( str.charAt(i) == c ){
        System.out.println("Ký tự " +c+ " xuất hiện tại vị trí " +i);
        return;
      }

    }
    System.out.println("Ký tự "+c+" không xuâ hiện trong chuỗi " +str);
  }
}
