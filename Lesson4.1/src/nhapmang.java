import java.util.Arrays;
import java.util.Scanner;

public class nhapmang {
  public static void main(String[] args) {
    System.out.println(" Nhap so phan tu cua mang : ");
    int n =new Scanner(System.in).nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length ; i++) {
      System.out.println("Nhap gia tri cho phan tu thu " + (i+1));
      a[i] = new Scanner(System.in).nextInt();
    }
    System.out.println(Arrays.toString(a));
  }
}
