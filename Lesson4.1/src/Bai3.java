import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    //Nhập số n và dãy các số nguyêna[0], a[1],..., a[n-1]
    //rồi sắp xếp dãy trên theo thứ tự tăng dần.
  int[] array = nhapMang();
    System.out.println(Arrays.toString(array));
    xapSeptang(array);
    System.out.println(Arrays.toString(array));
  }
  public static int[] nhapMang(){
    System.out.println(" Nhap so phan tu cua mang : ");
    int n =new Scanner(System.in).nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n  ; i++) {
      System.out.println("Nhập giá trị cho phần tử thứ "+(i+ 1)+"  là : ");
      a[i]= new Scanner(System.in).nextInt();
    }return a;
  }
  public static void xapSeptang(int [] arr) {
    int temp = arr[0];
    for (int i = 0 ; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
  }
}
