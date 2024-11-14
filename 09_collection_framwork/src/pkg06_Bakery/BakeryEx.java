package pkg06_Bakery;

public class BakeryEx {

  public static void main(String[] args) {
    
    Customer customer = new Customer(0, 10000);
    
    Bakery bakery1 = new Bakery(100, 1000, 10000); // 빵 갯수, 빵 가격, 자본금
    Bakery bakery2 = new Bakery(50, 3000, 10000);
    
    customer.buy(bakery1, 3, 10000); // 고객이 첫번째 빵집에서 빵를 3개 사고, 만원을 냄 (잔돈 7000)
    customer.buy(bakery2, 3, 7000); // 구매 실패 ("돈 더 주세요.")
    customer.buy(bakery2, 2, 10000); // 구매 실패 ("내가 가진 돈이 부족하다.") > 7000원 가지고 있는데, 10000원 내려고 함
    customer.buy(bakery2, 2, 7000); // 구매 성공 (빵 가격이 총 6000원)
    
    // 각 빵집과 고객의 현재 상황 출력
    System.out.println(bakery1.getBread() + "," + bakery1.getMoney()); // 빵 97개, 자본금 13000원 
    System.out.println(bakery2.getBread() + "," + bakery2.getMoney()); // 빵 48개, 자본금 16000원
    System.out.println(customer.getBread() + "," + customer.getMoney()); // 빵 5개, 가진 돈 1000원
    
 
    
  }
}
