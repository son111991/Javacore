import java.util.Scanner;


public class Tinhtong {
  public static void main(String[] args) {
    int a = nhapso();
    int b = nhapso();
    System.out.println(" Tổng là : " +(a+b));
  }

  // xây dựng 1 phương thức để nhập vào số :
  public static int nhapso() {
    System.out.println(" Mời nhập số ");
    int n = new Scanner(System.in).nextInt();
    return n;
  }

  // Xây dựng hàm tính tổng :
  public int tinhTong(int a, int b) {
    int tong = a + b;
    return tong;
  }

  public boolean kiemtraSNT(int n) {
    if (n < 0) {
      return false;
    }
    int canBacHai = (int) Math.sqrt(n);
    for (int i = 2; i <= canBacHai; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

