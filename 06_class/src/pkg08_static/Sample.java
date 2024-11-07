package pkg08_static;

/*
 * 클래스 멤버 (클래스 메소드 / 클래스 필드)
 * 1. 메모리의 클래스 영역에 저장된다.
 * 2. 인스턴스의 생성이 없어도 접근할 수 있다.
 * 3. 멤버 앞에 static 키워드를 추가한다.
 * 4. 클래스로 호출한다. (단 인스턴스로 호출 할수도 있으나 권장하지 않는다.)
 * 5. 클래스 메소드는 오직 클래스 멤버만 호출해서 사용할 수 있다.
 *    (클래스 메소드는 인스턴스 멤버를 호출할 수 없다.)
 */

/*
 * 메모리 할당 순서
 * 
 *          영역 : 클래스 영역    -> 스택 영역            -> 힙 영역
 *          종류 : static            지역 변수               new 키워드로 생성하는 것(인스턴스, 배열)
 * 라이프 사이클 : 계속 유지         중괄호 벗어나면 소멸    Garbage Collector 가 소멸
 *               : item, methodB()                           item2, methodA()
 *                 (클래스 멤버)                             (인스턴스 멤버)
 */

public class Sample {
  
  static String item; // 클래스 멤버
  String item2; // 인스턴스 멤버 (필드에 static을 붙이지 않으면 전부 인스턴스 멤버)
  

  // 인스턴스 멤버
  public void methodA() {
    System.out.println("인스턴스 메소드 methodA");
    System.out.println(item);
    System.out.println(item2);
  }

  // 클래스 멤버
  public static void methodB() { // static은 클래스 메소드 앞에 (void는 메소드와 세트로 그 앞에 붙임)
    System.out.println("클래스 메소드 methodB");
    System.out.println(item);
    // System.out.println(item2); 클래스 메소드는 인스턴스 멤버인 item2를 사용할 수 없다.
  }
 
  
}
