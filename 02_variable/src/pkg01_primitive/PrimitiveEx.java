package pkg01_primitive;

public class PrimitiveEx {

  public static void main(String[] args) {

    // Primitive Type (기본 타입)
    
    // 1. byte : 1바이트(= 8bit // -128 ~ 127) 정수 저장용 타입
    byte a; // 값 할당 전 변수 a 에는 쓰레기(Garbage)가 저장되어 있음
    a = 127;
    System.out.println(a);
    
    // 2. short : 2바이트 정수 저장용 타입 / 사용 안함
    short b = 32767;
    System.out.println(b);
    
    // 3. int(integer) : 4바이트 정수 저장용 타입 / 정수의 기본 타입
    int c = 2147483647;
    System.out.println(c);
    
    // 4. long : 8바이트 정수 저장용 타입 / int 로 커버 불가능한 값에서 사용
    long d = 2147483648L; // long 타입의 값은 마지막에 L(l) 을 추가 > int 범위를 벗어난 값은 필수, 아니면 생략 가능하나 보통 L을 모두 붙임
    System.out.println(d);
    
    // 5. float(floating point) : 4바이트 실수 저장용 타입 / 사용 안함
    float e = 1.11111111F; // float 타입의 값은 마지막에 F(f)를 추가
    System.out.println(e);

    // 6. double : 8바이트 실수 저장용 타입 - 실수의 기본 타입
    double f = 1.11111111;
    System.out.println(f);
    
    // 7. char (character): 2바이트 단일 문자 저장용 타입 > ASCII 코드(1바이트), 유니코드(2바이트)
    char g = '홍'; // 작은 따옴표, 영문/한글 모두 가능
    System.out.println(g);
    
    // 8. boolean :  이론상 1비트 (실제는 JVM이 담당) true/false 저장
    boolean h = true;
    System.out.println(h);    
    
    
    // 변수 스코프(scope)
    // 변수가 선언된 중괄호 {} 내부에서만 접근이 가능 - 지역 변수
    { 
      int x = 10;
      System.out.println(x);
    }
    // x = 20; 중괄호 밖에서 지정할 수 없음
    
    // 상수(constant variable)
    // 할당된 값을 바꿀 수 없음, 반드시 초기 할당이 필요함
    // final 키워드를 변수 선언 시 추가함, 관례상 변수 명은 대문자로 작성함
    final double PI = 3.14;
    System.out.println(PI);
    
    
  }
}
