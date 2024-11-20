package pkg03_Stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 인자 없는 생성자
@NoArgsConstructor

// 모든 인자가 들어있는 생성자
@AllArgsConstructor

@Getter

@Setter

@ToString

// 각 상세 코드를 보고 싶다면, window > showView > Outline
public class Fruit {    
  
    private String name;
    private int price;
    
    /* 
     * @NoArgsConstructor
       public Fruit() {
    }
    */

    
    /*
     * @AllArgsConstructor
      public Fruit(String name, int price) {
      super();
      this.name = name;
      this.price = price;
    }
     */
    
    
    /*
     * @Getter, Setter
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
     */

    
    /*
     * @ToString
    @Override
    public String toString() {
      return "Fruit [name=" + name + ", price=" + price + "]";
    }
    */
    
 

}
