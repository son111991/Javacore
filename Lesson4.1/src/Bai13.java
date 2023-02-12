public class Bai13 {
  public static void main(String[] args) {
    //Viết chương trình liệt kê các số thuận nghich có 6 số mà tông chia hết cho 10
    for (int i = 100000; i <1000000 ; i++) {
      if (laSothuannghich(i) && tongChiahet10(i) ){
        System.out.println(i);
      }
    }
  }
  public static boolean laSothuannghich (int n){
    String str = String.valueOf(n);
    int leng = str.length();
    for (int i = 0; i < leng; i++) {
      if (str.charAt(i) != str.charAt(leng - 1 - i)) {
        return false;
      }
    }
    return true;
  }
  public static boolean tongChiahet10 (int n) {
    int S = 0;
    while (n > 0) {
      S += n % 10;
      n /= 10;
    }
    if (S % 10 == 0) {
      return true;
    }
    return false;
  }
}
