public class Baitap5 {
  public static void main(String[] args) {
    //a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và
    //cuối cùng của ký tự đó trong chuỗi vừa nhập.
    String s1="chúng@ tôi học coder@";
    System.out.println(s1.indexOf('@'));
    System.out.println(s1.lastIndexOf('@'));
    //Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế
    //bằng s2. Xuất s ra màn hình
    String s2 = "TIM KIEM VA THAY THE ";
    String s3 = "TH";
    String s4 = "123";
    System.out.println(s2.replace("TH",s4));
    System.out.println(s2.replace("K",s3));
    System.out.println(s2.contains(s3));



  }
}
