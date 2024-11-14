package pkg06_Bakery;

import java.util.Map;

public class Customer {

  private int bread; // 구매한 빵의 갯 수
  private int money; // 고객이 가진 돈
  
  // 생성자
  public Customer(int bread, int money) {
    super();
    this.bread = bread;
    this.money = money;
  }
  
  // getter, setter 메소드
  public int getBread() {
    return bread;
  }

  public void setBread(int bread) {
    this.bread = bread;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  /**
   * 구매 처리
   * @param bakery 구매할 빵집
   * @param bread 구매하려는 빵의 갯 수
   * @param money 구매할 때 낼 돈
   * @exception 구매할 돈이 부족할 경우
   */
  public void buy(Bakery bakery, int bread, int money) {
    
    try {
      // 가진 돈 보다 더 많은 돈을 내려고 하는 상황
      if(this.money < money) { // 구매할 때 낼 돈 < 내가 가진 돈
       throw new RuntimeException("내가 가진 돈이 부족합니다.(" + (money - this.money) + "원 부족)");
      }
      
      // 구매 처리 (구매 == 빵집의 판매, 빵집의 판매 결과를 받는 것이 곧 구매)
      Map<String, Integer> breadNChange = null;
      if(bakery != null) // bakery가 null이 아니면 (bakery가 있으면)
        breadNChange = bakery.sell(money, bread); // 나에게 잔돈과 빵을 돌려줄 것이다.
      
      // 구매 결과 확인
      if(breadNChange != null) { // 구매 성공 (빵집이 있거나, 빵집에서 퇴짜 맞지 않았을 경우)
        this.bread += breadNChange.get("bread"); // 잔돈과 빵 중에서 빵만 빼기
        this.money -= (money - breadNChange.get("change")); // 구매할 때 낸 돈 - 잔돈 = 실제 빵 가격
      }
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    
  }
  
}
