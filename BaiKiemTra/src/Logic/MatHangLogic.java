package Logic;

import Entity.MatHang;

import java.util.Arrays;
import java.util.Scanner;

public class MatHangLogic {
  private MatHang[] matHangs;

  public MatHangLogic(MatHang[] matHangs) {
    this.matHangs = matHangs;
  }

  public MatHang[] getMatHangs() {
    return matHangs;
  }

  public void setMatHangs(MatHang[] matHangs) {
    this.matHangs = matHangs;
  }


  public void addMatHang (){
    System.out.println("Nhập số lượng mặt hàng muốn thêm ! ");
    int soLuongMatHang = new Scanner(System.in).nextInt();
    for (int i = 0; i <soLuongMatHang ; i++) {
      MatHang matHang = new MatHang();
      matHang.inputTable();
      saveMathang(matHang);
    }
  }

  private void saveMathang(MatHang matHang) {
    for (int i = 0; i < matHangs.length ; i++) {
      if ( matHangs[i] == null ){
        matHangs[i] = matHang ;
       break;
      }
    }
  }
  public void showMatHang (){
    for (int i = 0; i < matHangs.length ; i++) {
      if (matHangs[i] != null){
        System.out.println(matHangs[i]);
      }
    }
  }
}
