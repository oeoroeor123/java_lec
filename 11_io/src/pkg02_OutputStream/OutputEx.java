package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputEx {

    /*  OutputStream
     *  각종 데이터를 서버 측으로 보낼때 사용
     *   byte 기반 스트림을 사용 (문자열 전송용으로는 부적합)
     */

  
  public static void a() {
    
    // 생성 모드 : 항상 새로 만드는 모드
    
    // 디렉터리 위치 정보 제공
    File dir = new File("\\storage"); // root : D드라이브 (코드가 위치한 곳) 생략 가능
    
    if(!dir.exists())
      dir.mkdirs();
    
    // 파일 생성
    File file = new File(dir, "sample.dat"); // parent : 경로 / child : 파일 이름
    
    // FileOutputStream (파일 출력 스트림) 인스턴스 선언
    // 선언부를 상단에 위치시킴으로써 out을 try/catch/finally에서 모두 사용할 수 있음
    FileOutputStream out = null; // 선언만
    
    try {
      
      // // FileOutputStream (파일 출력 스트림) 인스턴스 생성 : "파일 생성 시점" > 예외처리 필수(checked exception)
      out = new FileOutputStream(file);
      
      // 출력 : 데이터 내보내기 (단위 : int (데이터 1개 내보내기))
      int c = 'A'; // 'A' : char >> int에 저장 && A는 1바이트
      out.write(c);
      
      // 출력 : 여러 데이터 내보내기 (단위 : byte[] (데이터 n개 내보내기))
      // byte[] b = new byte[] {'p','p','l','e'}; > 배열 초기화
      byte[] b = "pple".getBytes(); // 문자열을 배열로 바꿔줌
      out.write(b);  
          
      
    } catch (FileNotFoundException e) { // 자식
      e.printStackTrace();
    } catch (IOException e) { // 부모
      e.printStackTrace();
    } finally { // 파일 출력 스트림의 종료, 예외 발생 여부와 상관 없이 스트림이 종료되도록 finally 블록에서 처리
      try {
       if(out != null) // out이 null이 아니면 출력 스트림 종료
        out.close();        
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void b() {
    
    // 추가 모드 : 없으면 만들고, 있으면 추가하는 모드
    File dir = new File("\\storage");
    
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir,"sample2.dat");
    
    FileOutputStream out = null; // null로 초기화
    
    try {
      
      out = new FileOutputStream(file, true); // 파일이 있으면 추가한다.
      
      int c = '안'; // 3바이트 한글은 잘라서 보내지기 때문에 글자 그대로 출력되지 않음
      out.write(c);
      
      byte[] b = "녕하세요".getBytes();
      out.write(b);
      
      
    } catch (IOException e) { // FileOutputException의 부모 클래스이므로 함께 처리 가능
      e.printStackTrace();
    } finally {
      try {
        if(out != null)
          out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void c() {
    
    // 입출력 성능 향상을 위해 함께 사용하는 보조 스트림 : BufferedOutputStream
    File dir = new File("\\storage");
    
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir,"sample3.dat");
    
    BufferedOutputStream out = null;
    
    try {
      
      // 메인 : new FileOutputStream(file)
      // 보조(버퍼를 이용해 출력 데이터를 모아서 한 번에 처리하므로 출력 속도가 향상된다.) : new BufferedOutputStream(메인(대상));
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      int c = '안';
      out.write(c);
      
      byte[] b = "녕하세요".getBytes(); // byte[]에 한글 저장 불가 (128을 넘기 때문)
      out.write(b);
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (out != null)
          out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void d() {
    
    // 변수 그대로 출력하는 스트림 : DataOutputStream
    File dir = new File("\\storage");
    
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "sample4.dat");
    
    DataOutputStream out = null;
    
    try {
      
      // 단독 사용 불가, 변수 출력을 위해 FileOutputStream 감싸주는 역할
      out = new DataOutputStream(new FileOutputStream(file));
      
      int age = 10;
      out.writeInt(age);
      
      double height = 150.0;
      out.writeDouble(height);
      
      char gender = '남';
      out.writeChar(gender);
      
      boolean isCute = true;
      out.writeBoolean(isCute);
      
      String name = "또치"; // 한글 출력 시, DataOutputStream > writeUTF 사용해서 출력 가능
      out.writeUTF(name);

      
    } catch (IOException e) {
     e.printStackTrace();
    } finally {
      try {
        if(out != null)
          out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void e() {
   
    // 인스턴스를 출력할 수 있는 스트림 : ObjectOutputStream
    File dir = new File("\\storage");
    
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir,"sample5.dat");
    
    ObjectOutputStream out = null;
    
    try {
      
      out = new ObjectOutputStream(new FileOutputStream(file));
      
      out.writeObject(new Car("genesis", "G90")); // 직렬화가 가능한 인스턴스를 출력 할 수 있다. (직렬화 작업은 class 파일에서 진행)
      out.writeObject(new Car("volvo","XC90"));
      out.writeObject(new Car("bmw","X7"));
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(out != null)
          out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  

  public static void main(String[] args) {
   e();
    

  }

}
