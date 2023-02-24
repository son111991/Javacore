package Logic;

import entity.Postype;
import entity.Reporter;

import java.util.Scanner;

public class ReportTypelogic {
  private Postype[] postypes;

  public ReportTypelogic(Postype[] postypes) {
    this.postypes = postypes;
  }

  public Postype[] getPostypes() {
    return postypes;
  }

  public void setPostypes(Postype[] postypes) {
    this.postypes = postypes;
  }
  public void inputPostype() {
    System.out.println("Nhập số lượng bài viết mới thêm : ");
    int reportetypeNum = new Scanner(System.in).nextInt();
    for (int i = 0; i < reportetypeNum; i++) {
      Postype postype = new Postype();
      postype.inputinfor();
      savePostype (postype);

    }
  }

  private void savePostype (Postype postype) {
    for (int j = 0; j < postypes.length; j++) {
      if (postypes[j] == null) {
        postypes[j] = postype;
        break;
      }
    }
  }
  public void showPostype() {
    for (int i = 0; i < postypes.length; i++) {
      if (postypes[i] != null) {
        System.out.println(postypes[i]);
      }

    }
  }

}
