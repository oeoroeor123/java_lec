package pkg03_constructor;

import java.util.Arrays;

public class ConstructorEx {

  public static void main(String[] args) {
    
    // 부모(Person)는 따로 부르지 않아도 됨
    
    // 자식(Developer) 호출 및 출력
    Developer developer1 = new Developer(new String[] {"자바", "파이썬"});
    developer1.setName("제임스"); // 부모의 name 메소드 호출
    System.out.println(developer1.getName());
    System.out.println(Arrays.toString(developer1.getSkills())); //skills 배열이 출력됨
    
    Developer developer2 = new Developer("엘버트", new String[] {"노드", "자바스크립트"});
    System.out.println(developer2.getName());
    System.out.println(Arrays.toString(developer2.getSkills()));
  }

}
