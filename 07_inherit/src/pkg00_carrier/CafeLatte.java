package pkg00_carrier;

/*
  ┌-------------------┐
  │ Coffee            │ 슈퍼 클래스
  │-------------------│
  │ String name       │
  │ Coffee(String)    │
  │ getName()         │
  │ setName(String)   │
  └-------------------┘
            ▲
  ┌-------------------┐
  │ Espresso          │ 서브 클래스
  │-------------------│
  │ Espresso(String)  │
  └-------------------┘
            ▲
  ┌-------------------┐
  │ CafeLatte         │ 서브 클래스
  │-------------------│
  │ CafeLatte(String) │
  └-------------------┘
*/

public class CafeLatte extends Espresso {
  
  public CafeLatte(String CafeLatteName) {
    super (CafeLatteName);
  }

}
