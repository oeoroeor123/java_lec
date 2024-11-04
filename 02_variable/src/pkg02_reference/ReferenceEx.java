package pkg02_reference;

public class ReferenceEx {

  public static void main(String[] args) {

    // Reference Type (참조 타입)
    // Type 타입 8가지를 제외한 모든 타입
    // 모든 클래스는 참조 타입
    
    // String 클래스 : 주소 값 (참조 값)을 저장하는 대표 참조 타입, 문자열 저장 시 사용함 (큰따옴표 활용)
    String s = "Hello World"; // s가 가지고 있는 값 = Hello World의 참조 값인데, 실제론 문자열을 출력해 보여줌
    System.out.println(s);
    System.out.println(System.identityHashCode(s)); // 참조 값 보는 방법 (실제로 사용하진 x)

    
    //ReferenceEx 클래스 타입(참조 값 체크용)
    ReferenceEx x = new ReferenceEx();
    System.out.println(x);
  }

}
