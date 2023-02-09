import java.util.Scanner;

public class Bai6 {
  public static void main(String[] args) {
    //Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
    // Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4=32
    System.out.println(" Nhập vào n: ");
    int n = new Scanner(System.in).nextInt();
    int S = 0;
    int sodu = 0;
    while (n>0){
      sodu = n % 10;
      n = n / 10;
      S = S + sodu;
    }
    System.out.println("Tổng các số của n là " + S);
  }
}

