package pkg06_custom_exception;

public class CustomEx {

  public static void main(String[] args) {
   
    try {
      
      throw new MyException("예외메시지", 1000);
      
      
    } catch (MyException e) { // 받는 클래스 이름 명시 (MyException)
      
      System.out.println(e.getMessage());
      System.out.println(e.getCode());
    }
    
  }

}
