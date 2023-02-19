package HinhChuNhat;

public class HinhChuNhat {
  private double dai;
  private double rong;

  public double getDai() {
    return dai;
  }

  public void setDai(double dai) {
    if (!isValueLenght(dai)){
      System.out.println("");
      return;
    }
    this.dai = dai;
  }

  public double getRong() {
    return rong;
  }

  public void setRong(double rong) {
    this.rong = rong;
  }
  public double chuVi (){
    return 2*(dai+rong);
  }
  public double dienTich(){
    return  dai*rong;
  }
  private boolean isValueLenght (double x){
    return x>0;
  }
}
