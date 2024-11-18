package pkg04_InputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import pkg02_OutputStream.Car;

public class InputEx {

  public static void a() {
    
    // 1 바이트씩 데이터 읽기
    
    // FileInputStream : 파일 정보 읽는 스트림
    // BufferedInputStream : 입력 속도 향상을 위한 스트림
    
    File file = new File("\\storage", "sample.dat");
    
    BufferedInputStream in = null; // 선언
    
    try {
      
      in = new BufferedInputStream(new FileInputStream(file));
      
      // 읽을 단위 : int 변수로 1 바이트씩 읽는다. (int 4 바이트 중 3 바이트는 비워두고 1 바이트씩만 사용)
      int c;
      
      // 읽은 데이터를 보관할 배열 : 파일의 크기만큼 배열 길이를 맞춘다.
      // long 타입을 int 타입으로 casting
      byte[] b = new byte[(int)file.length()];
      
      // 인덱스 초기화
      int i = 0;
      
      // 파일의 종료까지 계속 읽기 : read() 메소드는 읽은 내용을 반환하거나, 파일이 종료( = 더이상 읽을 것이 없으면)되면 -1을 반환한다.
      while( (c = in.read()) != -1 ) {
        b[i++] = (byte)c;

      }
      
      // 확인
      System.out.println(new String(b));
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(in != null)
        in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    
  }
  
  
  public static void b() {
    
    // n 바이트씩 데이터 읽기
    
  File file = new File("\\storage", "sample2.dat");
    
    BufferedInputStream in = null; // 선언
    
    try {
      
      in = new BufferedInputStream(new FileInputStream(file));
      
      // 읽을 단위 : byte[] 배열로 n 바이트씩 읽는다.
      byte[] b = new byte[4];
      
      // 읽은 데이터를 보관할 배열 : 파일의 크기만큼 배열 길이를 맞춘다.
      byte[] bytes = new byte[(int)file.length()];
      
      // 인덱스 초기화
      int i = 0;
      
      // 파일의 종료까지 계속 읽기 : read(byte[]) 메소드는 읽은 내용을 인자에 저장하고, 읽은 바이트 수를 반환한다. 파일이 종료( = 더이상 읽을 것이 없으면)되면 -1을 반환한다.
      // b : 읽을 내용, readbyte : 읽은 내용의 바이트 수
      int readbyte = 0;
      while( (readbyte = in.read(b)) != -1 ) {
        System.arraycopy(b, 0, bytes, i, readbyte);
        i += readbyte; // 읽어들인만큼 i가 증가
      }
      
      // 확인
      System.out.println(new String(bytes));
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(in != null)
        in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
      
  }
  
  public static void c() {
    
    // 변수 읽어들이기
    File file = new File("\\storage", "sample4.dat");
    
    //DatainputStream : 변수를 읽는 스트림
    DataInputStream in = null;
    
    try {
      
      in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
      
      // 파일에 저장된 변수는 순서대로 읽어야 한다.
      int age = in.readInt();
      
      double height = in.readDouble();
      
      char gender = in.readChar();
      
      boolean isCute = in.readBoolean();
      
      String name = in.readUTF();  // DataInputStream > readUTF : 한글 읽어들이기 위해 사용
      
      System.out.println(age);
      System.out.println(height);
      System.out.println(gender);
      System.out.println(isCute);
      System.out.println(name);
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(in != null)
          in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void d() {

    File file = new File("\\storage","sample5.dat");
    
    // ObjectInputStream : 객체를 읽는 스트림
    ObjectInputStream in = null;
    
    // Car 인스턴스를 저장할 list 생성 (컬렉션 프레임워크 사용)
    List<Car> cars = new ArrayList<Car>();
        
    try {
      
      in = new ObjectInputStream(new FileInputStream(file));
      
      /*
       * 인스턴스 읽기 : readObject() 읽은 인스턴스를 반환하거나, 파일이 끝나면 EOFException을 발생시킨다.
          object를 car로 다운캐스팅 : object(최상위클래스)
          Car = pkg02_OutputStream의 car를 import하여 사용
      */
      
      // EOFException 예외 발생 전까지 무한 루프 돌리기
      while(true) {
        Car car = (Car)in.readObject();
        
        // 읽은 인스턴스 list에 저장
        cars.add(car);
      }
      
    } catch (EOFException e) { // IOException의 자식으로, 위에 배치함
      
      // list 확인
      for(int i = 0, size = cars.size(); i < size; i++) {
        System.out.println(cars.get(i));
      }
   
    } catch (IOException | ClassNotFoundException e) { // ClassNotFoundException : Car class 가져와야 하기 때문에 | 붙여서 함께 사용함
      e.printStackTrace();
      
    } finally { 
      try {
        if(in != null)
          in.close();
      } catch (IOException e) { // close는 IOException만 사용하기에 1개만 작성
        e.printStackTrace();
      }
    }
    
  }
  

  public static void main(String[] args) {
  d();
    

  }

}
