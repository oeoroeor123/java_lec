package pkg03_compare;

public class CompareEx {

  public static void main(String[] args) {

    // 비교 연산
    int a = 10;
    int b = 20;
    System.out.println(a > b); // false
    System.out.println(a >= b); // false
    System.out.println(a < b); // true
    System.out.println(a <= b); // true
    System.out.println(a == b); // false
    System.out.println(a != b); // true
    
    
    // 문자열 비교 연산 > == 또는 != 연사자로 문자열을 비교하면 안된다. (문자열이 아닌 참조값을 비교함)
    
    /*
    String x = "hello";
    String y = "hello";
    
    동일한 값이여도 두개의 참조값이 만들어지는 것이 일반적이나, String의 경우
    x와 y를 동일한 문자열로 생각해 하나의 참조 값을 만들어 동작하는 형태라 결과가 true로 출력
    ※ hello를 비교한 것이 아닌 저장된 참조를 비교함
    ┌-------------┐
    | 0x12345678  | x
    |-------------|
    | 0x12345678  | y
    |-------------|
    |             |
    |-------------|
    |    hello    | 0x12345678
    |-------------|
    |             |
    └-------------┘
    */
    
    String x = "hello";
    String y = "hello";
    System.out.println(x == y); // true
  
    
  }

}
