package pkg03_constructor;

public class Developer extends Person {

  private String[] skills;

  // 생성자 (자식 생성자를 만들때, 가장 먼저 부모 생성자(super 생성자)를 불러야 함)
  public Developer(String[] skills) {
    super(); // 생략 가능 (디폴트) > public Person() { } 생성자 호출
    this.skills = skills;
  }
  
  public Developer(String name, String[] skills) {
    super(name); // public Person(String name) { } 생성자 호출
    this.skills = skills;
  }

  //getter, setter 메소드
  public String[] getSkills() {
    return skills;
  }

  public void setSkills(String[] skills) {
    this.skills = skills;
  }
  
}
