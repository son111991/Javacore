import java.util.Scanner;

public class Bai18 {
  public static void main(String[] args) {
    //Nhập 2 số m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không
    //(2 số nguyên tố cùng nhau là 2 số có UCLN là 1)
    int m = nhapSo();
    int n = nhapSo();
    System.out.println(kiemtra(m, n));

  }

  public static int nhapSo() {
    System.out.println("Nhập số x : ");
    int x = new Scanner(System.in).nextInt();
    return x;
  }

  public static boolean kiemtra(int a, int b) {
   if (kiemTraSNT(a) && kiemTraSNT(b)){
     return true;
   }
   return false;
  }
  public static boolean kiemTraSNT(int i) {
    if (i < 2) {
      return false;
    }
    if (i == 2 || i == 3) {
      return true;
    }
    int canBacHai = (int) Math.sqrt(i);
    for (int j = 2; j <= canBacHai; j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }
}
