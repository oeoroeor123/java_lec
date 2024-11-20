package pkg02_Functional_Interface;

import java.util.function.Function;

/*
 * package java.util.function
 * 
 * @FunctionalInterface Annotation
 * public interface Function<T,R> {
 *  R apply(T t); : T를 전달하면 R로 반환한다.
 * }
 */
public class Class03_Function {

  public static void main(String[] args) {
    
    // Lambda식
    Function<String, Integer> function = str -> Integer.parseInt(str); // str을 interger로 반환
    System.out.println(function.apply("10")); // 문자열 형태의 정수값 반환
    
    // Function 타입의 매개변수에 lambda식 전달
    // 파라미터 : name  -> 리턴(반환 값) : name + "님"
    a(name -> name + "님");

  }

  public static void a(Function<String, String> function) {
    System.out.println(function.apply("홍길동"));
  }
}
