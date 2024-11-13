package pkg10_interface.C_marker;

public class Kimchi implements Food, Eatable {

  @Override
  public void eat() {
    System.out.println("잘라 먹는다.");
  }

}
