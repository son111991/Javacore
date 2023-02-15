import java.util.Arrays;
import java.util.Scanner;

public class Bai10 {
  //Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau.
  // Nếu nhập một số đã có thì yêu cầunhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.
  public static void main(String[] args) {
    int n = nhapSo("Nhập số lượng phần tử của mảng: ");
    int[] ar = nhapMangVer2(n);
    System.out.println(Arrays.toString(ar));
  }

  public static int nhapSo(String thongDiep) {
    System.out.print(thongDiep);
    return new Scanner(System.in).nextInt();
  }


  public static int[] nhapMang(int n) {
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      System.out.println(" [" + i + "] = ");
      a[i] = new Scanner(System.in).nextInt();

      boolean check = false;
      for (int j = i - 1; j >= 0; j--) {
        if (a[i] == a[j]) {
          check = true;
          break;
        }
      }
      if (check) {
        System.out.println("Bạn đã nhập trùng, vui lòng nhập lại");
        i--;
      }
    }
    return a;
  }

  public static int[] nhapMangVer2(int n) {
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "] = ");
      boolean check;
      do {
        check = false;
        a[i] = new Scanner(System.in).nextInt();

        for (int j = i - 1; j >= 0; j--) {
          if (a[i] == a[j]) {
            check = true;
            break;
          }
        }
        if (check) {
          System.out.println("Bạn đã nhập trùng, vui lòng nhập lại");
        }
      } while (check);
    }
    return a;
  }

}
