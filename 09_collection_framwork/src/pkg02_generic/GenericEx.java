package pkg02_generic;

public class GenericEx {

  public static void main(String[] args) {
   
   // 정수 저장 컨테이너
   Container<Integer> container1 = new Container<Integer>();
   container1.setItem(10);
   System.out.println(container1.getItem());

   
   // 실수 저장 컨데이터
   Container<Double> container2 = new Container<Double>();
   container2.setItem(10.5);
   System.out.println(container2.getItem());
  
   
   // 자동차 저장 컨테이너
   Container<Car> container3 = new Container<Car>();
   container3.setItem(new Car("kia", "aa"));
   System.out.println(container3.getItem().getBrand());
   System.out.println(container3.getItem().getModel());
   System.out.println(container3.getItem()); // to String 반환
 
  }

}
