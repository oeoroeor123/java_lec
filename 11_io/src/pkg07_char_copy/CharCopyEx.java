package pkg07_char_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharCopyEx {

  public static void a() {
    
    File origin = new File("C:\\Program Files\\Java\\jdk-17","LICENSE");
    File copy = new File("\\storage", origin.getName());
    
    try(BufferedReader in = new BufferedReader(new FileReader(origin));
        BufferedWriter out = new BufferedWriter(new FileWriter(copy))) {
      
     // FileReader 클래스의 read(char[]) 메소드 활용
     /*
     char[] cbuf = new char[2];
     int readChar = 0;
     while ( (readChar = in.read(cbuf)) != -1 ) {
       out.write(cbuf, 0, readChar);
     }
     */   
     
    // BufferedReader 클래스의 readLine() 메소드 활용
    String line = null;
    
    while( (line = in.readLine()) != null ) {
      out.write(line + "\n");
    }
 
    System.out.println(copy.getPath() + "파일 복사 완료");
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }

    
  public static void main(String[] args) {
    a();
    
    }
  }
