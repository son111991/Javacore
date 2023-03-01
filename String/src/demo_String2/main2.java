package demo_String2;

import java.util.Scanner;

public class main2 {
  public static void main(String[] args) {
    System.out.println(" Nhập chuỗi: ");
    String srt = new Scanner(System.in).nextLine();
    String newstr = "";
    for (int i = 0; i <srt.length() ; i++) {
      newstr = srt.charAt(i) + newstr;
    }
    System.out.println(newstr);
  }
}
