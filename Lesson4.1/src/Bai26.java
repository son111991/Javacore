import java.util.Scanner;

public class Bai26 {
  public static void main(String[] args) {
    //Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một số nguyên x.
    // Đếm số lần xuất hiện của x trong mảng a
    int x = nhapSo("Nhập số x: ");
    System.out.println(x);
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
    xuatMang(arr);
    System.out.println();
    demX(arr,x);

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
  }
  public static void demX (int[]a, int x ){
    int count = 0;
    for (int i = 0; i < a.length ; i++) {
      if ( a[i] == x){
      count ++;
      }
    }System.out.println("Số lần xuất hiện của "+x+" là : " +count);
  }
}
