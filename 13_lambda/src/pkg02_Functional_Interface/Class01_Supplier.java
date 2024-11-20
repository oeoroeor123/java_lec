package pkg02_Functional_Interface;

import java.util.function.Supplier;

/* package java.util.function;
 * 
 * @FunctionalInterface Annotation
 * public interface Supplier <T> {
 *  T get();
 * }
 */

public class Class01_Supplier {

  public static void main(String[] args) {
   
    // lambda 표현식
    // Supplier (공급자) : 반환 타입은 뭐든지 될 수 있음, (반환 타입 제네릭 타입 <>으로 지정 가능)
    
    Supplier<String> supplier = () -> "hello world"; // return과 중괄호 생략
    System.out.println(supplier.get());
    
    
    // 타입이 Supplier인 매개변수로 Lambda식 전달
    a(() -> 10);
  }
  
  public static void a(Supplier<Integer> supplier) { 
    System.out.println(supplier.get());   
  }

}
