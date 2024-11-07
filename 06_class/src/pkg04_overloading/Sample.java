package pkg04_overloading;

import java.util.Arrays;

/*
 * 메소드 오버로딩
 * 1. 이름이 같은 메소드가 존재할 수 있다.
 * 2. 매개변수는 서로 달라야한다.
 * 3. 반환 타입은 연관이 없다.
 */

public class Sample {

  // String 배열과 int 배열을 함께 받기 (메소드 이름 통일)
  void printArray(String[] items) {
    System.out.println(Arrays.toString(items));
  }
  
  void printArray(int[] items) {
    System.out.println(Arrays.toString(items));
  }
  
  
  
  
  
  
}
