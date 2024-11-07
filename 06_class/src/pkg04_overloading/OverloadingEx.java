package pkg04_overloading;

public class OverloadingEx {

  public static void main(String[] args) {
    
    // sample 타입의 인스턴스 s  생성
    Sample s = new Sample();
    
    // 메소드 호출 (선언부_선언이 sample쪽에서 이뤄짐 / 호출부 분리)
    s.printArray(new String[] {"아침", "점심", "저녁"});
    s.printArray(new int[] {10,20,30});
    
  }

}
