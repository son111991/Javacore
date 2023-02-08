import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class tinhPiwhiletrue {
  public static void main(String[] args) {
    System.out.println( " Nhập số c ( càng nhỏ càng tốt, nhỏ hơn 1: ");
    double c = new Scanner(System.in).nextDouble();
    int i = 0;
    double Pi =0;
    while ( true){
      if (c <(double) 1/(2*i+1)){
      break;
    }
      Pi += Math.pow(-1,i)/(2*i+1);
      i ++;
  }
    Pi *= 4;
    System.out.println("Pi :" + Pi);

}}
