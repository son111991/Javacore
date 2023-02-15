import java.util.Random;

public class Bai9 {
  //Viết chương trình tạo ngẫu nhiên mảng a gồm N phần tử bao gồm
  // các số nguyên. In ra các số khác nhau trong dãy.
  public static void main(String[] args) {
    int n = new Random().nextInt(50);
    System.out.println(n);
    int[] array = randomArray(n);
    inMang(array);

  }

  public static int[] randomArray(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = new Random().nextInt(100);
    }
    return a;
  }

  public static void inMang(int[] a) {
    System.out.println(a[0]);
    for (int i = 1; i < a.length; i++) {
      boolean trung = false;
      for (int j = i - 1; j <= 0; j++) {
        if (a[i] == a[j]) {
          trung = true;
          break;
        }
      }
      if (!trung) {
        System.out.println(a[i]);
      }
    }
  }
}
