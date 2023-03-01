package Baitap;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai5 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Nhập vào họ đệm tên : ");
    String strInput = input.nextLine();
    System.out.println("Tên họ đêm : " + doiViTri(strInput));

  }

  public static String doiViTri(String strInput) {
    String str = (strInput);
    StringTokenizer strToken = new StringTokenizer(str, " ");
    String ho = strToken.nextToken();
    String dem = strToken.nextToken();
    String ten = strToken.nextToken();
    String strOutput = ten + " " + ho + " " + dem;
    return (strOutput);
  }
}
