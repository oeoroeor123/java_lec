package pkg08_static;

public class StaticEx {

  public static void main(String[] args) {
    
    // Sample 타입의 인스턴스 s 생성하기
    Sample s = new Sample();
    
    // 클래스 필드 호출 (클래스이름.필드)
    System.out.println(Sample.item);
   
    // 인스턴스 메소드 호출 (인스턴스 생성 후 호출)
    s.methodA();
    
    // 클래스 메소드 호출 (클래스 이름으로 호출)
    Sample.methodB();
    // s.methodB(); 인스턴스 호출은 권장하지 않는다.
    

  }

}
