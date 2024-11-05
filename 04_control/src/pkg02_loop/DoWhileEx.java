package pkg02_loop;

public class DoWhileEx {

  public static void main(String[] args) {
    
    // DoWhile 문 : 최초 1번은 반드시 수행되는 while 문
    
    int a = 10;
    do {
      System.out.println(a); // 일단 a를 출력함 (10)
    } while(a < 10); // 조건에 맞지 않으니 종료
  }
  
}
