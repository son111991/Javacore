public class Main {
  public static void main(String[] args) {
    String s1 = "Hello ";// nên dùng
    String s2 = new String("Hello");
    String s3 = " World";
    String s4 = s1 + s3;
    System.out.println(s4);
    System.out.println("-----------------------------");
    String s10 = "My computer com";
    System.out.println(s10.indexOf('c'));
    System.out.println(s10.indexOf("ut"));
    System.out.println(s10.lastIndexOf('c'));
    System.out.println(s10.charAt(5));
    System.out.println("--------------------");
    String s20 = "     Techmaster Java Core     ";
    System.out.println("'" +s20.toLowerCase() + "'");
    System.out.println("'" +s20.toUpperCase()+ "'");
    System.out.println("'" +s20.trim()+ "'");
    System.out.println(s20.substring(10));
    System.out.println(s20.substring(10,15));
    System.out.println("Vodermode\t là kẻ mà ai \n\"cũng biết là ai đây\"");
  }
}