package pkg03_Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * package java.util.stream
 * 
 * public interface Stream<T> {
 *   Stream<T> filter(Predicate<T> predicate); // Predicate(boolean 타입) 결과가 true인 데이터만 Stream으로 반환한다.
 *   Stream<R> map(Function<T,R> mapper); // Function 반환 결과를 Stream으로 반환한다.
 *   void forEach(Consumer<T> action); // forEach 메소드를 호출한 Stream의 모든 요소를 Consumer로 하나씩 전달한다.
 * }
 */

public class StreamEx {
  public static void a() throws Exception {
  
    // Stream 인스턴스 생성
    // 1. 직접적으로 값을 넣어 생성하는 방법
    Stream<String> s1 = Stream.of("사자","토끼","강아지");
    
    // 2. 배열을 스트림으로 반환하여 생성하는 방법 : Arrays.stream(배열 이름);
    String[] array = {"사과","바나나","딸기"}; 
    Stream<String> s2 = Arrays.stream(array);
    
    // 3. 리스트를 스트림으로 반환하여 생성하는 방법 : list.stream();
    List<String> list = Arrays.asList("한국","미국","일본");
    Stream<String> s3 = list.stream();
    
    // 4. 파일의 각 라인을 요소로 저장하고 있는 Stream 생성하는 방법
    File license = new File("C:\\Program Files\\Java\\jdk-17", "LICENSE");
    BufferedReader in = new BufferedReader(new FileReader(license));
    Stream<String> s4 = in.lines(); 
    
        
    // forEach 메소드 활용
    s1.forEach(animal -> {
      System.out.println(animal);
    });
    s2.forEach(fruit -> System.out.println(fruit));
    s3.forEach(nation -> System.out.println(nation));
    
    StringBuilder builder = new StringBuilder();
    s4.forEach(line -> builder.append(line).append("\n"));
    System.out.println(builder.toString());
    in.close();
    
    // 연습
    // File 인스턴스 생성
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");
    
    // 하위 디렉터리/파일을 모두 File 인스턴스로 가져오기 
    File[] files = javaHome.listFiles();
   
    // 파일 > 스트림으로 반환하여 출력하기
    Stream<File> s5 = Arrays.stream(files);
    s5.forEach(file -> System.out.println(file.getName())); // 파일의 이름만 출력

  }
  
  public static void b() {
    
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    // 리스트를 스트림으로 반환하여 생성
    numbers.stream()
      .filter(number -> number % 3 == 0) // Stream 요소 중 number % 3 == 0 결과가 true인 데이터 : 3의 배수(3,6,9)만 별도 Stream으로 반환
      .forEach(number -> System.out.println(number));
   
    
    List<Fruit> fruits = Arrays.asList(
        new Fruit("단감", 1000),
        new Fruit("사과", 2000),
        new Fruit("토마토", 3000)
        );
    
    fruits.stream()
    .filter(fruit -> fruit.getPrice() >= 2000)
    .forEach(fruit -> System.out.println(fruit));
    
    
    // 연습
    // File 인스턴스 생성
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");
    
    Arrays.stream(javaHome.listFiles())
      .filter(file -> file.isDirectory())
      .forEach(dir -> System.out.println(dir.getName()));
    
  }
  
  public static void c() {
    
    // 리스트 값들의 제곱 수 구하기
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    numbers.stream()
    .map(number -> number * number) // 각 int의 제곱 수 출력
    .forEach(number -> System.out.println(number));
    
    // 리스트 과일 중 일부 가격 올리기
    List<Fruit> fruits = Arrays.asList(
        new Fruit("단감", 1000),
        new Fruit("사과", 2000),
        new Fruit("토마토", 3000)
        );
    
    fruits.stream()
    .filter(fruit -> fruit.getName().equals("사과")) // 과일의 이름이 사과인 경우 반환
    .map(fruit -> new Fruit(fruit.getName(), fruit.getPrice() + 1000)) // 과일의 이름은 동일하고, 가격만 1000원 오름
    .forEach(fruit -> System.out.println(fruit));
    
    
    // javaHome의 이름 뒤에 폴더, 파일 추가해서 출력하기
    // File 인스턴스 생성
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");
    
    Arrays.stream(javaHome.listFiles())
    .map(item -> item.isDirectory() ? item.getName() + "폴더" : item.getName() + "파일")
    .forEach(item -> System.out.println(item));
   
  }
  
  public static void d() {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    // Mutable list
    List<Integer> evenNumbers = numbers.stream()
    .filter(number -> number % 2 == 0) // 짝수
    .collect(Collectors.toList()); // 리스트를 반환해준다.
    evenNumbers.add(12);
    
    // Immutable list
    List<Integer> oddNumbers = numbers.stream()
    .filter(number -> number % 2 == 1) // 홀수
    .toList(); // 리스트를 반환해준다.
    // oddNumbers.add(11); > 추가 불가
    
    
    evenNumbers.stream().forEach(number -> System.out.println(number));
    oddNumbers.stream().forEach(number -> System.out.println(number));
  }
  
  public static void main(String[] args) throws Exception {
    c();
    

  }

}
