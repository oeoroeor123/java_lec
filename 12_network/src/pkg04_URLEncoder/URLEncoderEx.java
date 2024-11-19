package pkg04_URLEncoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderEx {

  public static void main(String[] args) {
   
    try {
      
      String url = "https://www.google.com:9090?id=abc&no=100";
      
      // 인코딩 (암호화) : 주소를 만들때, 인코딩 된 데이터로 만들어서 보내줘야 함
      String encoded = URLEncoder.encode(url, "UTF-8");
      System.out.println(encoded);
            
      // 디코딩 (복호화)
      String decoded = URLDecoder.decode(url, "UTF-8");
      System.out.println(decoded);

    } catch (UnsupportedEncodingException e) { // 인코딩 실패 예외 처리
      e.printStackTrace();
    }

  }

}
