package pkg9_BankAccount;

public class WithdrawalException extends BankAccountException {

  private static final long serialVersionUID = -1932156584314146391L;

  public WithdrawalException(String message, int code) {
    super(message, code);
  }
  
}
