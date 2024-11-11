package pkg04_override;

/*
 * 메소드 오버라이드
 * 1. 부모 클래스의 메소드를 자식 클래스가 다시 만드는 것을 의미한다.
 * 2. 동일한 메소드(반환타입, 메소드명, 매개변수)로 만들어야 한다.
 * 3. 오버라이드 할 때 @Override Annotation을 추가한다.
 *    1) 문법 검사를 수행한다. (부모 클래스 메소드와 오버라이드 메소드가 동일한 메소드가 맞는지 체크함)
 *    2) 오버라이드한 메소드임을 다른 개발자들에게 알린다.
 */
public class OverrideEx {

  public static void main(String[] args) {
    
    BlackCoffee black = new BlackCoffee();
    black.taste();
    // 부모(black)의 메소드가 호출된다.
    
    MixCoffee mix = new MixCoffee();
    mix.taste();
    // 오버라이드한 메소드가 호출된다.
    
    
  }
   
}
