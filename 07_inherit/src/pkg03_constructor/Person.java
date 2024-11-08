package pkg03_constructor;

public class Person {

  private String name;

  /* 
     디폴트 생성자
     디폴트 형식의 생성자는 처음에 만들어 두고 시작해야 함 (언제 값을 불러올지 모르기 때문에)
     다른 생성자가 존재하는 경우 디폴트 생성자는 자동으로 생성되지 않으므로 직접 만들어야 한다. (디폴트 생성자는 다른 생성자가 없으면 java가 자동 생성해줌)
   */
  public Person() {
    
  }
  
  // 생성자
  public Person(String name) {
    super();
    this.name = name;
  }

  // getter,setter 메소드
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
