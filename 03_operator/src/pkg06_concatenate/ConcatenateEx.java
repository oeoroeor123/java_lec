package pkg06_concatenate;

public class ConcatenateEx {

  public static void main(String[] args) {
    
    // 문자열 연결 연산
    System.out.println(1 + "살");
    System.out.println(1 + 1 + "살");
    System.out.println("1" + "1" + "살");
    
    int a = 10;
    String str = a + ""; // 변수 a를 문자열로 변환
    System.out.println(str); // "10"
    
    String addr = "서울특별시";
    addr += " 강남구";
    addr += " 테헤란로";
    System.out.println(addr);
  }

}
