package pkg04_two_dimension_ex;

public class Ex02 {

  public static void main(String[] args) {
    
    // 각 층에 거주하는 인원 수 출력하기
    // 1층 : 7명
    // 2층 : 7명
    
    // 2차원 배열 선언 시 초기화
    int[][] apt = {
        {2, 5}, // 첫 번째 1차원 배열의 초기화 > int[2][5];
        {3, 4},
        {1, 4},
        {2, 3},
        {3, 3}
    };
    for(int i = 0; i < apt.length; i++) {
      int total = 0;
      for(int j = 0; j < apt[i].length; j++) {
        total += apt[i][j]; // 각 1차원 배열의 요소를 total 값에 더한다.
      }
      System.out.println((i+1)+ "층 :" + total + "명");
    }
    
    
    
  }

}
