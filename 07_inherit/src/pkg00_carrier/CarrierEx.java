package pkg00_carrier;

public class CarrierEx {

  public static void main(String[] args) {
    
    Cup cup1 = new Cup();
    cup1.setCoffee(new Espresso("에스프레소"));
    System.out.println(cup1.getCoffee().getName()); // 에스프레소
    
    Cup cup2 = new Cup();
    cup2.setCoffee(new Americano("아메리카노"));
    System.out.println(cup2.getCoffee().getName()); // 아메리카노

    Cup cup3 = new Cup();
    cup3.setCoffee(new CafeLatte("카페라떼"));
    System.out.println(cup3.getCoffee().getName()); // 카페라떼
    
    Carrier carrier = new Carrier(3); // coffee 3 종류 가능
    carrier.addCup(cup1);
    carrier.addCup(cup2);
    carrier.addCup(cup3);
    carrier.info(); // 에스프레소, 아메리카노, 카페라떼
    
    
  }

}
