package pkg07_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  private List<Product> products;
  
  // 생성자
  public Cart() {
    products = new ArrayList<Product>();
  }
  
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  // 카드에 물건 담기
  public void addProduct(Product product) throws RuntimeException {
    
    if(product == null) {
      throw new RuntimeException("Cart에 담을 Product이 없습니다.");
    }
    
    products.add(product);   
  }
    
    public Product removeProduct(int removeIdx) throws RuntimeException {
      
      int size = products.size();
      
      if(size == 0) {
        throw new RuntimeException("Cart가 비어 있습니다.");
      }
      
      if(removeIdx < 0 || removeIdx >= size) {
        throw new RuntimeException("존재하지 않는 인덱스입니다.");
      }
      
      //remove(int index) 메소드는 삭제한 product를 반환한다.
      return products.remove(removeIdx);
      
  }  
    
}
