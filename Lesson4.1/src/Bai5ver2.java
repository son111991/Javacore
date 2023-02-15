import java.util.Scanner;

public class Bai5ver2 {


  public static class Bai05Ver2 {

    public static void main(String[] args) {
      int n = nhapSo("Nhập số lượng phần tử của mảng: ");
      int[] arr = nhapMang(n);
      inMang(arr);
      if (tatCaBangNhau(arr)) {
        System.out.println("Không có số lớn thứ 2 trong mảng vừa nhập");
      } else {
        timSoLonThuHai(arr);
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

    public static boolean tatCaBangNhau(int[] a) {
      int temp = a[0];
      for (int i = 1; i < a.length; i++) {
        if (a[i] != temp) {
          return false;
        }
      }
      return true;
    }

    public static void timSoLonThuHai(int[] a) {
      int max = Integer.MIN_VALUE;
      int second = Integer.MIN_VALUE;
      int viTri = -1;
      for (int i = 0; i < a.length; i++) {
        if (a[i] >= max) {
          max = a[i];
        }
        if (second <= a[i] && a[i] != max) {
          second = a[i];
          viTri = i;
        }
      }

      System.out.println("Số lớn thứ hai là " + second + ", xuất hiện ở vị trí " + viTri);
    }

  }

}
