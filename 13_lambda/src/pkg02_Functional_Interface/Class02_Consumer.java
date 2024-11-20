package pkg02_Functional_Interface;

import java.util.function.Consumer;

/*
   * package java.util.function
   * 
   * @FunctionalInterface Annotation
   * public interface Consumer<T> {
   *  void accept(T t);
   * }
   */

public class Class02_Consumer {

  public static void main(String[] args) {
    
    // lambda 표현식 : Consumer (소비자) 
    Consumer<String> consumer = t -> System.out.println(t);
    consumer.accept("hello world");    
        
    
    // Consumer 타입의 매개변수로 Lambda식 전달
    a(number -> System.out.println(number)); // 10 : 인자 값, number : 파라미터 값
  
  }
  
  public static void a(Consumer<Integer> consumer) {
    consumer.accept(10); // 10 : 인자 값, number : 파라미터
    
  }

}
