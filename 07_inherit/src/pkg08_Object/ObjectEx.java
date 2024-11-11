package pkg08_Object;

public class ObjectEx {

  public static void main(String[] args) {

    // Object 타입의 인스턴스 car 생성 (up casting)
    Object car = new Car("benz", "E300"); 
    
    // 인스턴스 car를 Car 타입으로 변환 (down casting)
    if(car instanceof Car) { 
      System.out.println(((Car) car).getBrand()); 
    }
      
    if(car instanceof Car) {
      System.out.println(((Car) car).getModel());
    }

    
    // Car 타입의 인스턴스 car2 생성
    Car car2 = new Car("bmw", "520d");
    
    // 아래 두 코드는 동일하다.(.toString 기본 생략)
    System.out.println(car2);
    System.out.println(car2.toString());

  }

}
