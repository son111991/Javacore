package Class;
import Enum.LoaiBanDoc;

import java.util.Scanner;

public class BanDoc extends Nguoi {
  private int maBanDoc;
  private LoaiBanDoc loaiBanDoc;
  private static int Auto_ID = 10000;

  public int getLoaiBanDoc() {
    return maBanDoc;
  }

  public void setLoaiBanDoc(LoaiBanDoc loaiBanDoc) {
    this.loaiBanDoc = loaiBanDoc;
  }

  public void setLoaiBanDoc(int loaiBanDoc) {
    maBanDoc = loaiBanDoc;
  }

  @Override
  public void inputinfor() {
    this.maBanDoc= Auto_ID;
    Auto_ID++;
    super.inputinfor();
    System.out.println("Nhập loại bạn đọc : ");
    System.out.println("1.Sinh Viên");
    System.out.println("2.Học viên cao học ");
    System.out.println("3.Giảng Viên");
    System.out.println(" Xin mời chọn !");
    int temp ;
    do {
    temp= new Scanner(System.in).nextInt();
    if (temp >=1 && temp <=3){
      break;
    }
      System.out.println("Giá trị không hợp lệ, mời chọn lại !");
    }while (true);
    switch (temp){
      case 1:
        this.loaiBanDoc = LoaiBanDoc.Sinh_Vien;
        break;
      case 2:
        this.loaiBanDoc = LoaiBanDoc.HocVienCaoHoc;
        break;
      case 3:
        this.loaiBanDoc = LoaiBanDoc.Giao_Vien;
        break;
    }
  }
}
