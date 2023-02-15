package Hinhtron;

public class Hinhtron {
  float banKinh;

  public Hinhtron(float banKinh) {
    this.banKinh = banKinh;
  }

  public double dienTich (){
    return Math.PI *banKinh *banKinh;
  }
  public double chuVi (){
    return Math.PI *banKinh *2;
  }
}
