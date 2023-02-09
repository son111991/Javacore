import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    //Viết chương trình liệt kê n số nguyên tố đầu tiên
    System.out.println("Nhập vào sô n : ");
    int n = new Scanner(System.in).nextInt();
    int number = 2;
    while ( n > 0) {
      int cout = 0;
      for (int i = 2; i <= number; i++) {
        if (number % i == 0) {
          cout++;
        }
      }
      if (cout == 1) {
        System.out.println(number);
        n --;
      }
      number ++;
    }
  }
}
