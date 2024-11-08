package pkg11_Fighter;

public class Fighter {

  // field
  private String name;
  private int hp;
  
  // constructor (생성자)
  public Fighter(String name, int hp) {
    super();
    // 매개변수 값을 필드 값으로 채워줌
    this.name = name;
    this.hp = hp;
  }
  
  // getter / setter 메소드
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
  
   public boolean isAlive() {
     return hp > 0;
   }
   
   public void punch(Fighter other, int power) {
     System.out.println(name + "의 펀치 공격");
     if(power > other.hp) {
       other.hp = 0; // hp가 -가 될 수 없으니 내 power가 더 쎄면 0으로 조정
     } else {
       other.hp -= power;
     }
     System.out.println("  " + name + "의 hp : " + hp);
     System.out.println("  " + other.name + "의 hp : " + other.hp);
   }
   
  
}
