package pkg10_interface.A_overview;

/*
 * 클래스 상속 vs 인터페이스 구현
 * 
 *    클래스        인터페이스
 * 1. 상속한다.     구현한다.
 * 2. extends       implements
 * 3. 자식 클래스   구현 클래스
 */

public class Circle implements Shape {
  
  private double radius;
  
  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  @Override
  public double getCircum() {
    return 2 * Math.PI * radius;
  }
  
  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

}
