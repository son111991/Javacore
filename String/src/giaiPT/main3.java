package giaiPT;

import java.util.Scanner;

public class main3 {
  public static void main(String[] args) {
    System.out.println(" nhập số a: ");
    float a = new Scanner(System.in).nextFloat();
    System.out.println(" nhập số b: ");
    float b = new Scanner(System.in).nextFloat();
    System.out.println(" nhập số c: ");
    float c = new Scanner(System.in).nextFloat();

    if (a == 0 && b == 0 && c == 0) {
      System.out.println("Phương trình vô số nghiệm !");
      return;

    }
    if (a == 0) {
      if (b != 0) {
        System.out.printf("PT có nghiệm %.3f", -c / b);
        return;
      }
      System.out.println("PT vô nghiêm");
      return;
    }
    float delta = b * b - 4 * a *c ;
    if (delta < 0){
      System.out.printf("PT có ngiệm kép ");
    }
  }

}

