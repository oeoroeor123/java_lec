package pkg03_HttpURLConnection;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IOStreamEx {

  public static void a() {
    
    try {
      
      // byte 스트림 이용해 다운로드 구현하기
      URL url = new URL("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
      HttpURLConnection conn = (HttpURLConnection)url.openConnection();
      
      // 1. 구글 로고 이미지 읽어들이기
      BufferedInputStream in = null; // 속도 향상
      
      if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        in = new BufferedInputStream(conn.getInputStream());
      } else {
        in = new BufferedInputStream(conn.getErrorStream());
      }
       
      File dir = new File ("\\storage");
      
      if(!dir.exists())
        dir.mkdirs();
        
      File file = new File(dir, "google-logo.png");
      
      // 2. 구글 로고 이미지 출력
      BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
      
      byte[] b = new byte[1024]; // 1kb씩 읽기
      
      int readbyte; // 실제로 읽어들인 데이터
      
      while ( (readbyte = in.read(b)) != -1 ) {
        out.write(b, 0, readbyte); // b 배열 0부터 읽어들인만큼만 출력
      }
      
      // 마무리
      in.close();
      out.close();
      conn.disconnect();
           
    } catch (IOException e) {
     e.printStackTrace();
    }
  }
  
  public static void b() {
    
    // char 스트림 이용하기
    try {
      
      URL url = new URL("https://www.naver.com/");
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      
      BufferedReader in = null;
      
      if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      } else {
        in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
      }
      
      // 파일로 보내 내용 확인하기
      File file = new File ("\\storage", "naver.html");
      
      // 출력
      BufferedWriter out = new BufferedWriter(new FileWriter(file));
      
      String line = null;
      while( (line = in.readLine()) != null ) 
      out.write(line + "\n");
      
      out.close();
      in.close();
      conn.disconnect();

      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
    
    
  }

  
  public static void main(String[] args) {
    b();

  }
}
