import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    //Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp
    // bằng nhau trong dãy trên (tức là đếm số cặp a[i], a[i+1] sao cho a[i] = a[i+1];
    // nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).
    int[] array = nhapMang();
    System.out.println(Arrays.toString(array));
    demCap(array);
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
  public static void demCap (int []a){
    int count = 0;
    for (int i = 0; i <(a.length -1) ; i++) {
      if ( a[i]== a[i+1]){
        count ++;
      }
    }
    System.out.println("Số cắp liên tiếp bằng nhau : "+count);
  }
}
