import java.util.Scanner;

public class giaipt {
  public static void main(String[] args) {
    System.out.println("Nhập số a");
    float a = new Scanner(System.in).nextFloat();
    System.out.println("Nhập số b ");
    float b = new Scanner(System.in).nextFloat();
    System.out.printf("Phương trình : %.3f", (float)-b/a);
  }
}
