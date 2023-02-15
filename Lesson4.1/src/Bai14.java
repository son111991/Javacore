import java.util.Scanner;

public class Bai14 {
  public static void main(String[] args) {
    //Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính phương
    // trong đoạn [m,n]. Có bao nhiêu số chính phương?
    int m = nhapSo();
    int n = nhapSo();
    soChinhphuong(m,n);

  }
  public static int nhapSo(){
    System.out.println("Nhập số  : ");
    int n = new Scanner(System.in).nextInt();
    return n;
  }
  public static void soChinhphuong(int m , int n){
    for (int i = m; i <= n ; i++) {
        int can = (int) Math.sqrt(i);
        if (can * can == i){
        System.out.println(i);
      }
    }
  }
}
