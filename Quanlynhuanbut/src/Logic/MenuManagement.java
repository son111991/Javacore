package Logic;

import entity.Postype;
import entity.Reporter;

import java.util.Scanner;

public class MenuManagement {
  private Reporterlogic reporterlogic;
  private ReportTypelogic reportTypelogic;

  public MenuManagement(){
    Reporter [ ] reporters = new  Reporter[1000];
    reporterlogic = new Reporterlogic(reporters);

    Postype [] postypes = new Postype[1000];
    reportTypelogic = new ReportTypelogic(postypes);
  }
  public void menu(){
    while (true) {
      showmenu();
      int funtionChoice = chooseFuntion();
      switch (funtionChoice) {
        case 1:
          reporterlogic.inputReporter();
          break;
        case 2:
          reporterlogic.showReporters();
          break;
        case 3:
          reportTypelogic.inputPostype();
          break;
        case 4:
          reportTypelogic.showPostype();
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





  private  int chooseFuntion() {
    System.out.print(" Mới bạn chọn chức năng !");
    int temp;
    do {
      temp = new Scanner(System.in).nextInt();
      if (temp >= 1 && temp <= 8) {
        break;
      }
      System.out.println("Chức năng không hợp lệ mới nhập lại !");
    }
    while (true);
    return temp;
  }

  private  void showmenu() {
      System.out.println("======================Phần mềm quản lý trả nhuận bút ! ===============");
      System.out.println(" 1.Nhập phóng viên mới: ");
      System.out.println(" 2.In ra danh sách phóng viên  mới : ");
      System.out.println(" 3.Nhập danh sách bài viết mới: ");
      System.out.println(" 4.In ra danh sách các bài viết: ");
      System.out.println(" 5.Nhập bảng tính  công cho các phóng viên: ");
      System.out.println(" 6.Sắp xếp bảng tính công công: ");
      System.out.println(" 7.Lập bảng kê thu nập phóng viên: ");
      System.out.println(" 8. Thoát ! ");
    }
  }

