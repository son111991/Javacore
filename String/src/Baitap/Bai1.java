package Baitap;

import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    System.out.println("Nhâp xâu kiểm tra : ");
    float x  = new Scanner(System.in).nextFloat();
    if (kiemtra(x)){
      System.out.println("Số "+x+" không  là thuận nghịch ");
      return;
    }
    System.out.println("Số "+x+"  là thuận nghịch");
  }

  private static boolean kiemtra(float n) {
    String str  = "" +n;
    for (int i = 0; i <(str.length())/2 ; i++) {
      if (str.charAt(i) != str.charAt(str.length()-1-i)){
        return false;
      }
    }
    return true;
  }

}
