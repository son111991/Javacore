import java.util.Scanner;

public class sogannhat {
  public static void main(String[] args) {
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
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
    System.out.print("]");
  }public static  void timKiem (int[]a, float x){
    float kcBeNhat = 0;
    int viTriTimDuoc = 0;
    int giaTriTimDuoc = a[0];
    for (int i = 1; i <a.length ; i++) {
      float khoangCach = Math.abs(a[i]-x);
      if ( khoangCach < kcBeNhat){
        kcBeNhat= khoangCach;
        viTriTimDuoc = i ;
        giaTriTimDuoc = a[i];
      }

    }
    System.out.println(" Số gần nhất với "+x+" là " + giaTriTimDuoc + " nằm ở vị trí " + viTriTimDuoc);
  }
}
