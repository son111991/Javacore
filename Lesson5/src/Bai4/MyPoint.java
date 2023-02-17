package Bai4;

public class MyPoint {
  double x ;
  double y ;
  public MyPoint (){

  }
  public MyPoint (double x , double y){
    this.x = x ;
    this.y = y;
  }
  public MyPoint(MyPoint myPoint){
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

}
