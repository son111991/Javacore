package Logic;

import entity.Reporter;

import java.util.Scanner;

public class Reporterlogic {
  private Reporter[] reporters;

  public Reporterlogic(Reporter[] reporters) {
    this.reporters = reporters;
  }

  public Reporter[] getReporters() {
    return reporters;
  }

  public void setReporters(Reporter[] reporters) {
    this.reporters = reporters;
  }

  public void inputReporter() {
    System.out.println("Nhập số lượng phóng viên muốn thêm : ");
    int reporterNum = new Scanner(System.in).nextInt();
    for (int i = 0; i < reporterNum; i++) {
      Reporter reporter = new Reporter();
      reporter.inputinfor();
      saveReporter(reporter);

    }
  }

  private void saveReporter(Reporter reporter) {
    for (int j = 0; j < reporters.length; j++) {
      if (reporters[j] == null) {
        reporters[j] = reporter;
        break;
      }
    }
  }

  public void showReporters() {
    for (int i = 0; i < reporters.length; i++) {
      if (reporters[i] != null) {
        System.out.println(reporters[i]);
      }

    }
  }
}
