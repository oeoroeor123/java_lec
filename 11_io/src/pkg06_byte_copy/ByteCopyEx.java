package pkg06_byte_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCopyEx {

  public static void main(String[] args) {
    
    // ByteCopyEx = Byte (모든 파일), 파일 복사 시 주로 사용하면 됨
    File readFile = new File("D:\\dev_lec\\tools","eclipse-jee-2023-09-R-win32-x86_64.zip");
    File writeFile = new File("\\storage", readFile.getName());
    
    BufferedInputStream in = null;
    BufferedOutputStream out = null;
    
    try {
      
      in = new BufferedInputStream(new FileInputStream(readFile));
      out = new BufferedOutputStream(new FileOutputStream(writeFile));
      
      // 복사 시간 계산 (시작)
      long begin = System.currentTimeMillis();
      
      /*
      1 바이트씩 읽어들이기
      int c;
      while ( (c = in.read()) != -1 ) {
        out.write(c);
      }
      */
      
    
      // 4 바이트씩 읽어들이기 (시간 단축)
      byte[] b = new byte[4];
      
      int readbyte = 0;
      
      while ( (readbyte = in.read(b)) != -1 ) {
        out.write(b, 0, readbyte);
      }
           
      // 복사 시간 계산 (끝)
      long end = System.currentTimeMillis();
      
      System.out.println(writeFile.getPath() + "파일이 복사되었습니다.");
      System.out.println("복사 시간 : " + (end - begin) + "ms");
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        
        if(in != null)
          in.close();
        
        if(out != null)
          out.close();
        
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
}
