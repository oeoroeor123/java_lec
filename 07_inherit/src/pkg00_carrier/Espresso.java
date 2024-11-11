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
*/

public class Espresso extends Coffee {

  public Espresso(String EspressoName) {
    super(EspressoName);
  }
}
