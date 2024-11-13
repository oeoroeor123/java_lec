package pkg7_BankAccount;

public class BankAccount {

  private String accNo;
  private long balance;
  
  public BankAccount(String accNo, long balance) {
    this.accNo = accNo;
    this.balance = balance;
  }
  
  /**
   * 입금 처리
   * @param money 입금액
   * @exception 마이너스 금액 입금 불가
   */
  public void deposit (long money) {
    
    try {
      if(money < 0)
      throw new RuntimeException(money + "원은 입금할 수 없습니다.");
      balance += money;
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  /**
   * 출금 처리
   * @param money 출금액
   * @return 실제 출금액
   * @exception 마이너스 금액 출금 불가, 잔액보다 큰 금액 출금 불가
   */
  public long withdrawal(long money) {
    long value = 0L;
    try {
      if(money < 0)
       throw new RuntimeException(money + "원은 출금할 수 없습니다.");
      if(money > balance)
        throw new RuntimeException("잔액 부족");
      balance -= money;
      value = money;
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return value;
  }
    
    
  
  /**
   * 이체 처리
   * @param bankAccount 이체할 계좌 정보
   * @param money 이체할 금액
   */
  public void transfer(BankAccount bankAccount, long money) {
    long withdrawalMoney = this.withdrawal(money);
    bankAccount.deposit(withdrawalMoney);
    // 한 줄로 줄임 가능 == bankAccount.deposit(this.withdrawal(money));
  }
  
  /**
   * 계좌 조회, 계좌번호와 통장 잔액 출력
   */
  public void inquiry() {
    System.out.println("BankAccountNo : " + accNo);
    System.out.println("Balance : " + balance);
  }
  
  
  
}
