import java.util.Scanner;

public class Bai7 {
  public static void main(String[] args) {
    //Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
    //Kiểm tra xem a có phải là mảng đối xứng hay không
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
    xuatMang(arr);
    mangThuannghich(arr,n);

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
    System.out.println("]");
  }
  public static void mangThuannghich (int[] a, int n) {
    int thuanNghic = 0;
    for (int i = 0; i <= n/2 ; i++) {
      if (a[i] != a[n -1 -i]){
          thuanNghic ++;
          break;
      }
    }if (thuanNghic == 0){
      System.out.println( " Là mảng thuận nghịch");
    }else {
      System.out.println(" Không là mảng thuận nghịch ");
    }
  }
}
