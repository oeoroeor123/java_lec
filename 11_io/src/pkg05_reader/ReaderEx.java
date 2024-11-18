package pkg05_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderEx {

  public static void a() {
    
     
    File file = new File("\\storage","a.txt");
    
    
    try (FileReader in = new FileReader(file)){
      
      // 읽을 단위 : 2 글자씩 읽기 
      char[] cbuf = new char[2];
      
      // 읽은 데이터를 저장할 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // 실제로 읽은 글자 수
      int readChar = 0;
      
      // read(char[]) : 읽은 글자들은 인자에 저장하고, 읽은 글자 수를 반환한다. 파일이 끝나면( = 더이상 읽을 것이 없으면) -1을 반환한다.
      while( (readChar = in.read(cbuf)) != -1) {
        builder.append(cbuf, 0, readChar);
        // builder.append(cbuf); > 2글자씩 읽으며, 직 전 배열 위치에 하'세'가 들어가 있어, 세가 한번 더 출력됨
      }

      // 확인
      System.out.println(builder.toString());
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  
  public static void b() {
    
    File file = new File("\\storage","b.html");
    
    try(BufferedReader in = new BufferedReader(new FileReader(file))) {
      
      // 읽을 단위 : String
      String line = null;
      
      // 읽은 데이터 저장할 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // readLine() : BufferedReader 클래스에서만 지원하는 메소드, 읽은 라인을 스트링으로 반환하며, 파일이 끝나면 null을 반환한다.
     while( (line = in.readLine()) != null ) {
       builder.append(line);
     }
      
      System.out.println(builder.toString()); // 줄바꿈은 포함되지 않음
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
 
  public static void c() {
    File file = new File("\\storage", "c.html");
    
    // 바이트 입력 스트림(FileInputStream)을 문자 입력 스트림(BufferedReader)으로 바꾸는 스트림
    try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
 
      // 읽을 단위 : String
      String line = null;
      
      // 읽은 데이터 저장할 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // readLine() : BufferedReader 클래스에서만 지원하는 메소드, 읽은 라인을 스트링으로 반환하며, 파일이 끝나면 null을 반환한다.
     while( (line = in.readLine()) != null ) {
       builder.append(line);
     }
      
      System.out.println(builder.toString()); // 줄바꿈은 포함되지 않음
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  
  public static void main(String[] args) {
    a();
    

  }

}
