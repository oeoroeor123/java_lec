package pkg03_return;

import java.util.Arrays;

public class ReturnEx {

  public static void main(String[] args) {
    
    // Sample 타입의 인스턴스 s 생성
    Sample s = new Sample();
    
    /* 메소드 호출 시
    호출 코드만 있으면 void로 반환 없음
    출력 코드와 함께 있으면 string 같은 반환 존재하는 것
    */
    
    // methodA 호출
    s.methodA(10);
    s.methodA(-2); // 음수인 경우 메소드가 실행되지 않음
    s.methodA(4);
    s.methodA(-5);  // 음수인 경우 메소드가 실행되지 않음
    
    // methodB 호출 (1 전달 : 아메리카노 반환, 2 전달 : 카페라떼 반환, 3 전달 : 아인슈패너 반환, 나머지 전달 : 없는 메뉴 반환)
    System.out.println(s.methodB(1));
    // 반환 값은 호출한 곳으로 전달
    System.out.println(s.methodB(2));
    System.out.println(s.methodB(3));
    System.out.println(s.methodB(4));    

  // methodC 호출 (배열을 반환 받아서 처리)
  String[] parts = s.methodC();
  System.out.println(Arrays.toString(parts));
  
  // mehtodD 호출 (문자열을 반환 받아서 처리)
  String brand = s.methodD();
  System.out.println(brand);

  }
}