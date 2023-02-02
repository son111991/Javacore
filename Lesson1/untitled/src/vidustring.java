import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class vidustring {
  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "Java";
    String s3 = new String("Java");
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    LocalDate toDay = LocalDate.now();
    System.out.println(toDay);
    System.out.println("Năm hiện tại " +toDay.getYear());
    System.out.println("Tháng hiện tại là:" +toDay.getMonth());
    System.out.println("Ngày hiện tại là " +toDay.getDayOfMonth());
    LocalTime time= LocalTime.now();
    System.out.println("Giờ hiện tại là" +time);
    System.out.println("Giờ là: "+ time.getHour());
    System.out.println("Phút là: "+ time.getMinute());
    // cong them gio
    System.out.println("Công thêm 3 tiếng là: "+time.plusHours(3));
    System.out.println("Trừ 5 tiếng là :" +time.minusHours(5));
    // Giờ Hồ Chí Minh city
    LocalTime TimeInHCM = LocalTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
    System.out.println("Giờ tại HCM city là " +TimeInHCM);
    int x =29;
    if (x%2 == 0){
      System.out.println(x + " Là số chẵn");
    }else {
      System.out.println(x + " Là số lẻ");
    }
  }

}
