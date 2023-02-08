import java.util.Scanner;

public class sosanh3so {
  public static void main(String[] args) {
    System.out.println("Nhập vào số a:");
    float a = new Scanner(System.in).nextFloat();
    System.out.println("Nhập vào số b:");
    float b = new Scanner(System.in).nextFloat();
    System.out.println(" Nhập vào số c:");
    float c = new Scanner(System.in).nextFloat();
    if (a > b) {
      if (a > c) {
        System.out.println(a + " là số lớn nhất");
      } else {
        System.out.println( c+ " Là số lớn nhất");
      }
    }else {
      if (b >c) {
        System.out.println(b + " Là số lớn nhất");
      }else {
        System.out.println(c+ " Là số lớn nhất");}
    }}}

