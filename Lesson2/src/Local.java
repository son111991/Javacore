import java.time.DayOfWeek;
import java.time.LocalDate;

public class Local {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println(" Ngày tháng năm là :" + date);
    LocalDate bangaytruoc = date.minusDays(3);
    System.out.println("Ba ngày trươc là: " +bangaytruoc);
    LocalDate Bangaysau = date.minusDays(-3);
    System.out.println("Ba ngày sau là :" +Bangaysau);
    boolean leapYear = date.isLeapYear();
    System.out.println(leapYear);

  }
}
