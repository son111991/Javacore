import java.util.Scanner;

public class vd {
  public static void main(String[] args) {
    int S = 0;
    System.out.println("Nhập vào số n : ");
    int n = new Scanner(System.in).nextInt();
    while (n != 0) {
      S = S + n % 10;
      n = n / 10;
    }
    System.out.println(S);
  }
}
