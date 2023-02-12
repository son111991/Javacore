public class Bai2 {
  public static void main(String[] args) {
    //Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
    //a) Là số nguyên tố.
    //b) Tất cả các chữ số là nguyên tố
    //c) Đảo của nó cũng là một số nguyên tố
    for (int i = 1000000; i <10000000 ; i++) {
      if (kiemTraSNT(i)&& cacChuSNT(i)&& soDao(i)){
        System.out.println(i);
      }
    }
  }
  public static boolean kiemTraSNT(int i) {
    if (i < 2) {
      return false;
    }
    int canBacHai = (int) Math.sqrt(i);
    for (int j = 2; j <= canBacHai; j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }
  public static boolean cacChuSNT (int n) {
    while (n > 0){
      if (!kiemTraSNT(n % 10 ) ){
        return false;
      }
      n/=10;
    }
    return true;
  }
  public static boolean soDao (int n){
    int soDao = 0;
    while (n > 0){
      soDao = soDao *10 + n %10;
      n = n/10;
    }
    if (kiemTraSNT(soDao)){
      return true;
    }
    return false;
  }
}
