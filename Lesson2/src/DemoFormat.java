import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DemoFormat {
  public static void main(String[] args) throws ParseException {
    String birthday= "1991/11/10";
    SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date parse = simpleDateFormat.parse("10/11/1991 10:30:21");
    System.out.println(parse);
    Date date = new Date();
    System.out.println(date.getYear()-parse.getYear());
    System.out.println("-------------");
  }
}

