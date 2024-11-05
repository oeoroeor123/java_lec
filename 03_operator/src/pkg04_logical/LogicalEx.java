package pkg04_logical;

public class LogicalEx {

  public static void main(String[] args) {
 
    // 논리 연산
    // 1. 논리 AND : &&
    // 2. 논리 OR : ||
    // 3. 논리 NOT : !
    
    int a = 10;
    int b = 10;
    
    System.out.println(a > 0 && b > 0);
    System.out.println(a > 0 || b > 0);  
    System.out.println(!(a > 0)); // () 안에 있는 내용을 먼저 처리하도록 설정
    
    // 숏 서킷
    int x = 10;
    System.out.println(x < 0 && ++x == 0); // &&는 앞 결과에서 false가 발생하면 더 이상 연산을 진행하지 않음
    System.out.println(x > 0 || ++x == 1); // ||는 true가 발생하면 더 이상 연산을 진행하지 않음
    System.out.println(x); // 증가하지 않고 그대로 10으로 출력
    

  }

}
