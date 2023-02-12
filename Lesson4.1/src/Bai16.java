import java.util.Scanner;

public class Bai16 {
  public static void main(String[] args) {
    //Nhập số n rồi tính tổng các số tự nhiên không lớn hơn n và
    //chia hết cho 7.
  int n = nhapSo();
  khongLonhonvachiahet(n);
  }
  public static int nhapSo() {
    System.out.println("Nhập số n : ");
    int n = new Scanner(System.in).nextInt();
    return n;
  }
  public  static  void khongLonhonvachiahet (int n){
    int S =0 ;
    for (int i = 1; i <=n ; i++) {
      if (i % 7 ==0 ){
        S +=i;
      }
    }System.out.println(S);
  }



}
