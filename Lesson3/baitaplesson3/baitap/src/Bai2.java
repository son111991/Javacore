import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    //Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?
    System.out.println("Nhập vào số n: ");
    int n = new Scanner(System.in).nextInt();
    int S = 0;
    for (int i = 1; i<= n; i++) {
      if (n % i == 0){
      S ++;
      System.out.println(" Ước của "+n+" là :" +i);
      }}
    System.out.println("Số ước của n là :" + S);
  }
}

