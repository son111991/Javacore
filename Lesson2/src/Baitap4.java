import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Baitap4 {
  public static void main(String[] args) throws ParseException {
    //Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định (nhập chuỗi), tính tuổi của
    //người đó (chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng).
    String ngaysinh ="Ngày sinh của ông A : 10/11/1989";
    System.out.println(ngaysinh);
    Date ngayhomnay = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date parse = simpleDateFormat.parse("10/11/1989");
    System.out.println(parse);
    System.out.println("Ngày hôm nay là :" +ngayhomnay);
    System.out.println("Số tuổi của ông A là :");
    System.out.println( ngayhomnay.getYear()- parse.getYear());
  }
}
