public class Bai1 {
  public static void main(String[] args) {
    //Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
    //a) Là số thuận nghịch.
    //b) Chỉ có chữ số 0, 6, 8
    //c) Tổng chữ số chia hết cho 10
    for (int i = 1000000; i <= 100000000; i++) {
      if (thuanNghich(i) && chua068(i) && tongChiaHetMuoi(i)){
        System.out.println(i);
      }
    }
  }

  public static boolean thuanNghich(int n) {
    int a = n, nNghich = 0;
    while (a != 0) {
      nNghich = nNghich * 10 + a % 10;
      a /= 10;
    }
    if (n == nNghich) {
      return true;
    }
    return false;
  }

  public static boolean chua068(int n) {
    while (n != 0) {
      int sodu = n % 10;
      if (sodu != 0 && sodu != 6 && sodu != 8) {
        return false;
      }
      n /= 10;
    }
    return true;
  }

  public static boolean tongChiaHetMuoi(int n) {
    int S = 0;
    while (n != 0) {
      S += n % 10;
      n /= 10;
    }
    if (S % 10 == 0) {
      return true;
    }
    return false;
  }
}
