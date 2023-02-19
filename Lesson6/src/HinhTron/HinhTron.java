package HinhTron;

public class HinhTron {
  private double banKinh;

  public HinhTron() {
    if (!isValidBanKinh(banKinh)){
      System.out.println("Bán kính pahir dương ");
      return;
    }
    this.banKinh = banKinh;
  }

  public double getBanKinh() {
    return banKinh;
  }


  public void setBanKinh() {
    if (!isValidBanKinh(banKinh)){
      System.out.println(" Bán kính phải duơng");
      return;
    }
    this.banKinh = banKinh;
  }

  public double chuVi(){
    return Math.PI* 2 *banKinh;
  }
  public double dienTich(){
    return Math.PI *banKinh*banKinh;
  }
  public  boolean isValidBanKinh (double r){
    return r>0;
  }
}
