package pkg05_upcasting;

public class UpcastingEx {

  public static void main(String[] args) {
    
    Tablet tab = new Tablet();
    tab.internet();
    tab.screenTouch();
    
    // 업캐스팅 : 부모 타입의 자식 인스턴스를 생성
    // 업캐스팅된 인스턴스는 부모 타입의 멤버만 호출 가능 (screenTouch 호출 불가)
    Computer computer = tab; // Computer computer = new Tablet();
    computer.internet();  // 컴퓨터 타입의 메소드만 호출 가능
    // computer.screenTouch();// 호출 불가
    
  
    // 업캐스팅 된 타입으로 배열 관리하기
    // 서로 다른 인스턴스를 하나의 타입(부모 타입)으로 관리할 수 있다.
    // 타입이 부모 타입임으로 부모 타입의 기능(인터넷)만 호출이 가능하다. (자식을 호출해도 인터넷만 실행됨)
    Computer[] ary = new Computer[5];
    ary[0] = new Computer();
    ary[1] = new Tablet();
    ary[2] = new Tablet();
    ary[3] = new Computer();
    ary[4] = new Tablet();
    
    for(Computer com : ary) {
      com.internet();
    }
    
  }

}
