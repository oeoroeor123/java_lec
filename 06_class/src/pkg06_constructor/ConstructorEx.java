package pkg06_constructor;

public class ConstructorEx {

  public static void main(String[] args) {
 
    // Sample 타입에 인스턴스 s 생성
    Sample s = new Sample();
    // 필드의 자동초기화 값 0 출력
    System.out.println(s.number);
    
    
    // Sample 타입의 인스턴스 s2 생성 (인자 값 전달)
    Sample s2 = new Sample(10);
    System.out.println(s2.number);
    
    
    // Sample 타입의 인스턴스 s3 생성 (인자 값 문자열로 전달)
    Sample s3 = new Sample("20");
    System.out.println(s3.number);
    
    
    // Sample 타입의 인스턴스 s4 생성 (인자 값 실수로 전달)
    Sample s4 = new Sample(1.5);
    System.out.println(s4.number); // 1
  }

}
