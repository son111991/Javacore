import java.util.Scanner;

public class Bai17 {
  public static void main(String[] args) {
    //Nhập số n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n;
    int  n = nhapSo();
    cacsoSochanle(n);
  }
  public static int nhapSo() {
    System.out.println("Nhập số n : ");
    int n = new Scanner(System.in).nextInt();
    return n;
  }
  public static void cacsoSochanle (int n) {
    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i + " : Là số chẵn ");
      }

    }
    for (int j = 1; j <= n; j++) {
      if (j % 2 == 1) {
        System.out.println(j + " : Là số lẻ ");
      }
    }
  }
}
