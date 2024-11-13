package pkg10_interface.C_marker;

public class Hamburger implements Food, Eatable {

  @Override
  public void eat() {
    System.out.println("입 크게 벌리고 먹는다.");
  }

}
