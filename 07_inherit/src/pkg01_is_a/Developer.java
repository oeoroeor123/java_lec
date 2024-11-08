package pkg01_is_a;

/*
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
*/

public class Developer extends Person {

 public void develop() {
   System.out.println("개발한다.");
 }
 
}
