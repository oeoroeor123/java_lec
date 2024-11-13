package pkg10_interface.A_overview;

public class OverviewEx {

  public static void main(String[] args) {
    
    Shape rect = new Rectangle(1.5, 2.4);
    System.out.println(rect.getCircum());
    System.out.println(rect.getArea());
    
    Shape circle = new Circle(3.4);
    System.out.println(circle.getCircum());
    System.out.println(circle.getArea());

  }

}
