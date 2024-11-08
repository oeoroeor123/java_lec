package pkg13_Cart;

public class Product {

  private String name;
  private int price;
  
  // 생성자
  public Product() {
    
  }
  
  public Product(String name, int price) {
    super();
    this.name = name;
    this.price = price;
  }
  
  // getter, setter 메소드
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
}
