import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    //Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a và b
    System.out.println(" Nhập số a : ");
    int a = new Scanner(System.in).nextInt();
    System.out.println(" Nhập số b : ");
    int b = new Scanner(System.in).nextInt();
    double ucln = 1;
    for (int i = 1; i <= Math.min(a, b); i++) {
      if (a % i == 0 && b % i == 0) {
        ucln = i;
      }
    }
    System.out.println(" Ước chung lớn nhất của " + a + " và " + b + " là : " + ucln);
    System.out.println(" Bội chung nhỏ nhất của " + a + " và " + b + " là : " + (a * b) / ucln);
  }
}
