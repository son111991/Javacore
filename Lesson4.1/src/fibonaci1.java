import java.util.Scanner;

public class fibonaci1 {
  public static void main(String[] args) {
  int n =nhapSo();
  }
  public static int nhapSo(){
    System.out.println(" Nhập số : ");
    return new Scanner(System.in).nextInt();
  }
  public static  long  fibonaci (int n){
    if (n <=1){
      return 1;
    }return fibonaci(n-1)+ fibonaci(n-2);
  }
}
