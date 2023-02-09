import java.util.Scanner;

public class Bai5 {
  public static void main(String[] args) {
    //Một số được gọi là số thuận nghịch nếu ta đọc từ trái sang phải hay từ phải sang trái
    // số đó ta vẫn nhận được một số giống nhau. Hãy nhập một số và kiểm tra xem số đó có phải số
    // thuật nghịch hay không (ví dụ số: 558855).
    String number = new Scanner(System.in).nextLine();
    String numberdao = "";
    for (int i = 0; i <number.length() ; i++) {
      numberdao  = number.charAt(i) + numberdao;
    }
    System.out.println(number);
    System.out.println(numberdao);
    if (number.compareTo(numberdao) == 0){
      System.out.println("Là số nghịch đảo !");
    }
  }
}
