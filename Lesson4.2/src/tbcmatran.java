import java.util.Scanner;

public class tbcmatran {
  public static void main(String[] args) {
    int dong = nhapSo ( "Nhập sô dòng ma trận : ");
    int cot = nhapSo(" Nhập sô cột mà trận : ");
    int[][] arr = nhapMaTran(dong,cot);
    xuatMaTran(arr);
    tinhTong(arr);

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
  public static void tinhTong (int[][] arr){
    int sum = 0;
    for (int i = 0; i <arr.length ; i++) {
      for (int j = 0; j <arr[0].length ; j++) {
        sum += arr[i][j];
      }
    }
    System.out.println(" Tổng là : " + sum);
    System.out.println("TBC là :" + (float)sum/(arr.length*arr[0].length) );
  }
}
