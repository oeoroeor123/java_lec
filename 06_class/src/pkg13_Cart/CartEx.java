package pkg13_Cart;

public class CartEx {

  public static void main(String[] args) {

    // 10000원을 가진 고객
    Customer customer = new Customer(10000);
    
    // 5개 물건 담을 수 있는 cart 생성
    Cart cart = new Cart(5);
    
    // 고객이 cart 를 가짐
    customer.setCart(cart);
    
    // 물건 넣기 
    customer.addToCart(new Product("맛동산", 3000));
    customer.addToCart(new Product("양파링", 2000));
    customer.addToCart(new Product("홈런볼", 5000));
    customer.addToCart(new Product("스윙칩", 1500));
    
    // 물건 빼기
    customer.removeFromCart(0);
    
    // 구매하면 영수증이 반환됨
    String receipt = customer.buy();
    
    // 영수증 확인
    System.out.println(receipt);
    
    // 고객 정보 확인
    System.out.println("고객이 가진 돈 : " + customer.getMoney() + "원");
    
    /*
    Cart cart = new Cart(5);
    
    cart.addProduct(new Product("새우깡", 1000));
    cart.addProduct(new Product("TV", 2000));
    cart.addProduct(new Product("컵", 3000));
    cart.addProduct(new Product("낙지", 4000));
    cart.addProduct(new Product("카메라", 5000));
    
    cart.removeProduct(0);
    cart.removeProduct(0);
    
    for(int i = 0; i < cart.getIdx(); i++) {
      System.out.println(cart.getProducts()[i].getName());
      System.out.println("  " + cart.getProducts()[i].getPrice());
    }
    */
    
  }

}
