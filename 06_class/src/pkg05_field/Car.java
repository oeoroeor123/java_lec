package pkg05_field;

/*
 * 필드
 * 1. 클래스에서 선언한 변수
 * 2. 일반 변수와 달리 자동 초기화가 진행된다. (0, false, null)
 * 3. 필드에는 초기화를 주지 않는다.
 * 4. 필드는 클래스 시작 부분에 작성한다.
 */

public class Car {
  
  int speed; // int speed = 0;
  int fuel; // int fuel = 0;
  final int LIMIT = 100; // 못바꾸는 필드 값 = 초기 할당 필수
  
  void accel() {
    if(fuel == 0)
      return; // 함수 종료
    fuel--; // 연료가 0이 아니면, 악셀 밟을때마다 연료가 떨어짐
    if(speed == LIMIT)
      return;
    speed++; // 최대 속력이 아니면, 악셀 밟을때마다 속도가 올라감
  }
  
  void brake() {
    if(speed == 0)
      return;
    speed--;
  }
  
  
  /* this. (현재 클래스에 있는 멤버를 호출할 때 사용)
  필드와 매개변수 이름이 동일할 때 필드 앞에 this를 붙여서 구분함
  this : gasStation 메소드를 호출한 인스턴스 = car
  fuel : car.fuel 필드
  */
  void gasStation(int fuel) {
   this.fuel += fuel;
  }
  
  // void gasStation(int fuel) {
  // this.fuel (car.fuel) += fuel(매개변수 fuel) ;
  // }
  
  void panel() {
    System.out.println("speed : " + speed + ", fuel : " + fuel);
  }

}
