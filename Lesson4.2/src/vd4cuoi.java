import java.util.Scanner;

public class vd4cuoi {
  public static void main(String[] args) {
    int n = nhapSo("Nhập sô pt mảng : ");
    System.out.println("Nhập thông tin mảng A ");
    int[] arr1 = nhapMang(n);
    xuatMang(arr1);

    int m = nhapSo("Nhập sô pt mảng : ");
    System.out.println("Nhập thông tin mảng b ");
    int[] arr2 = nhapMang(m);
    xuatMang(arr2);

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
  }
  public static int[] tinhTong(int[] arr1, int arr2[]){
    int[] s = new int[arr1.length];
    for (int i = 0; i <arr1.length ; i++) {
      s[i] = arr1[i]+ arr2[arr1.length - i -1];
    }
    return s;
  }
}
