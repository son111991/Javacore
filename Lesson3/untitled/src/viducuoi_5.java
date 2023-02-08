import java.util.Scanner;

public class viducuoi_5 {
  public static void main(String[] args) {
    System.out.println(" Nhâp  số n : ");
    int n = new Scanner(System.in).nextInt();
    double S = 0;
    for (int i = 1; i <=n ; i++) {
      S += (double)1/i;
    }
    System.out.println("Tính tổng : " +S );
  }
}
