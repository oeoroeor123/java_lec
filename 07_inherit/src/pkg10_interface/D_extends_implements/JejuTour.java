package pkg10_interface.D_extends_implements;

/**
 * 클래스 상속과 인터페이스 구현을 동시에 할 수 있다.
 * 상속 먼저 하고, 나중에 구현한다.
 */

public class JejuTour extends Domestic implements Travel {

  @Override
  public void food() {
    System.out.println("성게 비빔밥");
  }
  
  @Override
  public void sightseeing() {
    System.out.println("한라산");
  }
  
  public static void main(String[] args) {
    
    JejuTour tour = new JejuTour();
    tour.food();
    tour.sightseeing();
    
  }
  
}
