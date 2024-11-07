package pkg05_field;

public class FieldEx {

  public static void main(String[] args) {
    
    // car 타입의 인스턴스 car 생성
    Car car = new Car();
    
    // 주유
    car.gasStation(300);
    
    // 엑셀 200번 밟음
    for(int i = 0 ; i < 200; i++) {
      car.accel();
    }
    
    // 출력
    car.panel();
    
    for(int i = 0; i < 200; i++) {
      car.accel();
    }
    
    car.panel();
  }

}
