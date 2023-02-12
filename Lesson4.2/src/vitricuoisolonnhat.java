import java.util.Scanner;

public class vitricuoisolonnhat {
  public static void main(String[] args) {
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
    xuatMang(arr);
    timSLN(arr);
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
  public static void timSLN ( int[] a){
    int max = a[0];
    int viTri = 0;
    for (int i = 1; i <a.length ; i++) {
      if (max <= a[i]){
        max = a[i];
        viTri = i +1 ;
      }
    }
    System.out.println(" Số lớn nhất là số " +max+" xuất hiện lần cuối ở vị trí " + viTri);
  }
}
