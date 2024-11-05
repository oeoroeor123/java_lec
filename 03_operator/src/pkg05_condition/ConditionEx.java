package pkg05_condition;

public class ConditionEx {

  public static void main(String[] args) {

    // 조건 연산
    int hour = 10;
    String ampm = hour < 12 ? "오전" : "오후";
    System.out.println(ampm);
    
    int time = 16;
    String ampm2 = time < 12 ? "오전" : "오후";
    System.out.println(ampm2);
    
    int score = 50;
    String pass = score >= 60 ? "합격" : score >= 50 ? "재시험" : "불합격";
    System.out.println(pass);
    
    int score2 = 30;
    String pass2 = score2 >= 80 ? "합격" : score2 >= 50 ? "재시험" : "불합격";
    System.out.println(pass2);
  }

}
