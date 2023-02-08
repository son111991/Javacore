import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Giaỉ Pt : ax+b = 0
    System.out.println("Nhập vào số a:");
    float a = new Scanner(System.in).nextFloat();
    System.out.println("Nhập vào số b:");
    float b = new Scanner(System.in).nextFloat();
    if ( a == 0) {
      // xử lý trường hợp a=0
    if ( b == 0){
      System.out.println(" Phương trình có nhiệm bằng 0");
      return;
    }}
      System.out.println("Phuơng trình có nghiệm" + (-b/a));}
  }
