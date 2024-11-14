package pkg07_Cart;

public class CartEx {

  public static void main(String[] args) {
    
    try {
      
      // 10000원 가진 고객
      Customer customer = new Customer(10000);
      
      // 기본 10개의 물건 담을 수 있는 cart 생성
      Cart cart = new Cart();
      
      // 고객이 cart를 가짐
      customer.setCart(cart);
      
      // 물건 넣기
      customer.addToCart(new Product("맛동산", 3000));
      customer.addToCart(new Product("양파링", 2000));
      customer.addToCart(new Product("홈런볼", 5000));
      customer.addToCart(new Product("스윙칩", 1500));
      
      // 물건 빼기
      customer.removeFromCart(0);
      
      // 영수증 반환
      String receipt = customer.buy();
      
      // 영수증 확인
      System.out.println(receipt);
      
      // 고객 정보 확인
      System.out.println("고객이 가진 돈 : " + customer.getMoney() + "원");
      
    } catch (Exception e) {
     System.out.println(e.getMessage());
    }
    
    
  }

}
