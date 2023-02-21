import java.util.Scanner;

import Class.BanDoc;
import Class.Sach;
import Class.MuonSach;
import Class.SachChoMuon;

public class Main {
  public static BanDoc[] banDocs;
  public static Sach[] saches;
  public static MuonSach[] muonSaches;

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
    for (int i = 0; i < soNguoiMuonSach; i++) {
      System.out.println(" Nhập mã bạn đọc thứ " + (i + 1) + " muôn mượn sách ");
      int idBanDoc;
      BanDoc banDoc = null;
      do {
        idBanDoc = new Scanner(System.in).nextInt();

        for (int j = 0; j < banDocs.length; j++) {
          if (banDocs[j].getMaBanDoc() == idBanDoc) {
            banDoc = banDocs[j];
            break;
          }
        }
        if (banDoc != null) {
          break;
        }
        System.out.println("Nhập sai mã ID ");
      } while (true);

      System.out.println("Nhập số lượng đầu sách bạn này muốn mượn ! ");
      int soLuongSach;
      do {
        soLuongSach = new Scanner(System.in).nextInt();

        if (soLuongSach <= 5 && soLuongSach > 0) {
            break;
        }
        System.out.println("Số lượng sách mượn không hợp lệ , mới nhập lại ");
      } while (true);

      SachChoMuon[] sachmuon = new SachChoMuon[soLuongSach];
      for (int j = 0; j <soLuongSach ; j++) {
        System.out.println("Cuốn sách thứ "+(j+1)+"mà bạn đọc này muốn mượn có mã :  ");
        int idSach;
        Sach sach = null;
        do {
          idSach = new Scanner(System.in).nextInt();

          for (int k = 0; k < saches.length; k++) {
            if (saches[k].getID() == idSach) {
              sach = saches[k];
              break;
            }
          }
          if (sach != null) {
            break;
          }
          System.out.println("Nhập sai mã ID ");
        } while (true);
        System.out.println("Số lượng sách mượn ở đầu sách này là bao nhiêu : ");
        int temp;
        do {
          temp = new Scanner(System.in).nextInt();

          if (temp <= 3 && temp > 0) {
            break;
          }
          System.out.println("Số lượng sách mượn không hợp lệ , mới nhập lại ");
        } while (true);
        SachChoMuon sachChoMuon = new SachChoMuon(sach, temp);
        sachmuon[j]= sachChoMuon;
      }
      MuonSach muonSach = new MuonSach(banDoc, sachmuon);

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

  public static Sach[] dauSachMoi = new Sach[1000];
  public static int numberOfBook = 0;

  public static void nhapSach() {
    System.out.println("Nhập số lượng sách : ");
    int soLuongSach = new Scanner(System.in).nextInt();
    numberOfBook += soLuongSach;
    for (int i = 0; i < soLuongSach; i++) {
      dauSachMoi[i] = new Sach();
      dauSachMoi[i].input();
    }
  }

  private static void showSach() {
    if (dauSachMoi == null || dauSachMoi.length == 0) {
      System.out.println("Không hợp lệ ");
      return;
    }
    for (int i = 0; i < numberOfBook; i++) {
      dauSachMoi[i].in();
    }
  }
}