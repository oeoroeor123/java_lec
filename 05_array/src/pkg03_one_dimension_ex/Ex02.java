package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex02 {

  public static void main(String[] args) {
   
    // 알파벳 대문자 A ~ Z까지 배열에 저장하기 (char 26개 저장하기)
    char[] uppers = new char[26];
    for (int i = 0; i < uppers.length; i++) {
      uppers[i] = (char) ('A' + i); // A + 0 = A, A + 1 = B, A + 2 = C .. 하나씩 증가하면서 보여주고, char 타입으로 통일시켜 보여주기
    }
    System.out.println(Arrays.toString(uppers));

  }

}
