package pkg03_casting;

public class CastingEx {

  public static void main(String[] args) {

    // 1. 자동 형 변환(묵시적 형 변환, Promotion)
    // 값의 도메인(값의 범위)이 작은 타입에서 큰 타입으로 변환되는 것
    // byte < short < int < long < float < double (값의 표현 범위 > 정수들에 비해 소수가 더 자세하게 표현할 수 있음)
    int a = 10;
    long b = a;
    double c = b + 1.5; // 변수 b를 double 타입으로 변환한 뒤 1.5를 더하는 형태
    System.out.println(c);
    
    // 2. 
  }

}
