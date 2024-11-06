package pkg02_parameter;

import java.util.Arrays;

/*
 메소드 만드는 방법 ([] : 생략 가능)
   반환타입 메소드명([매개변수]) {
   본문
   [return 반환값]
 }
 */

public class Sample {
/**
 * @param 없음
 */
  void methodA() {
    System.out.println("methodA");
  }
  
  /**
   * @param word 문자열을 전달 받는다. 
   */
  void methodB(String word) {
    System.out.println(word);
  }
  
  /**
   * @param word 문자열을 전달 받는다.
   * @param number 정수 값을 전달 받는다.
   */
  void methodC(String word, int number) {
    System.out.println(word + "," + number);
  }

  /**
   * @param car Car 클래스 타입의 인스턴스를 전달 받는다.
   * @param city String 타입의 도시 이름을 전달 받는다.
   */
  void methodD(Car car, String city) {
    // System.out.print(city + "으로 ");
    car.drive(city); // city를 drive 메소드에 인자로 사용
  }
  
  /**
   * @param items String[] 타입의 배열을 전달 받는다.
   */
  void methodE(String[] items) {
    System.out.println(Arrays.toString(items));
  }
  
  /**
   * @param args String 타입의 인자를 0개 이상 전달 받는다. (args = 배열)
   */
  void methodF(String...args) {
    System.out.println(Arrays.toString(args));
  }

}
