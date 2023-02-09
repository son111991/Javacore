import java.util.Scanner;

public class vd6 {
  public static void main(String[] args) {
    long n = nhapSo();
    for (int i = 10000; i <= 10000000 ; i++) {
      if (laSNT(i) && laSoThuanNghich(i) && so4(i)){
        System.out.println(i);
      }

    }
  }

  public static long nhapSo() {
    long n = new Scanner(System.in).nextLong();
    System.out.println(" Nhập số n : ");
    return n;
  }

  public static boolean laSNT(int n) {
    int canBacHai = (int) Math.sqrt(n);
    for (int i = 2; i <= canBacHai; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean laSoThuanNghich(int n) {
    String str = String.valueOf(n);
    int leng = str.length();
    for (int i = 0; i < leng; i++) {
      if (str.charAt(i) != str.charAt(leng - 1 - i)) {
        return false;
      }

    }
    return true;
  }

  public static boolean so4(int n) {
    while (n > 0){
    int du = n % 10;
    if (du == 4) {
      return false;
    }
    n /= 10;
  }return true;
}}


