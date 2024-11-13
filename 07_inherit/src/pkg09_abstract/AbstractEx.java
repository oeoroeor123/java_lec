package pkg09_abstract;

public class AbstractEx {

  public static void main(String[] args) {
    
    // 추상 클래스의 인스턴스 생성은 불가능하다.
    // Animal animal = new Animal();
    
    Animal[] animals = new Animal[3];
    animals[0] = new Dog();
    animals[1] = new Eagle();
    animals[2] = new Shark();
    
    for(Animal animal : animals) {
      animal.move();
    }

  }

}