import java.util.Scanner;

public class tinhtong2 {
  public static void main(String[] args) {
    System.out.println(" Nhập vào n: ");
    int n = new Scanner(System.in).nextInt();
    System.out.println(tongChuSo(n));
  }

  public static int tongChuSo(int n){
    int S =0;
    while ( n >0){
      S = S +n %10;
      n = n/10;
    }return S;
  }
}
