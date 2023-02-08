import java.util.Scanner;

public class tinhtong {
  public static void main(String[] args) {
    System.out.println(" Nhập số n : ");
    int n = new Scanner(System.in).nextInt();
    int S = 0;
    for (int i = 2; i <= n; i += 2) {
      S += i;
    }
    System.out.println(" tổng từ 1 đến " + n + " là :" + S);
  }

}


