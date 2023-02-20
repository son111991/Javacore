package Class;
import Enum.ChuyenNganhSach;

import java.util.Scanner;

public class  Sach {
  private  int ID;
  private static int Auto_ID = 10000;
  private String tenSach;
  private String tacGia;
  private ChuyenNganhSach chuyenNganhSach;
  private int namXuatBan;

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getTenSach() {
    return tenSach;
  }

  public void setTenSach(String tenSach) {
    this.tenSach = tenSach;
  }

  public String getTacGia() {
    return tacGia;
  }

  public void setTacGia(String tacGia) {
    this.tacGia = tacGia;
  }

  public ChuyenNganhSach getChuyenNganhSach() {
    return chuyenNganhSach;
  }

  public void setChuyenNganhSach(ChuyenNganhSach chuyenNganhSach) {
    this.chuyenNganhSach = chuyenNganhSach;
  }

  public int getNamXuatBan() {
    return namXuatBan;
  }

  public void setNamXuatBan(int namXuatBan) {
    this.namXuatBan = namXuatBan;
  }


  @Override
  public String toString() {
    return "Sach{" +
            "ID=" + ID +
            ", tenSach='" + tenSach + '\'' +
            ", tacGia='" + tacGia + '\'' +
            ", chuyenNganhSach='" + chuyenNganhSach + '\'' +
            ", namXuatBan=" + namXuatBan +
            '}';
  }
  public void input (){
    System.out.println(" Nhập tên sách : ");
    this.tenSach = new Scanner(System.in).nextLine();
    System.out.println(" Nhập tác giả : ");
    this.tacGia = new Scanner(System.in).nextLine();
    System.out.println(" Nhập chuyên ngành sách : ");
    System.out.println("1.Khoa Học tự nhiên !");
    System.out.println("2.Văn Học Nghệ Thuật ");
    System.out.println("3.Điện tử viễn thông ");
    System.out.println("4.Công nghệ thông tin ");
    
    System.out.println(" Xin mời chọn !");
    int temp ;
    do {
      temp= new Scanner(System.in).nextInt();
      if (temp >=1 && temp <=4){
        break;
      }
      System.out.println("Giá trị không hợp lệ, mời chọn lại !");
    }while (true);
    switch (temp){
      case 1:
        this.chuyenNganhSach = chuyenNganhSach.KHTN;
        break;
      case 2:
        this.chuyenNganhSach = chuyenNganhSach.VH_NT;
        break;
      case 3:
        this.chuyenNganhSach = chuyenNganhSach.DT_VT;
        break;
      case 4:
        this.chuyenNganhSach = chuyenNganhSach.CN_TT;
        break;
    }
    System.out.println("Nhập Năm Xuất bản ");
    this.namXuatBan = new Scanner(System.in).nextInt();

  }

  public Sach() {
    this.ID = Auto_ID;
    Auto_ID ++;
  }



  public void in (){
    System.out.println(ID);
    System.out.println(tenSach);
    System.out.println(tacGia);
    System.out.println(chuyenNganhSach.getVluae());
    System.out.println(namXuatBan);
  }
}
