import java.util.Scanner;

public class Baitap3 {
  public static void main(String[] args) {
    //Nhập chiều dài, rộng , tính chu vi , diện tích.
    System.out.println("Nhập chiều dài hcn :");
    float a = new Scanner(System.in).nextFloat();
    System.out.println("Nhập chiều rộng hcn :");
    float b = new Scanner(System.in).nextFloat();
    System.out.printf(" Chu vi hình chữ nhật là :%.3f\n" ,(float) 2*(a+b));
    System.out.printf(" Diện tích hình chữ nhật là :%.3f ",(float) a*b );
  }
}
