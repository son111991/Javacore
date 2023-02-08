import java.util.Scanner;

public class vdsonguyento {
  public static void main(String[] args) {
    System.out.println(" Nhập số n : ");
    int n = new Scanner(System.in).nextInt();
    boolean laSNT = true;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        laSNT = false;
      }
    }
    if (laSNT) {
      System.out.println("SNT");
    } else {
      System.out.println("Không là số NT");
    }
  }}
