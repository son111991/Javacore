import java.util.Scanner;

public class Bai21 {
  public static void main(String[] args) {
    //Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0).
    // Tìm số lớn nhất và nhỏ nhất trong mảng a.
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
    xuatMang(arr);
    timSLNNN(arr);
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
  public static void timSLNNN ( int[] a){
    int max = a[0];
    int viTri = 0;
    int min = a[0];
    int viTri2 = 0;
    for (int i = 1; i <a.length ; i++) {
      if (max < a[i]){
        max = a[i];
        viTri = i  ;
      }
    }
    for (int i = 0; i <a.length ; i++) {
      if (min > a[i]){
        min = a[i];
        viTri2 = i;
      }
    }
    System.out.println(" Số nhỏ nhất là số " +min+" xuất hiện  ở vị trí " + viTri2);
    System.out.println(" Số lớn nhất là số " +max+" xuất hiện  ở vị trí " + viTri);
  }
}
