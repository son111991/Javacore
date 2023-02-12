import java.util.Scanner;

public class Bai25 {
  //Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0).
  // Đếm xem trong mảng có bao nhiêu số lẻ và bao nhiêu số chẵn.
  public static void main(String[] args) {
    int n = nhapSo("Nhập sô pt mảng : ");
    int[] arr = nhapMang(n);
    xuatMang(arr);
    System.out.println();
    demChanLe(arr);
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
    System.out.print("]");
  }
  public static void demChanLe (int[]a){
    int chan = 0;
    int le = 0;
    for (int i = 0; i < a.length ; i++) {
      if (a[i] %2 == 0){
        chan ++;
      }if (a[i] %2 != 0){
        le ++;
      }
    }
    System.out.println("Số lượng số chẵn là :  "+ chan);
    System.out.println("Số lượng số lẻ là : " +le);
  }
}
