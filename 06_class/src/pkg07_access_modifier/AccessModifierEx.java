package pkg07_access_modifier;

public class AccessModifierEx {

  public static void main(String[] args) {
    
    // Sample 타입의 인스턴스 s 생성
    Sample s = new Sample();
    
    // s.item = "데이터"; 직접 접근x, setter 메소드로 간접적으로 데이터 저장
    s.setItem("데이터");
    
    // System.out.println(s.item); 직접 필드 값 꺼내보기 x, getter 메소드로 데이터 반환
    System.out.println(s.getItem());
    
    
    
  }

}
