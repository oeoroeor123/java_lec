package pkg10_interface.C_marker;

public class MarkerEx {
  
  public static void main(String[] args) {

    Kimchi kimchi = new Kimchi();
    Hamburger hamburger = new Hamburger();
    Sashimi sashimi = new Sashimi();
    
    Person person = new Person();
    person.eat(kimchi);
    person.eat(hamburger);
    // person.eat(sashimi);  컴파일 오류 발생

  }

}
