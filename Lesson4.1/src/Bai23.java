import java.util.Scanner;

public class Bai23 {
  //Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
  // Tìm giá trị lớn nhất và nhỏ nhất của ma trận này.
  public static void main(String[] args) {
    int dong = nhapSo ( "Nhập sô dòng ma trận : ");
    int cot = nhapSo(" Nhập sô cột mà trận : ");
    int[][] arr = nhapMaTran(dong,cot);
    xuatMaTran(arr);
    timSLN(arr);

  }
  public static int nhapSo(String thongDiep){
    System.out.println(thongDiep);
    return new Scanner(System.in).nextInt();
  }
  public static int [][] nhapMaTran (int dong,int cot){
    int[] []a = new int[dong][cot];
    for (int i = 0; i < dong; i++) {
      for (int j = 0; j < cot; j++) {
        a[i][j]= nhapSo("a["+i+"]["+j+"] =");
      }
    }return a;
  }
  public static void xuatMaTran(int[][] arr){
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j <arr[0].length ; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void timSLN (int[][] arr){
    int max = arr[0][0];
    int min = arr[0][0];
    for (int i = 0; i <arr.length ; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (max <= arr[i][j]){
          max = arr[i][j];
        }
      }
    }
    for (int i = 0; i <arr.length ; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (min > arr[i][j]){
            min = arr[i][j];
        }
      }
    }
    System.out.println(" Giá trị lớn nhất là : "+max);
    System.out.println(" Giá trị nhỏ nhất là : "+min);
  }
}
