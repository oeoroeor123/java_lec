package pkg11_Fighter;

public class FigtherEx {

  public static void main(String[] args) {
   
    // Fighter 타입의 인스턴스 fighter1, fighter2 생성
    Fighter fighter1 = new Fighter("김동현", 100);
    Fighter fighter2 = new Fighter("정찬성", 100);
    
    // turn 
    boolean myTurn = true; // fighter1
    while(fighter1.isAlive() && fighter2.isAlive()) {
      if(myTurn) {
        fighter1.punch(fighter2, (int)(Math.random() * 10 + 1)); // 정수 1 ~ 10 사이의 랜덤 값
      } else {
        fighter2.punch(fighter1, (int)(Math.random() * 10 + 1) );
      }
      myTurn = !myTurn; // 상태를 바꿔주는 부정 연산 (때리는 차례가 계속 바뀜)
    }
    
    // result
    if(fighter1.isAlive()) {
      System.out.println(fighter1.getName() + "victory !");
    } else {
      System.out.println(fighter2.getName() + "victory !");
    }
    
    
  }

}
