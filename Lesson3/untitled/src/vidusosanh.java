import java.util.Scanner;

public class vidusosanh {
  public static void main(String[] args) {
    System.out.println("Nhập vào số a:");
    float a = new Scanner(System.in).nextFloat();
    System.out.println("Nhập vào số b:");
    float b = new Scanner(System.in).nextFloat();
    if (a>b){
      System.out.println("Số "+a+" lớn hơn số "+b+"");
    }else {
      System.out.println("Số "+a+" nhỏ hơn số "+b+"");
    }
  }
}
