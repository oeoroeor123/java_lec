package pkg09_abstract;

/**
 * 추상 클래스
 * 1. 추상 메소드를 가지고 있는 클래스이다.
 * 2. 클래스 앞에 abstract 키워드를 추가해야 한다.
 * 3. 특징
 *   1) 추상 클래스를 상속 받는 클래스들은 "반드시" 모든 추상 메소드를 오버라이드 해야 한다.
 *   2) 추상 클래스는 인스턴스를 생성할 수 없다. (new Animal() 불가)
 */
public abstract class Animal {

  /**
   * 추상 메소드
   * 1. 본문이 없는 메소드이다.
   * 2. 메소드 앞에 abstract 키워드를 추가해야 한다.
   */
  public abstract void move();
  
}
