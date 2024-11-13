package pkg10_interface.C_marker;

public class Person {

  /*
  public void eat(Food food) {  // 모든 Food 받기
    food.eat();
  }
  */
  
  public void eat(Eatable food) {  // 먹을 수 있는 것만 받기
    ((Food) food).eat();
  }
  
}
