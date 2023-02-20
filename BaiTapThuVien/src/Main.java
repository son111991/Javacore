import java.util.Scanner;
import Class.BanDoc;
import Class.Sach;
import Class.MuonSach;

public class Main {
  public static BanDoc[] banDocs;
  public static Sach[] saches;
  public static MuonSach [] muonSaches;

  public static void main(String[] args) {
    while (true) {
      showMenuContent();
      logicHandel();
    }
  }

  private static void logicHandel() {
    int luaChon = chooseFuntion();
    switch (luaChon) {
      case 1:
        inputBanDoc();
        break;
      case 2:
        showBanDoc();
        break;
      case 3:
        nhapSach();
        break;
      case 4:
        showSach();
        break;
      case 5:
        muonSach();
        break;
      case 6:
        break;
      case 7:
        break;
      case 8:
        System.exit(0);
    }
  }

  private static void muonSach() {
    System.out.println(" Có mấy người mượn sách !");
    int soNguoiMuonSach = new Scanner(System.in).nextInt();
    for (int i = 0; i < soNguoiMuonSach ; i++) {
      System.out.println(" Nhập mã bạn đọc thứ "+ (i+1)+" muôn mượn sách ");
      int maBanDoc = new Scanner(System.in).nextInt();



    }
  }

  private static int chooseFuntion() {
    System.out.print("Mới chọn chức năng ! ");
    int luaChon;
    do {
      luaChon = new Scanner(System.in).nextInt();
      if (luaChon >= 1 && luaChon <= 8) {
        break;
      }
      System.out.println("Giá trị không hợp lệ, mời chọn lại !");
    } while (true);
    return luaChon;
  }


  private static void showMenuContent() {
    System.out.println("===========Phần mềm quản lý mượn sách =============");
    System.out.println("1.Nhập danh sách bạn đọc mới !");
    System.out.println("2.In ra danh sách bạn đọc ");
    System.out.println("3.Nhập danh sách đầu sách mới ");
    System.out.println("4.In ra danh sách đầu sách đã có");
    System.out.println("5.Quản lý mượn sách");
    System.out.println("6.Sắp xếp danh sách mượn sách");
    System.out.println("7.Tìm kiem danh sách mượn sách");
    System.out.println("8.Thoát");
    System.out.println("===================================================");
  }

  private static void showBanDoc() {
    if (banDocs == null || banDocs.length == 0) {
      System.out.println("Không hợp lệ ");
      return;
    }
    for (int i = 0; i < banDocs.length; i++) {
      System.out.println(banDocs[i]);

    }
  }

  private static void inputBanDoc() {
    System.out.println("Mời nhập số lượng bạn đọc ! ");
    int n = new Scanner(System.in).nextInt();
    banDocs = new BanDoc[n];
    for (int i = 0; i < banDocs.length; i++) {
      banDocs[i] = new BanDoc();
      banDocs[i].inputinfor();
    }
  }

  public static  Sach[] dauSachMoi = new Sach[1000];
  public  static  int numberOfBook = 0;
  public static void nhapSach (){
    System.out.println("Nhập số lượng sách : ");
    int soLuongSach = new Scanner(System.in).nextInt();
    numberOfBook+=soLuongSach;
    for (int i = 0; i < soLuongSach; i++) {
      dauSachMoi[i]= new Sach();
      dauSachMoi[i].input();
    }
  }
  private static void showSach(){
    if (dauSachMoi == null ||dauSachMoi.length == 0){
      System.out.println("Không hợp lệ ");
      return;
    }
    for (int i = 0; i < numberOfBook ; i++) {
      dauSachMoi[i].in();
    }
  }
}