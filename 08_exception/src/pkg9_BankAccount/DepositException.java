package pkg9_BankAccount;

public class DepositException extends BankAccountException {
  
  private static final long serialVersionUID = 5781568621358113931L;

  public DepositException(String message, int code) {
    super(message, code);
  }
  
}
