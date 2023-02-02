import java.util.Scanner;

public class Baitap1 {
  public static void main(String[] args) {
    // Giải Pt ax+ b = 0
    System.out.println("Nhập vào số a :");
    float a = new Scanner(System.in).nextFloat();
    System.out.println("Nhập vào số b :");
    float b = new Scanner(System.in).nextFloat();
    System.out.printf("Giải PT :%.3f",(float)-b/a);
  }
}
