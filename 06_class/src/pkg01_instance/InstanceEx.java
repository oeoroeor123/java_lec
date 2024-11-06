package pkg01_instance;

public class InstanceEx {

  public static void main(String[] args) {
    
    // 클래스 car 타입의 객체(인스턴스) 사용
    
    // 클래스 car 타입의 객체를 선언 : 클래스 = 참조 타입
    Car myCar;
    
    // 객체 생성 (생성 된 객체 = 인스턴스)
    myCar = new Car();
    
    // 인스턴스가 가지고 있는 멤버 사용하기 (인스턴스.멤버)
    myCar.speed = 50;
    myCar.drive(); // 메소드 호출
    
    // 하나의 클래스를 이용해 여러개의 인스턴스를 생성할 수 있다.
    Car momCar = new Car();
    momCar.drive();
    
    
  }

}
