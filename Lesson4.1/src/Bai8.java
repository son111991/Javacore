import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
  public static void main(String[] args) {
    //Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
    //In phần tử có số lần xuất hiện nhiều nhất trong a.
    int n = nhapSo("Nhập số lượng phần tử của mảng: ");
    int[] arr = nhapMang(n);
    inMang(arr);
    xuatHienNhieuNhat(arr);
  }

  /**
   * a = [1, 12, 3, 1, 4, 2, 1, 0] --> [0, 1, 1, 1, 2, 3, 4, 12]
   */
  private static void xuatHienNhieuNhat(int[] arr) {
    sapXep(arr);
    System.out.println(Arrays.toString(arr));

    int soCanTim = arr[0];
    int soLanXuatHien = 1;

    int temp = arr[0];
    int countTemp = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == temp) {
        countTemp++;
      } else {
        if (countTemp > soLanXuatHien) {
          soCanTim = temp;
          soLanXuatHien = countTemp;
        }
        temp = arr[i];
        countTemp = 1;
      }
    }
    System.out.println("Số " + soCanTim + " xuất hiện nhiều nhất (" + (Math.max(countTemp, soLanXuatHien)) + " lần)");
  }

  public static void sapXep(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] < a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
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

}
