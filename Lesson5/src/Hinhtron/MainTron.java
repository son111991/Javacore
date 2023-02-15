package Hinhtron;

public class MainTron {
  public static void main(String[] args) {
    Hinhtron hinhtron1 = new Hinhtron(3.5f);
    System.out.println("Chu vi hình tròn là : "+ hinhtron1.chuVi());
    System.out.println("Diện tích l : "+ hinhtron1.dienTich());

    System.out.println("-----------------------");
    Hinhtron hinhtron2 = new Hinhtron(5);
    System.out.println("Chu vi hình tròn là : "+ hinhtron2.chuVi());
    System.out.println("Diện tích l : "+ hinhtron2.dienTich());
  }

}
