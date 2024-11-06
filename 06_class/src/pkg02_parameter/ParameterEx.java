package pkg02_parameter;

public class ParameterEx {

  public static void main(String[] args) {
    
    // 클래스 sample 타입의 인스턴스 s 생성하기
    Sample s = new Sample();
    
    // methodA 호출 (인스턴스를 이용해서 호출)
    s.methodA();
    
    // methodB 호출 (문자열 인자를 호출 시 전달)
    s.methodB("Java");
    
    // methodC 호출 (매개변수 순서대로 전달)
    s.methodC("Java", 3);
    
    // methodD 호출 (Car 타입의 인스턴스 전달, String 타입의 도시 이름 전달)
    // 기본 양식 : Car car  = new Car();
    s.methodD(new Car(), "춘천");

    // methodE 호출 (배열 선언과 분리가 가능한 배열 초기화를 전달)
    // 기본 양식 : String[] items = new String[] {};
    s.methodE(new String[] {"샴푸","린스","바디워시"});

    
    // methodF 호출 (String 타입의 인자를 갯수를 달리하여 전달)
    s.methodF();
    s.methodF("김치찌개");
    s.methodF("순두부찌개", "된장찌개");
  
  }  
}
