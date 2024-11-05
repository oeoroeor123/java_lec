package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex03 {

  public static void main(String[] args) {
   
    // 배열 요소 수정하기 (배열 ary의 마지막 3개 요소를 배열 numbers 값으로 수정하기)
    int[] ary = {10, 20, 30, 0, 0, 0};
    int[] numbers = {40, 50, 60};
    
    // 배열 복사하기
    // numbers[0] 요소부터 복사 시작
    // ary[3] 요소로 복사
    // 총 numbers.length 개 만큼 복사
    System.arraycopy(numbers, 0, ary, 3, numbers.length);
    System.out.println(Arrays.toString(ary));
  }

}
