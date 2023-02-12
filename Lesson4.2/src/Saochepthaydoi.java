import java.util.Scanner;

public class Saochepthaydoi {
  public static void main(String[] args) {
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
    xuatMang(arr);
    sapXep(arr);
    xuatMang(arr);
  } public static int[] nhapMang(int n) {
    System.out.println(" Nhap so phan tu cua mang : ");
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = nhapSo("a[" + i + "] = ");
    }
    return a;
  }

  public static int nhapSo(String thongDiep) {
    System.out.println(thongDiep);
    return new Scanner(System.in).nextInt();
  }

  public static void xuatMang(int[] a) {
    System.out.print("[");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      if (i != a.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }
  public static void sapXep(int[]a){
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length ; j++) {
        if (a[i]> a[j]){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }
}
