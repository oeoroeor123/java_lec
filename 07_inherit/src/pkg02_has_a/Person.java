package pkg02_has_a;

/*
  ┌--------------┐
  │      Pen     │ 슈퍼 클래스
  │--------------│
  │   drawing()  │
  └--------------┘
          ▲
          │
  ┌--------------┐
  │    Person    │ 서브 클래스
  │--------------│
  │     eat()    │
  │    sleep()   │
  └--------------┘
*/

public class Person extends Pen {

  public void eat() {
    System.out.println("먹는다.");
  }
  
  public void sleep() {
    System.out.println("잔다.");
  }
  
}
