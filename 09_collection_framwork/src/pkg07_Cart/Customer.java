package pkg07_Cart;

import java.util.List;

public class Customer {

  private int money;
  private Cart cart;
  
  public Customer() {
  
  }
  
  public Customer(int money) {
    super();
    this.money = money;
  }
  
  public int getMoney() {
    return money;
  }
  
  public void setMoney(int money) {
    this.money = money;
  }
  
  public Cart getCart() {
    return cart;
  }
  
  public void setCart(Cart cart) {
    this.cart = cart;
  }
  
  public void addToCart(Product product) {
    cart.addProduct(product);
  }
  
  public void removeFromCart(int removeIdx) {
    cart.removeProduct(removeIdx);
  }
  
  
  // 구매
  // 반환 : 영수증
  public String buy() throws RuntimeException {
    
    String receipt = "영수증\n";
    
    int total = 0;
    
    List<Product> products = cart.getProducts();
    
    for(int i = 0, count = products.size(); i < count; i++) {

      // cart에서 뺀 물건 1개
      Product product = products.get(i);
      
      // 총 구매액에 누적
      total += product.getPrice();
      
      // 구매 가능 여부 체크
      if(money < total) {
        throw new RuntimeException("구매 금액이 부족합니다.");
      }
      
       // 영수증 만들기 추가
       receipt += "총 구매액......" + total + "\n";
    }  
       
       // 구매
       money -= total;   

    return receipt;
    
  }
}
