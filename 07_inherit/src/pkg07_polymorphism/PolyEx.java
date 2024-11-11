package pkg07_polymorphism;

public class PolyEx {

  public static void main(String[] args) {
   
    Computer com = new Tablet(); // 업캐스팅
    
    com.internet();
    // 코드 작성 시, Computer의 screenTouch()를 호출 : 정적 바인딩 (static binding)
    // 실행 시, Tablet의 screenTouch()를 호출 : 동적 바인딩 (dynamix binding)
    com.screenTouch(); 
    
     
    // 다형성 : 하나의 코드로 여러 개의 실행을 수행할 수 있다.
    Computer[] computers = new Computer[3];
    computers[0] = new Tablet(); // 오버라이드 된 화면 터치
    computers[1] = new Computer(); // 화면 터치
    computers[2] = new Tablet(); // 오버라이드 된 화면 터치

    
    /* for (요소타입 변수명: 반복대상) {
    실행영역;
    }
    */
    for(Computer computer : computers) {
      computer.screenTouch(); // 하나의 메소드 호출이 2개 이상의 메소드와 연결이 되어 있음 (Computer (부모 메소드) / Tablet (오버라이드 된 자식 메소드))
    }
    
    
    
    
    
    
  }

}
