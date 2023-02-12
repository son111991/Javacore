import java.util.Scanner;

public class Bai19 {
  //Tính trung bình cộng các phần tử trong một mảng số nguyên được nhập từ bàn phím.
  public static void main(String[] args) {
    int[] arr = nhapMang();
    System.out.println("TBC : "+ tinhTBC(arr));
  }
  public static int[] nhapMang(){
    System.out.println(" Nhập số phần tử của mảng : ");
    int n = new Scanner(System.in).nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1));
      a[i] = new Scanner(System.in).nextInt();
    }
    return a;
  }
  public static double tinhTBC(int[] mang){
    int S = 0;
    for (int i = 0; i < mang.length ; i++) {
      S+= mang[i];
    }
    return (double)S/mang.length ;
  }
}
