package pkg05_upcasting;

/*
  ┌---------------┐
  │ Computer      │ 슈퍼 클래스
  │---------------│
  │ internet()    │
  └---------------┘
          ▲
          │
  ┌---------------┐
  │ Tablet        │ 서브 클래스
  │---------------│
  │ screenTouch() │
  └---------------┘
*/

public class Tablet extends Computer {

  public void screenTouch() {
    System.out.println("화면 터치");
  }
  
  
  
  
  
}
