package pkg01_is_a;

/* 상속
 * 1. 부모 클래스가 가진 기능 (메소드)을 자식 클래스가 자신의 것처럼 사용할 수 있다.
 * 2. 다중 상속(부모를 여러가지 두는 상속)은 불가능하다.
 * 3. 상속의 문법
 *    class 자식 extends 부모 { }
 */

public class IsaEx {

  public static void main(String[] args) {
    
    Developer developer = new Developer();
    developer.eat();
    developer.sleep();
    developer.develop();
    
    WebDeveloper webDeveloper = new WebDeveloper();
    webDeveloper.eat();
    webDeveloper.sleep();
    webDeveloper.develop();
    webDeveloper.deploy(); // webDeveloper가 가지고 있는 메소드
    
    
  }

}
