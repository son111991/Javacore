package Logic;

import Entity.QuanLyBanHang;
import Entity.Sale;

import java.util.Scanner;

public class QuanLyBanHangLogic {
  private QuanLyBanHang[] quanLyBanHangs;
  private final SaleLogic[] saleLogics;
  private MatHangLogic[] matHangLogics;

  public QuanLyBanHangLogic(QuanLyBanHang[] quanLyBanHangs, SaleLogic[] saleLogics, MatHangLogic[] matHangLogics) {
    this.quanLyBanHangs = quanLyBanHangs;
    this.saleLogics = saleLogics;
    this.matHangLogics = matHangLogics;
  }

}
