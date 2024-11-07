package pkg06_constructor;

/*
 생성자 (Constructor)
 1. 인스턴스를 생성할 때 호출하는 특별한 메소드이다.
 2. new 키워드와 함께 사용된다.
 3. 특징
  1) 이름이 클래스와 동일하다.
  2) 반환 타입이 존재하지 않는다. (void도 아님, 아예 없음)
  3) 매개 변수는 일반 메소드처럼 존재한다. (생성자의 오버로딩이 가능)  
 */

public class Sample {
  
  int number;

  // (디폴트 형식의) 생성자
  // 생성자가 없는 경우에만 자동으로 생성되는 생성자
  Sample() {
   
  }
  
  // 매개 변수가 있는 생성자
  // 인스턴스 생성 시 필드에 값을 지정하고 싶을때 사용
  Sample(int number) {
    this.number = number;
  }

  // 매개 변수가 있는 생성자
  Sample(String number) {
    // 방법 1)
    // this.number = Integer.parseInt(number);
    
    // 방법 2) this() : 다른 생성자 호출
    // Sample(int number) 생성자를 호출함
    this(Integer.parseInt(number)); // 숫자로 변환되어 20 출력
  }
  
  // 매개 변수가 있는 생성자 (실수 > 정수로 변경)
  Sample(double number) {
    // 방법 1)
    // this.number = (int)number; > double에서 int로 강제 형 변환
    
    // 방법 2) Sample(int number) 생성자를 호출함
    this((int)number);
  }
  
}
