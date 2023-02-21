import entity.Driver;
import entity.Line;

import java.util.Scanner;

public class Main {
  private static Driver[] drivers = new Driver[1000];
  private static Line [] lines = new Line[1000];
  public static void main(String[] args) {
    menu();//1


  }

  private static void menu() {
    while (true){
      printmenu();//2
      int funtion = funtionChoice ();//3
      switch (funtion){
        case 1:
          inputNewDiver();
          break;
        case 2:
          showDriver();
          break;
        case 3:
          inputNewLine();
          break;
        case 4:showLine();
          break;
        case 5:
          break;
        case 6:
          break;
        case 7:
          break;
        case 8:
          return;
      }
    }
  }

  private static void showLine() {
    for (int i = 0; i < lines.length ; i++) {
      if ( lines[i ] != null){
        System.out.println(lines[i]);
      }

    }
  }

  private static void inputNewLine() {
    System.out.println(" Nhập số lượng Tuyến mới muốn thêm ");
    int lineNum = new Scanner(System.in).nextInt();
    for (int i = 0; i <lineNum ; i++) {
      Line line = new Line();
      line.inputInfo();
      saveLine(line);
    }
  }

  private static void saveLine(Line line) {
    for (int j = 0; j < lines.length ; j++) {
      if (lines[j]== null){
        lines[j]=line;
        break;
      }
    }
  }

  private static void showDriver() {
    for (int i = 0; i < drivers.length; i++) {
      if (drivers[i] != null){
        System.out.println(drivers[i]);
      }
    }
  }

  private static void inputNewDiver() {
    System.out.println("Nhập số lượng lái xe mới muốn thêm :");
    int driverNum = new Scanner(System.in).nextInt();
    for (int i = 0; i <driverNum ; i++) {
      Driver driver = new Driver();
      driver.inputinfor();
      saveDriver(driver);
    }
  }
  public static void saveDriver(Driver driver){
    for (int j = 0; j <drivers.length ; j++) {
      if (drivers[j]== null){
        drivers[j]=driver;
        break;
      }
    }
  }

  private static int funtionChoice() {
    System.out.print(" Mới bạn chọn chức năng !");
    int temp;
    do {
      temp = new Scanner(System.in).nextInt();
      if (temp >=1 && temp <= 8){
            break;
      }
      System.out.println("Chức năng không hợp lệ mới nhập lại !");
    }
    while (true);
    return temp;
  }


  private static void printmenu() {
    System.out.println("======================Phần mềm quản lý lái xe buýt ! ===============");
    System.out.println(" 1.Nhập Lái xe mới : ");
    System.out.println(" 2.In ra danh sách xe  : ");
    System.out.println(" 3.Nhập danh sách tuyến mới : ");
    System.out.println(" 4.In ra danh sách các tuyến  : ");
    System.out.println(" 5.Nhập danh sách phân công cho các lái xe  : ");
    System.out.println(" 6.Sắp xếp theo danh sách phân công  : ");
    System.out.println(" 7.Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe  : ");
    System.out.println(" 8. Thoát ");
  }
}