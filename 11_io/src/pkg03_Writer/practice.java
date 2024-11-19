package pkg03_Writer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class practice {

  public static void a() throws Exception {
   
    // 연습용
   String serviceKey = "%2FZxm9dlnOhsyB6NUKfQRbaWpMck2IE8QQhpQbXFY3qOu5oHWm0rvbhQZu8GuaVVNitdnOJlwfUy0i2oZOhDssw%3D%3D";
   
   StringBuilder builder = new StringBuilder();
   builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcs");
   builder.append("?serviceKey=").append(serviceKey);
   builder.append("&pageNo=").append(1);
   builder.append("&numOfRows=").append(1000);
   builder.append("base_date=").append(20241118);
   builder.append("base_time=").append(0600);
   builder.append("nx").append(55);
   builder.append("ny").append(127);
   
   URL url = new URL(builder.toString());
   HttpURLConnection conn = (HttpURLConnection)url.openConnection();
   
   BufferedReader in = null;
   if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
     in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
   } else {
     in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
   }
   
   StringBuilder responseBody = new StringBuilder();
   String line = null;
   while( (line = in.readLine()) != null ) {
     responseBody.append(line);
   }
   
   System.out.println(responseBody.toString());
   
   in.close();
   conn.disconnect();
   
       
    }
    
  
  public static void main(String[] args) throws Exception {
    a();
  }
}
