package pkg01_Functional_Interface;

public class FuncEx {

  public static void main(String[] args) {
    
    // 익명 이너 타입
    // 인터페이스를 구현하는 클래스를 만들지 않고, 인터페이스 구현체가 반드시 해야 할 추상 메소드 오버라이드를 인스턴스 생성 시 작성하는 방법
    
    /*
    MyInterfaceA a = new MyInterfaceA() {
      
      @Override
      public void mathod() {
        System.out.println("hello world");
        
      }
    };
    */
        
    /*
     * lambda 표현식
     * 1. 익명 이너 타입 인스턴스 생성 시 사용할 수 있는 새로운 표현식
     * 2. 함수형 인터페이스 생성 시 사용할 수 있음
     * 3. 문법 
     *    public interface AA {void method(String param);}
     *    
     *    1)익명 이너 타입
     *    AA a = new AA() {
     *    @Override
     *    public void method(String param) {
     *    }
     *   };
     *    
     *    2)lambda (상황별로 특정 코드 생략 가능)
     *    AA a = (s) -> {
     *    
     *    }
     */
    
    // lambda 표현식 : 함수형 인터페이스가 필요할 때 사용한다.
    // 본문이 한 개인 경우, 중괄호 생략 가능
    MyInterfaceA a = () -> System.out.println("hello world");
    a.mathod();
    
    
    // lambda의 특징 : 매개변수의 타입은 생략 가능 (ex_String)
    //               : 매개변수가 한 개면 소괄호 생략 가능
    MyInterfaceB b = param -> System.out.println(param); 
    b.mathod("hello world");
    
    
    // lambda 특징 : 코드가 return만 있으면 중괄호, 리턴 키워드 생략 가능
    MyinterfaceC c = () -> "hello world";
    System.out.println(c.mathod());

  }

}
