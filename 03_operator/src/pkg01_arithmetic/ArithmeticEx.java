package pkg01_arithmetic;

public class ArithmeticEx {

  public static void main(String[] args) {
    
    // 원하는 값이 정수/실수인지에 따라 다르게 코드를 입력
    // 정수와 실수가 함께 짜여진 경우, 정수가 실수로 자동 변환되어 계산됨 (자동 형 변환)
    
    // 정수 연산 
    int a = 5;
    int b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b); // int 정수끼리 연산했기 때문에 2.5가 아닌 정수 2로 출력 (몫 나누는 용도로 사용)
    System.out.println(a % b); // 나눈 결과 중 나머지
    
    
    // 실수 연산
    double c = 5;
    double d = 2;
    System.out.println(c + d);
    System.out.println(c - d);
    System.out.println(c * d);
    System.out.println(c / d); // 올바른 나누기 값 출력
    System.out.println(c % d);
    
    
    // 증감 연산
    int x = 10;
    System.out.println(x++); // 10 (x 출력 후 증가)
    System.out.println(++x); // 12 (x 증가 후 출력)
    
    
    // 감수 연산
    int y = 10;
    System.out.println(y--); // 10 (y 출력 후 감소)
    System.out.println(--y); // 8 (y 감소 후 출력)
    
    
  }

}
