package pkg01_is_a;

/*
   * 부모 자식 관계는 계속 이어진다. (개발자_부모, 웹개발자_자식)
  ┌--------------┐
  │    Person    │ 슈퍼 클래스
  │--------------│
  │     eat()    │
  │    sleep()   │
  └--------------┘
          ▲
          │
  ┌--------------┐
  │   Developer  │ 서브 클래스
  │--------------│
  │   develop()  │
  └--------------┘
          ▲
          │
  ┌--------------┐
  │ WebDeveloper │ 서브 클래스
  │--------------│
  │   deploy()   │
  └--------------┘
*/

public class WebDeveloper extends Developer {

  public void deploy() {
    System.out.println("서버에 배포한다.");
  }
  
}
