import java.util.Scanner;

public class vdvonglapfor {
  public static void main(String[] args) {
    System.out.println(" Nhập vào n: ");
    int n = new Scanner(System.in).nextInt();
    int S = 0;
    for (int i = 1; i <= n; i++) {
      S += n%10;
      n=n/10;
    }
    System.out.println("Tổng ừ 1 tới " + n + " là " + S);
  }
}
