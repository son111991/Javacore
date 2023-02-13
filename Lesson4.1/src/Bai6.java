import java.util.Scanner;

public class Bai6 {
  public static void main(String[] args) {
    //Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Tìm số lớn thứ hai và vị trí của nó trong dãy.
    // Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
    xuatMang(arr);
    int b = nhapSo(" Nhâp b ");
    int c = nhapSo("Nhâp c");

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
  public  static  void  tinhTBC (int []a, int b , int c){
    int S =0 ;
    int soPhantu = 0;
  }
}
