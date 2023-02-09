import java.util.Scanner;

public class Bai14 {
  public static void main(String[] args) {
    //Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.
    System.out.println("Nhập số n : ");
    int n = new Scanner(System.in).nextInt();
    for (int i = 1; i < n; i++) {
      if (i % 2 == 0) {
        System.out.println("Các số chẵn nhỏ hơn " + n + " là : " + i);
      } else {
        System.out.println("Các số lẻ nhỏ hơn " + n + " là : " + i);
      }
    }
  }
}