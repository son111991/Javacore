import java.util.Scanner;

public class Baitap2 {
  public static void main(String[] args) {
    // Giải phương trình : ax2+bx+c
    System.out.println( "Nhập số a :");
    float a = new Scanner(System.in).nextFloat();
    System.out.println("Nhập số b :");
    float b = new Scanner(System.in).nextFloat();
    System.out.println("Nhập sô c :");
    float c = new Scanner(System.in).nextFloat();
    System.out.printf("Giải Phương trình :%.3f ", (float) -c / (2*a + b));
  }
}
