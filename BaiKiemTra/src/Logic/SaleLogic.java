package Logic;


import Entity.Sale;

import java.util.Arrays;
import java.util.Scanner;

public class SaleLogic {
  private Sale[] sales;

  public SaleLogic(Sale[] sales) {
    this.sales = sales;
  }

  public Sale[] getSales() {
    return sales;
  }

  public void setSales(Sale[] sales) {
    this.sales = sales;
  }


  public void addSale() {
    System.out.println("Nhập số lượng nhân viên ");
    int soLuongSale = new Scanner(System.in).nextInt();
    for (int i = 0; i < soLuongSale; i++) {
      Sale sale = new Sale();
      sale.inputTable();
      saveSale(sale);
    }
  }

  private void saveSale(Sale sale) {
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] == null) {
        sales[i] = sale;
        break;
      }
    }
  }

  public void showSale() {
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] != null) {
        System.out.println(sales[i]);
      }
    }
  }

  public Sale searchById(int id) {
    Sale ketqua = null;
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] != null && sales[i].getId() == id) {
        ketqua = sales[i];
        break;

      }
    }
    return ketqua;

  }
}
