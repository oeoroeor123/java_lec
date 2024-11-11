package pkg06_downcasting;

public class DowncastingEx {

  public static void main(String[] args) {
   
    // 서로 다른 인스턴스를 하나의 배열로 관리하기
    Computer[] ary = new Computer[3];
    
    ary[0] = new Tablet(); // 인터넷 화면 터치
    ary[1] = new Computer(); // 인터넷
    ary[2] = new Tablet(); // 인터넷 화면 터치
    
   
    /* for (요소타입 변수명: 반복대상) {
    실행영역;
    }
    */
    for(Computer com : ary) { 
      com.internet();

      
    // Tablet 인스턴스는 screenTouch() 메소드를 호출할 수 있어야 한다.
    // Tablet 인스턴스는 Tablet 타입으로 바꾼다. (Computer 타입에서 screenTouch 메소드를 호출 할 수 없으니 Tablet 타입으로 바꿔준다.)
    if(com instanceof Tablet) {
      ((Tablet) com).screenTouch();
    }
  }
  }

}
