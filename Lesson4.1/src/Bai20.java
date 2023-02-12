import java.util.Scanner;

public class Bai20 {
  public static void main(String[] args) {
    //Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0).
    //Tìm số lớn nhất xuất hiện trong dãy và vị trí xuất hiện đầu tiên của nó.
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
      if (max < a[i]){
        max = a[i];
        viTri = i  ;
      }
    }
    System.out.println(" Số lớn nhất là số " +max+" xuất hiện lần đầu ở vị trí " + viTri);
  }
}
