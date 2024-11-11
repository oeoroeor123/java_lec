package pkg04_override;

public class MixCoffee extends BlackCoffee {

  @Override // 메소드 오버라이드 (기능을 다시 만든다.)
  public void taste() {
    System.out.println("믹스커피맛");
  }
  
}
