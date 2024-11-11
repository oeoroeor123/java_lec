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
*/

public class Coffee {

  private String name;
  
  public Coffee(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
