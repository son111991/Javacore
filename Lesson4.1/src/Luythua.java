import java.util.Scanner;

public class Luythua {
  public static void main(String[] args) {
    int a = nhapSo();
    int n = nhapSo();
    long luyThua = 1;
    for (int i = 1; i <=n ; i++) {
      luyThua = luyThua*a;

    }
    System.out.println("KQ");

  }
  public  static  int nhapSo(){
    System.out.println(" Nhập số : ");
    int a =new Scanner(System.in).nextInt();
    return a;
  }
  public  static long tinhLuythua(int a ,int n ){
    long luyThua = 1;
    for (int i = 1; i <=n ; i++) {
      luyThua = luyThua *a;
    }return luyThua;
  }
  public  static long tinhLuyThuaDeQuy (int a , int b){
    int n = 0;
    if ( n == 0){
      return 1;

    }return  a*tinhLuyThuaDeQuy(a , n-1);
  }
}
