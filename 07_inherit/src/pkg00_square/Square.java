package pkg00_square;

/*
┌---------------------┐
│ Rectangle           │ 슈퍼 클래스
│---------------------│
│ width               │
│ height              │
│ Rectangle(int, int) │
│ getArea()           │
└---------------------┘
        ▲
        │
┌--------------┐
│ Square       │ 서브 클래스
│--------------│
│ Square(int)  │
└--------------┘
*/

public class Square extends Rectangle {

  
 public Square(int side) { 
   super(side, side); // 부모 생성자 호출 (값이 하나기때문에 1개 side로 호출)
 }
 

}
