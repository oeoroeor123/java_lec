package pkg04_two_dimension_ex;

import java.util.Arrays;

public class Ex03 {

  public static void main(String[] args) {
    
    // 2차원 배열 회전하기

    /*
     * 1 1 1 1 1          0 0 0 0 1
     * 0 0 1 0 0          0 0 0 0 1
     * 0 0 1 0 0   --->   1 1 1 1 1
     * 0 0 1 0 0          0 0 0 0 1
     * 0 0 1 0 0          0 0 0 0 1
     * ----------------------------
     *    [0][0]   --->   [0][4]
     *    [0][1]   --->   [1][4]
     *    [0][2]   --->   [2][4]
     *    [0][3]   --->   [3][4]
     *    [0][4]   --->   [4][4]
     *   
     *    [1][0]   --->   [0][3]
     *    [1][1]   --->   [1][3]
     *    [1][2]   --->   [2][3]
     *    [1][3]   --->   [3][3]
     *    [1][4]   --->   [4][3]
     *    ...   
     * ----------------------------
     *    [i][j]   --->   [j][4-i]
     */
    
    int[][] T = {
        {1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}
    };
    
int[][] temp = new int[5][5];
    
    for(int i = 0; i < T.length; i++) {
      for(int j = 0; j < T[i].length; j++) {
        temp[j][4-i] = T[i][j];
      }
    }
    
    T = temp;
    
    for(int i = 0; i < T.length; i++) {
      for(int j = 0; j < T[i].length; j++) {
        System.out.print(String.format("%-2d", T[i][j]));
      }
      System.out.println();
    }
    
    
    
  }

}
