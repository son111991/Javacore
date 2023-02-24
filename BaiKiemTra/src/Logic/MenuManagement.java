package Logic;

import Entity.MatHang;
import Entity.Sale;

import java.util.Scanner;


public class MenuManagement {
  private MatHangLogic matHangLogic;
  private SaleLogic saleLogic;

  public MenuManagement() {
    MatHang[] matHangs = new MatHang[1000];
    matHangLogic = new MatHangLogic(matHangs);

    Sale[] sales = new Sale[1000];
    saleLogic = new SaleLogic(sales);
  }

  public void menu() {
    while (true) {
      showMenu();
      int funtionChoice = chooseFuntion();
      switch (funtionChoice) {
        case 1:
          matHangLogic.addMatHang();
          break;
        case 2:
          matHangLogic.showMatHang();
          break;
        case 3:
          saleLogic.addSale();
          break;
        case 4:
          saleLogic.showSale();
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

  private int chooseFuntion() {
    System.out.println("Mới bạn chọn chức năng !");
    int temp;
    do {
      temp = new Scanner(System.in).nextInt();
      if (temp >= 1 && temp <= 8) {
        break;
      }
      System.out.println("Nhập sai xin mời nhập lại !");
    } while (true);
    return temp;
  }

  private void showMenu() {
    System.out.println("==================Phần mềm quản lý Bán hàng ================== ");
    System.out.println("1.Nhập danh sách mặt hàng mới : ");
    System.out.println("2.In danh sách mặt hàng mới : ");
    System.out.println("3.Nhập danh sách nhân viên : ");
    System.out.println("4.In danh sách nhân viên : ");
    System.out.println("5.Lập bảng danh sách bán hàng ");
    System.out.println("6.Xắp sếp danh sách bán hàng ");
    System.out.println("7.Lập bảng kê doanh thu  ");
    System.out.println("8.Thoát ! ");
  }
}
