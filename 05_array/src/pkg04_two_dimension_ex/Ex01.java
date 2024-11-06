package pkg04_two_dimension_ex;

public class Ex01 {

  public static void main(String[] args) {
    
    //  2단 ~ 9단까지 구구단 전체 결과를 2차원 배열에 저장하기
    
    /*
    gugudan[0][0] = 2 * 1
    gugudan[0][1] = 2 * 2
    gugudan[0][2] = 2 * 3
    ...
    gugudan[1][0] = 3 * 1
    gugudan[1][1] = 3 * 2
    gugudan[1][2] = 3 * 3
    ...
    ---------------------
    gugudan[i][j] = (i+2) * (j+1)
*/
    
    int[][] gugudan = new int[8][9]; // 8행 9열
    for(int i = 0; i < gugudan.length; i++) {
      for(int j = 0; j < gugudan[i].length; j++) {
        gugudan[i][j] = (i + 2) * (j + 1); // i보다 2씩 많고, j 보다 1씩 많음
        System.out.print(gugudan[i][j] + " ");
      }
      System.out.println();
    }
    
  }

}
