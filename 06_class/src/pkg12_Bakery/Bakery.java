package pkg12_Bakery;

public class Bakery {

  private int bread; // 빵의 갯 수
  private int price; // 빵의 가격
  private int money; // 자본금
  
  // 생성자
  public Bakery(int bread, int price, int money) {
    super();
    this.bread = bread;
    this.price = price;
    this.money = money;
  }

  // getter, setter 메소드
  public int getBread() {
    return bread;
  }


  public void setBread(int bread) {
    this.bread = bread;
  }


  public int getPrice() {
    return price;
  }


  public void setPrice(int price) {
    this.price = price;
  }


  public int getMoney() {
    return money;
  }


  public void setMoney(int money) {
    this.money = money;
  }
  
  /**
   *  판매처리
   * @param money 고객이 낸 돈
   * @param bread 고객이 사려는 빵의 갯 수
   * @return 판매할 빵의 갯수, 잔돈
   */
  // 판매할 빵이 부족한 상황
  public BreadNChange sell(int money, int bread) {
    if(this.bread < bread) {// this.bread : 빵집의 빵 갯수, bread : 고객이 사려는 빵 갯수
      System.out.println("빵이 부족해요.");
      return null; // 반환 없음 (아무것도 안준다.)
    }
    
    // 고객이 낸 돈이 부족한 상황
    if(money < bread * price) { // bread * price : 사려는 빵의 총 가격
      System.out.println("돈 더 주세요.");
      return null; 
    }
    
    // 판매 처리하기
    this.money += bread * price; // 자본금에 고객이 사려는 빵 가격만큼 더함
    this.bread -= bread; // 빵 갯수가 팔린 빵만큼 줄어듦 
    
    // 반환 (고객이 사가는 빵, 잔돈)
    // JAVA에서는 한번에 1개씩만 반환할 수 있어 BreadNChange 객체 생성 후 2가지를 함께 반환함
    return new BreadNChange(bread, money - bread * price);
    
  }
  
}
