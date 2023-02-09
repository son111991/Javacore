import java.util.Scanner;

public class Bai12 {
  public static void main(String[] args) {
    // Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính phương
    // trong đoạn [m,n]. Có bao nhiêu số chính phương?
    System.out.println("Nhập số m : ");
    int m = new Scanner(System.in).nextInt();
    System.out.println("Nhập số n : ");
    int n = new Scanner(System.in).nextInt();
    for (int i = m; i <= n; i++) {
      int can = (int) Math.sqrt(i);
      if (can * can == i) {
        System.out.println(i + " :Lá số chính phương");
      }
    }
  }
}
