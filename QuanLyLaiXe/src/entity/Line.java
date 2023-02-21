package entity;

    public class Line implements Inputable {
  private int id;
  private String distance;
  private int stopnumber;
  private static int auto_ID = 100;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDistance() {
    return distance;
  }


  public void setDistance(String distance) {
    this.distance = distance;
  }

  public int getStopnumber() {
    return stopnumber;
  }

  public void setStopnumber(int stopnumber) {
    this.stopnumber = stopnumber;
  }

  public static int getAuto_ID() {
    return auto_ID;
  }

  public static void setAuto_ID(int auto_ID) {
    Line.auto_ID = auto_ID;
  }

  @Override
  public String toString() {
    return "Line{" +
            "id=" + id +
            ", distance='" + distance + '\'' +
            ", stopnumber=" + stopnumber +
            '}';
  }

  @Override
  public void inputInfo() {
    this.id = auto_ID;
    auto_ID ++;
  }
}
