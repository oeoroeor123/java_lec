package pkg02_loop;

public class ForEx {

  public static void main(String[] args) {
    
    // for 문(초기상태; 조건식 ; 상태변화) : 5,4,3,2,1 출력하기
    for(int a = 5; a >= 1; a--) {
      System.out.println(a);
    }
    
    // 1  ~ 10 사이 홀수의 평균 구하기 (합계 / 갯수)
    int total = 0, count = 0; // 초기 값 할당
    for(int b = 1; b <= 10; b++) {
      if(b % 2 == 1) {
        total += b;
        count++;
      }
    }
    
    // int의 경우 정수 나누기로 몫이 나오게됨, double로 실수 나누기 형식으로 변경해줘야 함 
    // 정수와 실수가 섞이면 모두 실수로 값이 출력되어 아래 2가지는 결과가 동일함 > 하나만 형을 변환해주면 됨
    System.out.println((double)total / count);
    System.out.println(total / (double)count);
    
    
    // 3단 구구단 출력
    for(int a = 1; a <= 9; a++) {
      System.out.println("3 x" + a + "=" + (3 * a));
    }
    
    // 구구단 세로 방향으로 출력
    for(int dan =2; dan <= 9; dan++) {
      for(int n = 1; n <= 9; n++) {
        System.out.println(dan + "x" + n + "=" + (dan * n));
      }
    }
    
    for(int dan = 2; dan <= 9; dan++) {
      for(int n = 1; n <= 9; n++) {
        System.out.print(dan + "x" + n + "=" + (dan * n));
      }
      System.out.println();
    }
    
    for(int row = 1; row <= 5; row++) {
      for(int star = 1; star <= row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
