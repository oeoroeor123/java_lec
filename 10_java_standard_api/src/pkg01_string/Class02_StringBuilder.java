package pkg01_string;

public class Class02_StringBuilder {

  /*
   *         | StringBuffer    | StringBuilder
   * --------|-----------------|--------------
   *  since  | JDK 1.0         | JDK 1.5
   *  thread | multiple thread | single thread
   *  speed  | slow            | fast
   */
  
  public static void main(String[] args) {
    
    // StringBuilder 객체 생성
    StringBuilder builder = new StringBuilder();
    StringBuilder builder2 = new StringBuilder();
    
    // 문자열 추가하기 > 문자를 새로 만드는 것이 아닌 값을 계속 쌓아줌
    // += String의 성능 문제로 StringBuilder를 사용함
    builder.append("바");
    builder.append("나");
    builder.append("나");

    // String 객체로 바꾸기 > StringBuilder는 String이 아니기 때문에 바꿔줘야 함
    // 1. new String(builder)
    // 2. builder.toString()
    String result = builder.toString();
    System.out.println(result);
    
  }

}
