import java.util.Scanner;

public class nhapmanghaichieu {
  public static void main(String[] args) {
    int dong = nhapSo ( "Nhập sô dòng ma trận : ");
    int cot = nhapSo(" Nhập sô cột mà trận : ");
    int[][] maTran = nhapMaTran(dong, cot);
    xuatMaTran(maTran);

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
}
