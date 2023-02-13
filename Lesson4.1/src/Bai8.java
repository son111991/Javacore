import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
  public static void main(String[] args) {
    //Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
    //Kiểm tra xem a có phải là mảng đối xứng hay không
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
    xuatMang(arr);
    xapSeptang(arr);
    System.out.println(Arrays.toString(arr));
    int soCantim = arr[0];
    int soLanXuatHien = 1;
    int temp = arr[0];
    int countTemp = 1;
    for (int i = 1; i <arr.length ; i++) {
      if (arr[i]== temp){
        countTemp ++;
      }else {
        if (countTemp > soLanXuatHien){
          soCantim = temp;
          soLanXuatHien = countTemp;
        }
      }temp =arr [i];
      countTemp =1 ;
      
    }
    System.out.println("Số "+soCantim+" xuât hiện "+soLanXuatHien+"");
  }
  public static int[] nhapMang(int n) {
    System.out.println(" Nhap so phan tu cua mang : ");
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = nhapSo("a[" + i + "] = ");
    }
    return a;
  }

  public static int nhapSo(String thongDiep) {
    System.out.println(thongDiep);
    return new Scanner(System.in).nextInt();
  }

  public static void xuatMang(int[] a) {
    System.out.print("[");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      if (i != a.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
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
