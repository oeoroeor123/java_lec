package pkg8_BankAccount;

public class BankAccountEx {

  public static void main(String[] args) {
    
    try {
      
      // BankAccount 타입의 인스턴스 2개 생성하기
      BankAccount myAcc = new BankAccount("010-0000-0000", 500_000);
      BankAccount momAcc = new BankAccount("010-1111-1111", 1_000_000);
      
      momAcc.transfer(myAcc, -10_000); // 마이너스 금액 이체 실패
      momAcc.transfer(myAcc, 10_000_000); // 잔액보다 큰 돈 이체 실패
      momAcc.transfer(myAcc, 100_000); // 엄마 계좌에서 내 계좌로 10만원 이체 (성공)
      momAcc.deposit(-1);
      
      myAcc.inquiry();
      momAcc.inquiry();
      
    } catch (Exception e) {
      System.out.println(e.getMessage()); // 한 번에 하나씩 예외처리하여 출력 (하나씩 주석 처리해서 확인 필요)
    }
  }

}
