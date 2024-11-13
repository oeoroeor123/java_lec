package pkg01_try_catch;

public class TryCatchEx {

  /**
   * 예외 처리하기
   * 1. 발생하는 예외를 직접 처리한다.
   * 2. 예외가 발생할 수 있는 부분을 try 블록에 작성한다.
   * 3. 발생한 예외를 처리하는 부분을 catch 블록에 작성한다.
   */
  public static void a() {
    
    // 일반 코드를 try 블록에 작성한다.
    try {
    
      String userInput = "백만원";
      
      int number = Integer.parseInt(userInput);
      System.out.println(number);
    
    }
    // 예외 처리 코드를 catch 블록에 작성한다.
    catch(NumberFormatException e) {
      
      System.out.println("정수만 변환할 수 있습니다.");
      
    }
    
  }
  
  public static void b() {
    
    // 다중 catch 블록 : 자식 클래스 타입을 위에 배치해 예외 처리를 먼저해야 한다.
    
    try {
      
      String[] userInputs = {"10", "20", "삼십", "40"};
      
      for(int i = 0; i <= userInputs.length; i++) {
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
      }
      
    } catch(NumberFormatException e) {
      System.out.println("정수만 변환할 수 있습니다.");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("사용할 수 없는 인덱스가 존재합니다.");
    } catch(RuntimeException e) {
      System.out.println("실행 중 알 수 없는 예외가 발생했습니다.");
    }
    
  }
  
  public static void c() {
    
    try {
      
      String[] userInputs = {"10", "20", "30", "40"};
      
      for(int i = 0; i <= userInputs.length; i++) {
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
      }
      
    } catch (Exception e) {  // 모든 예외를 처리할 수 있는 Exception 클래스
      
      // 예외 메시지 : 예외가 발생한 이유가 텍스트로 작성되어 있다.
      String message = e.getMessage();
      
      // 예외 클래스 : 예외 클래스가 저장되어 있다.
      String exception = e.getClass().getName();
      
      System.out.println(message);
      System.out.println(exception);
      
    }
    
  }
  
  public static void main(String[] args) {
    c();
  }

}
