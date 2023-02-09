import java.util.Scanner;

public class Bai10 {
  public static void main(String[] args) {
    //Viết chương trình nhập số nguyên h và in ra màn hình tam giác cân có độ cao h. Ví dụ với h=4:
    System.out.println(" Nhập vào h : ");
    int h = new Scanner(System.in).nextInt();
    for (int i = 1; i <= h  ; i++) {
      for (int j = 1; j <= (h + i -1) ; j++) {
        if ( j <= (h-i)){
          System.out.print("   ");
        }else {
          System.out.print(" * ");
        }
      }
      System.out.println();
      }
    }

}
