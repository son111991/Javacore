import java.util.Scanner;

public class Bai11 {
  public static void main(String[] args) {
    //Nhập số tự nhiên n rồi tính các tổng sau:
    //• S = tổng các số tự nhiên không lớn hơn n.
    //• S1 = tổng các số tự nhiên lẻ không lớn hơn n.
    //• S2 = tổng các số tự nhiên chẵn không lớn hơn n.
    System.out.println("Nhập số n : ");
    int n = new Scanner(System.in).nextInt();
    int S = 0;
    for (int i = 0; i <= n; i++) {
      S = S + i;
    }
    System.out.println(" Tổng các số không lớn hơn " + " n là:" + S);
    int S1 = 0;
    for (int j = 0; j <= n; j++) {
      if (j % 2 == 0) {
        S1 = S1 + j;
      }
    }
    System.out.println("Tổng các số chăn không lớn hơn " + n + " là : " + S1);
    int S2 = 0;
    for (int k = 0; k <= n; k++) {
      if (k % 2 != 0) {
        S2 = S2 + k;
      }
    }
    System.out.println("Tổng các số lẻ không lớn hơn " + n + " là : " + S2);
  }
}
