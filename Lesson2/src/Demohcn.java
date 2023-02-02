import java.util.Scanner;

public class Demohcn {
  public static void main(String[] args) {
    System.out.println( "Xin mời nhập chiều dài");
    int chieudai = new Scanner(System.in).nextInt();
    System.out.println("Xin mời nhập chiều rộng");
    int Chieurong = new Scanner(System.in).nextInt();
    System.out.println("Diện tích hcn là " + (chieudai*Chieurong));
    System.out.println("Nhập tên");
    String name = new Scanner(System.in).nextLine();
  }
}
