import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    System.out.println(kiemTraSNT(n));
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
