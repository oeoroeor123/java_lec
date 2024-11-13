package pkg04_throws;

public class Calculator {

  public int add(String a, String b) {
    int result = 0;
    try {      
      result = Integer.parseInt(a) + Integer.parseInt(b);
    } catch (Exception e) {
      e.printStackTrace();  // 개발용 코드 (예외 발생 추적)
    }
    return result;
  }
  
  public int subtract(String a, String b) {
    int result = 0;
    try {      
      result = Integer.parseInt(a) - Integer.parseInt(b);
    } catch (Exception e) {
      e.printStackTrace();  // 개발용 코드 (예외 발생 추적)
    }
    return result;
  }
  
  public int multiply(String a, String b) {
    int result = 0;
    try {      
      result = Integer.parseInt(a) * Integer.parseInt(b);
    } catch (Exception e) {
      e.printStackTrace();  // 개발용 코드 (예외 발생 추적)
    }
    return result;
  }
  
  public int quotient(String a, String b) {
    int result = 0;
    try {      
      result = Integer.parseInt(a) / Integer.parseInt(b);
    } catch (Exception e) {
      e.printStackTrace();  // 개발용 코드 (예외 발생 추적)
    }
    return result;
  }
  
  public int modular(String a, String b) {
    int result = 0;
    try {      
      result = Integer.parseInt(a) % Integer.parseInt(b);
    } catch (Exception e) {
      e.printStackTrace();  // 개발용 코드 (예외 발생 추적)
    }
    return result;
  }
  
}
