import java.util.Scanner;

public class timkiemdemo {
  public static void main(String[] args) {
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
    xuatMang(arr);
    System.out.println("------------");
    int x = nhapSo("Nhập x ");
    int ketQua = timKiem(arr, x);
    if (ketQua == -1) {
      System.out.println("Số " + x + " không xuất hiện trong mảng ");
    } else {
      System.out.println("Số " + x + " xuất hiện trong mảng và ở vị trí :  " + ketQua);
    }
  }

  public static int[] nhapMang(int n) {
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
    System.out.print("]");
  }

  public static int timKiem(int[] a, int x) {
    int result = -1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == x) {
        result = i;
        break;
      }
    }
    return result;
  }
}