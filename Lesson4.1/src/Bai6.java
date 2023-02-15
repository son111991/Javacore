import java.util.Scanner;

public class Bai6 {
  //Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số nguyên b, c (b < c).
  //Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].
  public static void main(String[] args) {
    int n = nhapSo("Nhập số lượng phần tử của mảng: ");
    int[] arr = nhapMang(n);
    inMang(arr);
    int b = nhapSo("Nhập số b: ");
    int c = nhapSo("Nhập số c: ");
    tinhTrungBinhCong(arr, b, c);

  }

  public static int nhapSo(String thongDiep) {
    System.out.print(thongDiep);
    return new Scanner(System.in).nextInt();
  }

  public static int[] nhapMang(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = nhapSo("a[" + i + "] = ");
    }
    return a;
  }

  public static void inMang(int[] a) {
    System.out.print("[");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      if (i != a.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  public static void tinhTrungBinhCong(int[] a, int b, int c) {
    int S = 0;
    int soLuongPhanTu = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= b && a[i] <= c) {
        S += a[i];
        soLuongPhanTu++;
      }
    }

    if (soLuongPhanTu == 0) {
      System.out.println("Không có số nào trong mảng nằm trong đoạn [" + b + ";" + c + "]");
      return;
    }

    System.out.println("Trung bình cộng các phần tử trong mảng có giá trị nằm trong đoạn [" + b + ";" + c + "] là " + ((float) S / soLuongPhanTu));

  }

}
