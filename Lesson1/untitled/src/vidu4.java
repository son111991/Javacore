import java.util.Scanner;

public class vidu4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" Nhập tên của bạn :");
    String name = input.nextLine();
    System.out.println(" Tên tôi là :" + name);
    System.out.println(" Nhập tuổi của bạn ");
    byte age = input.nextByte();
    System.out.println("Tuổi của tôi là :" + age);
    System.out.println(" Nhập lương của bạn");
    long salary = input.nextLong();
    System.out.println("Lương của tôi là :" +salary);
    System.out.println("Nhập chiêù cao của bạn");
    float height= input.nextFloat();
    System.out.println("Chiều cao của tôi là :" + height);
  }
}
