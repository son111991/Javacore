import java.util.Scanner;

public class vd2 {
  public static class KiemTraSNTTrongMang {

    public static void main(String[] args) {
      int[] arr = nhapMang();
      System.out.println(demSNT(arr));
    }

    public static int[] nhapMang() {
      System.out.println("Nhập số phần tử của mảng: ");
      int n = new Scanner(System.in).nextInt();

      int[] a = new int[n];
      for (int i = 0; i < a.length; i++) {
        System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1));
        a[i] = new Scanner(System.in).nextInt();
      }
      return a;
    }

    public static int demSNT(int[] mang) {
      int count = 0;
      for (int i = 0; i < mang.length; i++) {
        if (kiemTraSNT(mang[i])) {
          count++;
        }
      }
      return count;
    }

    private static boolean kiemTraSNT(int i) {
      if (i < 0) {
        return false;
      }
      if (i == 2 || i == 3) {
        return true;
      }
      int canBacHai = (int) Math.sqrt(i);
      for (int j = 2; j <= canBacHai; j++) {
        if (i % j == 0) {
          return false;
        }
      }
      return true;
    }
  }
}

