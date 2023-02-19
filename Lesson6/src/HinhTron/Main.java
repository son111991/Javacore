package HinhTron;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println(" Nhập bán kính:  ");
    double r = new Scanner(System.in).nextDouble();

    HinhTron hinhTron = new HinhTron();
    hinhTron.setBanKinh();
    HinhTron hinhTron1= new HinhTron();
  }
}
