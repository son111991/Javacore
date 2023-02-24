package Entity;

import java.util.Arrays;

public class QuanLyBanHang {
  private Sale sale;
  private MatHangNVban[]matHangNVbans;
  private int soLuong;

  public QuanLyBanHang(Sale sale, MatHangNVban[] matHangNVbans, int soLuong) {
    this.sale = sale;
    this.matHangNVbans = matHangNVbans;
    this.soLuong = soLuong;
    int temp= 0;
    for (int i = 0; i < matHangNVbans.length ; i++) {
      temp +=matHangNVbans[i].getSoLuong();
    }
    this.soLuong= temp;
  }

  public Sale getSale() {
    return sale;
  }

  public void setSale(Sale sale) {
    this.sale = sale;
  }

  public MatHangNVban[] getMatHangNVbans() {
    return matHangNVbans;
  }

  public void setMatHangNVbans(MatHangNVban[] matHangNVbans) {
    this.matHangNVbans = matHangNVbans;
  }

  public int getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(int soLuong) {
    this.soLuong = soLuong;
  }

  @Override
  public String toString() {
    return "QuanLyBanHang{" +
            "sale=" + sale +
            ", matHangNVbans=" + Arrays.toString(matHangNVbans) +
            ", soLuong=" + soLuong +
            '}';
  }
}
