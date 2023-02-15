package HinhChuNhat;

public class HinhChuNhat {
  float chieuDai;
  float chieuRong;

  public HinhChuNhat(float chieuDai, float chieuRong) {
    this.chieuDai = chieuDai;
    this.chieuRong = chieuRong;
  }

  public double chuVi(){
    return 2*(chieuDai + chieuRong);
  }
  public  double dienTich(){
    return chieuRong*chieuDai;
  }
}
