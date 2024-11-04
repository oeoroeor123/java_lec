package pkg03_casting;

public class CastingEx {

  public static void main(String[] args) {

    // 1. 자동 형 변환(묵시적 형 변환, Promotion)
    // 값의 도메인(값의 범위) 중 작은 타입이 큰 타입으로 변환되는 것
    // byte < short < int < long < float < double (값의 표현 범위 : 정수들에 비해 소수가 더 다양하고 자세하게 표현할 수 있음)
    int a = 10;
    long b = a;
    double c = b + 1.5; // 변수 b를 double 타입으로 변환한 뒤 1.5를 더하는 형태
    System.out.println(c);
    
    
    // 2. 강제 형 변환 (명시적 형 변환, Casting)
    // 어떤 타입으로든 강제로 형 변환 가능
    long x = 256L; // long > long, 변환 없음
    int y = (int)x; //long > int 변환 시, int가 더 작기 때문에 (int)를 붙여 강제로 변환해줌
    byte z = (byte)y; // int > byte 변환 시, byte가 더 작기 때문에 (byte)를 붙여 강제 변환
    System.out.println(y);
    System.out.println(z); // int > byte 변환 시, 4비트를 1비트로 바꾸는 과정에서 앞에 3비트 값을 모두 쳐내져서 값이 모두 없어짐 (결과 값이 0으로 출력)
    
    
  }

}
