package pkg04_throws;

public class Computer {

  /*
   * 예외 회피
   * 1. 예외를 처리하지 않는 방법이다.
   * 2. 메소드를 호출하는 곳으로 예외를 던지는 방식이다. (호출하는 곳에서 예외 처리를 해야 한다.)
   * 3. 형식
   *   반환타입 메소드명(매개변수) throws 예외클래스1, 예외클래스2, ... {
   *   
   *   }
   * 4. Unchecked Exception 의 경우 throws 문을 생략할 수 있다.
   */
  
  public int add(String a, String b) throws NumberFormatException {  // throws NumberFormatException 생략 가능
    return Integer.parseInt(a) + Integer.parseInt(b);
  }
  
  public int subtract(String a, String b) throws NumberFormatException {
    return Integer.parseInt(a) - Integer.parseInt(b);
  }
  
  public int multiply(String a, String b) throws NumberFormatException {
    return Integer.parseInt(a) * Integer.parseInt(b);
  }
  
  public int quotient(String a, String b) throws NumberFormatException, ArithmeticException {
    return Integer.parseInt(a) / Integer.parseInt(b);
  }
  
  public int modular(String a, String b) throws NumberFormatException, ArithmeticException {
    return Integer.parseInt(a) % Integer.parseInt(b);
  }
  
}
