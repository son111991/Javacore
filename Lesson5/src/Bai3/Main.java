package Bai3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    System.out.println(" Nhập vào chiều dài : " );
    int dai = new Scanner(System.in).nextInt();
    rectangle.setHeight(dai);

    System.out.println(" Nhập vào chiều rộng : ");
    int rong = new Scanner(System.in).nextInt();
    rectangle.setWidth(rong);

    System.out.println("Nhập vào màu sắc : ");
    String color = new Scanner(System.in).nextLine();
    rectangle.setColor(color);

    System.out.println("Chu vi HCN là : "+ rectangle.findPerimeter());
    System.out.println("Diện Tích HCN là : "+ rectangle.findArea());
    System.out.println("Màu sắc HCN là : "+rectangle.color);
  }
}
