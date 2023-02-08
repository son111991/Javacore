import java.util.Scanner;

public class vdtinhpi {
  public static void main(String[] args) {
    System.out.println( " Nhập số c ( càng nhỏ càng tốt, nhỏ hơn 1: ");
    double c = new Scanner(System.in).nextDouble();
    double Pi = 0;
    for (int i = 0; c <(double) 1/(2*i+1); i++) {
      Pi += Math.pow(-1,i)/(2*i+1);
    }
    Pi *= 4;
    System.out.println("Pi :" + Pi);
  }
}
