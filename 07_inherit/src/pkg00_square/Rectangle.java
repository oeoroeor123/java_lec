package pkg00_square;

public class Rectangle {
  
  private int width;
  private int height;
  
  // 생성자
  public Rectangle(int width, int height) {
    super();
    this.width = width;
    this.height = height;
  }

  // 메소드 호출
  public int getArea() {
    return width * height;
  }

  
}
