package pkg02_Functional_Interface;

import java.util.function.Predicate;

/*
 * package java.util.function
 * 
 * @FunctionalInterface Annotation
 * public interface predicate<T> {
 *  boolean test(T t); : true, false 값 반환
 * }
 */

public class Class04_Predicate {

  public static void main(String[] args) {
    
    // lambda식
    Predicate<Integer> predicate = number -> number % 2 == 0; // 짝수 검사 비교 연산자
    System.out.println(predicate.test(10) ? "짝수" : "홀수");

    // predicate 매개 변수에 lambda식 전달
    // 파라미터 : number, 반환 값(predicate) : number >=0, 반환 값(int) : 7);  
    a(number -> number >= 0, 7);
  
  }
  
  public static void a(Predicate<Integer> predicate, int number) {
    System.out.println(predicate.test(number) ? "양수" : "음수");
  }

}
