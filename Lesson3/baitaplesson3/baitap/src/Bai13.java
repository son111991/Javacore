import java.util.Scanner;

public class Bai13 {
  public static void main(String[] args) {
    //Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.
    System.out.println("Nhập số n : ");
    int n = new Scanner(System.in).nextInt();
    int S =0;
    for (int i = 1; i <=n ; i++) {
      if (i%7 ==0)
      S = S+i;
    }
    System.out.println("Tồng các số không lớn hơn "+n+" , và chia hết cho 7 là: " +S);
  }
}
