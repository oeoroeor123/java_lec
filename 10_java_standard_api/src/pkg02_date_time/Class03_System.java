package pkg02_date_time;

import java.text.SimpleDateFormat;

public class Class03_System {

  public static void main(String[] args) {
    
    // 1. 현재 timestamp 가져오기
    long timestamp = System.currentTimeMillis();
    System.out.println(timestamp);
    
    SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss.SSS");
    System.out.println(sdf.format(timestamp));
       
    
    // 2. 특정 시간을 nano 초 단위로 가져오기
    // 2개의 시간을 가져와서 차이를 구할 때 사용한다.
    long start = System.nanoTime();
    System.out.println("hello world");
    long end = System.nanoTime();
    System.out.println(end - start + "ns");

    // 성능 테스트 (String, StringBuilder의 문자열 연결 시간 테스트)
    a();
    b();
  }
  
  public static void a() {
    
    // String 클래스와 + 연산자 : 문자 배열 한글자씩 (char[]) letters에 저장
    char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    
    String result = "";
   
    long begin = System.nanoTime();
    for(int i = 0; i < letters.length; i++) {
      result += letters[i];
    }
    
    long end = System.nanoTime();
    
    System.out.println(result);
    System.out.println("String 클래스와 + 연산자 : " + (end-begin) + "ns");
  }
  
public static void b() {
    
    // StringBuilder 클래스와  append 메소드
    char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    
    StringBuilder builder = new StringBuilder();
    long begin = System.nanoTime();
    for(int i = 0; i < letters.length; i++) {
      builder.append(letters[i]);
    }
    long end = System.nanoTime();
    
    String result = builder.toString();
    System.out.println(result);
    System.out.println("String 클래스와 + 연산자 : " + (end-begin) + "ns");
      
    
    }
      }