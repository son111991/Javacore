import java.util.Scanner;

public class Bai15 {
  public static void main(String[] args) {
    // Nhập số tự nhiên n rồi tính tổng S = 1+1/2+1/3 +...+1/n
    int n = nhapSo();
    tinhTong(n);
  }

  public static int nhapSo() {
    System.out.println("Nhập số n : ");
    int n = new Scanner(System.in).nextInt();
    return n;
  }

  public static void tinhTong(int n) {
    double S = 0;
    for (int i = 1; i <= n; i++) {
      S = S + (double) 1 / i;
    }
    System.out.println(S);
  }
}
