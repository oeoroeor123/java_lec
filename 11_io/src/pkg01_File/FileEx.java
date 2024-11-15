package pkg01_File;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Java.io.File 클래스
 * 1. 디렉터리/파일의 정보(이름, 경로, 크기, 최종 수정일 등)를 확인할 수 있다.
 * 2. 디렉터리/파일을 만들거나 삭제할 수 있다.
 */

/* 
 * 디렉터리/파일 경로 작성
 * 
 * 1. 경로 구분자 (Separator)
 *  1) windows : \\
 *  2) linux : /
 *  3) max : /
 *  4) File.separator 필드를 사용하면 플랫폼에 따라서 자동으로 경로 구분자를 넣어준다.
 *  
 * 2. 디렉터리
 *  1) 현재 디렉터리 : .
 *  2) 상위 디렉터리 : ..
 *  3) 홈 디렉터리 : ~ > linux에서 사용
 *  4) 루트 디렉터리 : / > linux에서 사용
 */

public class FileEx {

  public static void a() {
   
    // 디렉터리 생성
    
    // File 인스턴스 생성 (디렉터리 경로와 이름을 작성해야 함)
    File dir = new File("D:\\storage");
    
    // 디렉터리가 없으면 생성하기
    if(!dir.exists()) { // dir 파일이 없으면
      dir.mkdirs(); // 파일 만들기
    }
    
    // 확인
    System.out.println(dir.getName() + " 디렉터리가 생성되었습니다.");
    
  }
  
  
  public static void b() {
    
    // 디렉터리 삭제
    // 비어있는 디렉터리(폴더)만 삭제할 수 있다.
    
    // File 인스턴스 생성
    File dir = new File("D:\\storage");
    
    // 디렉터리가 있으면 삭제하기
    if(dir.exists()) {
      dir.delete(); // JVM이 실행 중이어도 삭제한다. (바로 삭제)
     //dir.deleteOnExit(); //JVM이 종료되면 삭제한다.
    
      // 확인
    System.out.println(dir.exists() ? "삭제 실패" : "삭제 성공");
    }
    }
  
  
    public static void c() {
      
      // 디렉터리/파일 정보 확인
      
      // File 인스턴스 생성
      File javaHome = new File("C:\\Program Files\\Java\\jdk-17");
      
      // 하위 디렉터리/파일을 모두 File 인스턴스로 가져오기 
      File[] files = javaHome.listFiles();
      
      // for 문
      for(File file : files) {
        StringBuilder builder = new StringBuilder();
        
        // 이름
        // %-20s : 왼쪽 정렬 20자 맞추기
        // Math.min(file.getName().length(), 20) : 내 글자 수 또는 20글자에 맞추기
        builder.append(String.format("%-20s", file.getName().substring(0, Math.min(file.getName().length(), 20))));
        
        // 수정한 날짜
        long lastModified = file.lastModified();
        builder.append(String.format("%-30s", new SimpleDateFormat("yyyy-MM-dd- a h:mm").format(lastModified)));
        
        // 유형
        builder.append(String.format("%-10s", file.isFile() ? "파일" : "파일 폴더")); // 유형이 파일이면 ? 파일 : 파일 폴더
        
        // 크기
        long size = file.isDirectory()? 0 : file.length(); // 파일이 폴더라면 ? 0 반환 (반환 x) : 파일 길이 반환 == 파일만 길이를 반환해라.
        if(size != 0) {
          long kbSize = (long)Math.ceil(size / 1024.0); // ceil이 double 타입을 반환해야해 long에 저장 못함, 앞에 (long)으로 맞춰서 저장하기.
        builder.append(String.format("%10s",new DecimalFormat("#,##0").format(kbSize)) + "KB"); // #,##0 : 1,000 단위 구분 기호
        }
        
        // 출력
        System.out.println(builder.toString());
      }
    
    }
    
    
    public static void d() {
      
      // 오늘 날짜 이름의 폴더 만들기
      // 인스턴스의 생성 없이 날짜를 구할 수 있음
      String pathname = "D:\\" + DateTimeFormatter.ofPattern("yyyy\\MM\\dd").format(LocalDate.now()); // LocalDate.now() : 오늘 날짜

      File dir = new File(pathname);
      
      if(!dir.exists())
        dir.mkdirs();
      
    }
    
    
    public static void e(String pathname) {
      
      /* D:\\2024\\11\\15 디렉터리 삭제하기
       * 비어있는 폴더만 삭제 가능하기에 하나씩 순차적으로 재귀호출(자기 자신을 호출)하여 삭제 처리
       * D:\\2024\\11\\15 삭제 > e("D:\\2024\\11\\15");
       * D:\\2024\\11     삭제 > e("D:\\2024\\11");
       * D:\\2024         삭제 > e("D:\\2024");
       *                  삭제 > e("D:"); 종료시점 (상위 디렉터리가 없으면 종료)
       */
      
      File dir = new File(pathname);
      File parent = dir.getParentFile(); 
      
      if(parent == null) // 부모가 더이상 없으면 함수 종료
        return;
      
      System.out.println(dir.getPath() + " 디렉터리를 삭제합니다.");
      dir.delete();
      
      e(dir.getParent()); // 자신을 지우고 상위 디렉터리(부모) 전달
      
    }
    
  
  public static void main(String[] args) {
    e("D:\\2024\\11\\15");

  }

}
