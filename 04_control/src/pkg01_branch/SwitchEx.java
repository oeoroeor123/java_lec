package pkg01_branch;

public class SwitchEx {

  public static void main(String[] args) {
   
    // Switch문 : 짝수 홀수 구하기
    int a = 4;
    switch(a % 2) { // a를 2로 나눈 int 나머지값 전달 (0 또는 1)
    case 0:
      System.out.println(a + "는 짝수");
      break; // switch 문은 조건과 일치하는 곳부터 끝까지 결과로 반환, 멈추려면 break 사용
    case 1:
      System.out.println(a + "는 홀수");
      break;
    }
    
    String state = "대기"; // 대기 / 승인 / 거부
    switch (state) {
    case "대기" :
      System.out.println("대기 중");
      break;
    case "승인" :
      System.out.println("승인 완료");
      break;
    case "거부" :
      System.out.println("거부 완료");
      break;
    } 
  }

}
