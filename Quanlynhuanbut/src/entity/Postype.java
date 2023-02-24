package entity;

import java.util.Scanner;

public class Postype implements Inputable {
  private int id;
  private String name;
  private String cost;
  private static int AUTO_ID= 10000;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "Postype{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", cost='" + cost + '\'' +
            '}';
  }

  public void inputinfor() {
    this.id = AUTO_ID;
    AUTO_ID ++;
    System.out.println("Nhập tên");
    this.name = new Scanner(System.in).nextLine();
    System.out.println("Nhập giá");
    this.cost = new Scanner(System.in).nextLine();
  }
}
