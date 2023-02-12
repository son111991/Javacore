import java.util.Scanner;

public class Bai5 {
  public static void main(String[] args) {
    //Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Tìm số lớn thứ hai và vị trí của nó trong dãy.
    // Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
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
        viTri = i ;
      }
    }
    int max2 = a[0];
    int viTri2 = 0;
    for (int i = 0; i <a.length ; i++) {
      if (a[i] > max2 && a[i] < max){
        max2 = a[i];
        viTri2 = i;
      }
    }System.out.println(" Số lớn nhất là " +max+" xuất hiện ở vị trí " + viTri);
    System.out.println(" Số lớn hai là " +max2+" xuất hiện ở vị trí " + viTri2);
  }
}
