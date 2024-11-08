package pkg13_Cart;

import java.util.Arrays;

public class CartEx {

  public static void main(String[] args) {
    
    Cart cart = new Cart(5); // cart에 담을 물건 갯 수
    
    cart.addProduct(new Product("새우깡", 1000));
    cart.addProduct(new Product("tv", 10000));
    cart.addProduct(new Product("건조기", 10000));
    cart.addProduct(new Product("침대", 30000));
    cart.addProduct(new Product("드라이기", 5000));
    
    // 삭제 (모두 0인 이유 : 첫번째 물건이 삭제되면 두번째 물건이 1번으로 오기 때문)
    cart.removeProduct(0);
    cart.removeProduct(0);
    
    for(int i = 0; i < cart.getIdx(); i++) {
      System.out.println(cart.getProducts()[i].getName());
      System.out.println("  " + cart.getProducts()[i].getPrice());
    }   
    
  }

}
