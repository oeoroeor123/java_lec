package pkg02_substitute;

public class SubstituteEx {

  public static void main(String[] args) {
  
    // 대입 연산
    int a = 10;
    int b = 20;
    int temp;
    
    temp = a;
    a = b;
    b = temp;
    
    System.out.println(a); // 20
    System.out.println(b); // 10
    
    
    // 복합 대입 연산 (산술 연산과 대입 연산을 합친 연산)
    int x = 10;
    System.out.println(x += 10); // x에 10을 더해라 10 + 10 = 20
    System.out.println(x -= 10); // 위에서 x가 20으로 덮어씌어진 상태에서(20) - 10 = 10
  
  }

}
